package Exe05;

import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private int idade;
    private String email;
    private int telemovel;

    public Pessoa(String nome, int idade, String email, int telemovel) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.telemovel = telemovel;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }

    public int getTelemovel() {
        return telemovel;
    }
}

class Agenda {
    private ArrayList<Pessoa> pessoas;

    public Agenda() {
        pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }

    public void listarPessoas() {
        for (Pessoa pessoa : pessoas) {
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());
            System.out.println("Email: " + pessoa.getEmail());
            System.out.println("Telefone: " + pessoa.getTelemovel());
            System.out.println("-----------------------");
        }
    }
}
