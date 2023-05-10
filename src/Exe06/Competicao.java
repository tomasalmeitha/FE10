package Exe06;


import java.util.ArrayList;

public class Competicao {

    private String nome, pais;
    private ArrayList<Atleta> atletas;


    public Competicao(ArrayList<Atleta> atletas, String nome, String pais) {
        this.nome = nome;
        this.pais = pais;
        this.atletas = atletas;
    }

    public void adicionarAtleta(Atleta atleta) {
        atletas.add(atleta);
    }

    public void listarAtletas() {

        System.out.println("Nome: " + this.nome);
        System.out.println("País: " + this.pais);
        System.out.println("-----------------------");
        System.out.println("Atletas participantes:");

        for (Atleta atleta : atletas) {
            System.out.println("Nome: " + atleta.getNome());
            System.out.println("Modalidade: " + atleta.getModalidade());
            System.out.println("País de Origem: " + atleta.getOrigem());
            System.out.println("Altura: " + atleta.getAltura());
            System.out.println("Peso: " + atleta.getPeso());
            System.out.println("-----------------------");
        }
    }
}
