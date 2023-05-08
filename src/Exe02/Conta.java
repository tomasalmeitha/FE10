package Exe02;

public class Conta {

    private String numeroConta, titular;
    private double saldo, margemEmprestimo, divida;
    private int anoAbertura;



    public Conta(String numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
        this.margemEmprestimo = 0.9 * saldo;
        this.anoAbertura = 2023;
        this.divida = 0;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getmargemEmprestimo() {
        return margemEmprestimo;
    }
    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getDivida(){
        return this.divida;
    }

    public void setDivida(double divida) {
        this.divida = divida;
    }

    public boolean pedirEmprestimo(double valor){

        if (this.divida>0){
            System.out.println("Já existe uma divida em curso!");
            return false;
        } else if (valor > this.margemEmprestimo) {
            System.out.println("O valor de empréstimo é superior à margem de empréstimo!");
            return false;
        }
        else {
            this.saldo+=valor;
            this.divida+=valor;
            return true;
        }
    }
}
