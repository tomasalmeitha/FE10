package Exe03;
import java.util.ArrayList;
import java.util.Scanner;

public class Exe_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> alimentacao = new ArrayList<String>();
        alimentacao.add("Banana");
        alimentacao.add("Leite");
        alimentacao.add("Ração");
        alimentacao.add("Nozes");


        Animal animal = new Animal("Max", "macaco", 40, alimentacao);

        Animal animalZorro = new Animal("Thor", "orangotango", 400, alimentacao);



        /*System.out.print("Insira o alimento que deseja dar ao animal: ");
        String alimento = input.next();*/

        animal.alimentaAnimal("Banana", 0.200);

        animalZorro.alimentaAnimal("Nozes", 0.500);

        System.out.println(animal.getPeso());

        System.out.println(animalZorro.getPeso());
    }
}
