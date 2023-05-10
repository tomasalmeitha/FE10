package Exe05;
import java.util.ArrayList;
import java.util.Scanner;
public class Exe_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Pessoa vitor = new Pessoa("Vitor Santos", 23, "vitorsantos@gmail.com", 911233344);
        Pessoa helder = new Pessoa("Helder Pinto", 37, "helderpinto@gmail.com", 911233446);
        Pessoa bruno = new Pessoa("Bruno Santos", 38, "brunosantos@gmail.com", 911233555);


        ArrayList<Pessoa> pessoaArrayList = new ArrayList<>();

        Agenda agenda = new Agenda(pessoaArrayList);


        agenda.adicionarPessoa(vitor);
        agenda.adicionarPessoa(helder);
        agenda.adicionarPessoa(bruno);

        agenda.listarPessoas();

//        ArrayList<Pessoa> pessoaArrayList = new ArrayList<Pessoa>();
//        pessoaArrayList.add(br)
    }
}
