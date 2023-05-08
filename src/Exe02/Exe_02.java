package Exe02;
import java.util.Scanner;

public class Exe_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o numero de conta: ");
        String numeroConta = input.next();

        System.out.print("Insira o titular da conta: ");
        String titular = input.next();

        System.out.print("Insira o saldo da conta: ");
        double saldo = input.nextDouble();


        Conta conta = new Conta(numeroConta, titular, saldo);

        System.out.print("Insira o valor que deseja pedir: ");
        double valor = input.nextDouble();

        System.out.println(conta.getmargemEmprestimo());

        conta.pedirEmprestimo(valor);



        System.out.println("Saldo da Conta "+conta.getNumeroConta()+": "+conta.getSaldo());
        System.out.println(conta.getmargemEmprestimo());
        System.out.println("Divida da Conta "+conta.getNumeroConta()+": "+conta.getDivida());
    }
}
