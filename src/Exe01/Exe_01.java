package Exe01;

import Exe01.Carro;

import java.util.Scanner;

public class Exe_01 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Insira a marca do carro: ");
        String marca = input.next();

        System.out.print("Insira o modelo do carro: ");
        String modelo = input.next();

        System.out.print("Insira o ano do carro: ");
        int anoFabrico = input.nextInt();

        System.out.print("Insira a potencia do carro: ");
        int potencia = input.nextInt();

        System.out.print("Insira a cilindrada do carro: ");
        int cilindrada = input.nextInt();

        System.out.println("Introduza o tipo de combustível do carro (GASOLINA, DIESEL ou GPL):");

        Combustivel tipoCombustivel = Combustivel.valueOf(input.next().toUpperCase());

        System.out.print("Insira quantos litros gasta aos 100Km: ");
        double litros100km = input.nextDouble();

        Carro carro = new Carro(marca, modelo, anoFabrico, potencia, cilindrada, tipoCombustivel, litros100km);

        System.out.print("Deseja ligar o carro? (s/n): ");
        String escolha = input.next();

        System.out.println(carro.getPotencia());

        if (escolha.equals("s")) {
            carro.ligar();
        }

        /*--------------------------------------------------------*/

        System.out.print("Insira a marca do segundo carro: ");
        String marcaAdv = input.next();

        System.out.print("Insira a potencia do carro adversário: ");
        int potenciaAdv = input.nextInt();

        System.out.print("Insira a cilindrada do carro adversário: ");
        int cilindradaAdv = input.nextInt();

        System.out.print("Insira o ano de fabrico do carro adversário: ");
        int anoFabricoAdv = input.nextInt();

        System.out.print("Insira quantos litros gasta o carroAdv aos 100Km: ");
        double litros100kmAdv = input.nextDouble();

        System.out.print("Deseja saber o resultado da corrida? (s/n): ");
        String opcao = input.next();

        Carro carroAdv = new Carro(marcaAdv, modelo, anoFabricoAdv, potenciaAdv, cilindradaAdv, tipoCombustivel, litros100kmAdv);

        Carro carroTorneio = new Carro("Mercedes","A45",2023,420,2000,Combustivel.GASOLINA,20);

        if (opcao.equals("s")) {
            carroAdv.ligar();
        }

        Carro vencedor = carro.corrida(carroAdv);
        System.out.println("Vencedor: "+vencedor.getMarca()+" "+vencedor.getModelo());
        vencedor.corrida(carroTorneio);

        System.out.print("Insira a distância percorrida: ");
        double distancia = input.nextDouble();


        carro.consumoCombustivel(distancia);
        carroAdv.consumoCombustivel(distancia);
        carroTorneio.consumoCombustivel(distancia);
    }


}
