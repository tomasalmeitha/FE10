package Exe03;

import java.util.ArrayList;

public class Animal {

    private String nome, especie;
    private double peso;
    private ArrayList<String> alimentacao;

    public Animal(String nome, String especie, double peso, ArrayList<String> alimentacao) {
        this.nome = nome;
        this.especie = especie;
        this.peso = peso;
        this.alimentacao = alimentacao;
    }

    public double getPeso(){
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean alimentaAnimal(String alimento, double pesoFood) {

        for (String i : alimentacao){
           if(alimento.equals(i)) {
               System.out.println("O animal comeu");
               this.peso += pesoFood;
               return true;
           }
            } System.out.println("O animal recusou essa comida");
              return false;
        }




    }
