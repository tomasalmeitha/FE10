package Exe05;
import java.util.Scanner;
public class Exe_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Pessoa vitor = new Pessoa("Vitor Santos", "vitorsantos@gmail.com", 23, 911233344);
        Pessoa helder = new Pessoa("Helder Pinto", "helderpinto@gmail.com", 37, 911233446);
        Pessoa bruno = new Pessoa("Bruno Santos", "brunosantos@gmail.com", 38, 911233555);

        Agenda vitorl = new Agenda(vitor);
    }
}
