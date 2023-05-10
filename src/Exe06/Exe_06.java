package Exe06;
import java.util.ArrayList;
import java.util.Scanner;

public class Exe_06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Atleta atleta1 = new Atleta("João Ramos", "Corrida", "Portugal", 1.70, 70);
        Atleta atleta2 = new Atleta("Tânia Santos", "Natação", "Brasil", 1.65, 60 );
        Atleta atleta3 = new Atleta("Carlos Cenas", "Salto em Altura", "Espanha", 1.9, 80.2);


        ArrayList<Atleta> atletaArrayList = new ArrayList<>();

        Competicao competicao = new Competicao(atletaArrayList, "Olimpeidas", "Malásia");


        competicao.adicionarAtleta(atleta1);
        competicao.adicionarAtleta(atleta2);
        competicao.adicionarAtleta(atleta3);

        competicao.listarAtletas();

    }
}
