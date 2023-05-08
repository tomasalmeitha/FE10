package Exe04;
import java.util.Scanner;
public class Exe_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Imovel casa = new Imovel("Rua Batata", 98, "Porto", Tipo.MANSAO, Acabamento.USADA, 270, 5, 4, 200);

        System.out.println("O acabamento da casa é :" +casa.getAcabamento());
        casa.valorCasa();

        System.out.println("Fiz obras em casa!");

        casa.setAcabamento(Acabamento.NOVA);
        System.out.println("O novo acabamento da casa é: "  +casa.getAcabamento());
        casa.valorCasa();
    }
}
