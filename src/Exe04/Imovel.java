package Exe04;

public class Imovel {

    private String rua, cidade;
    private int numPorta, numQuartos, numWC;
    private Tipo tipoCasa;
    private Acabamento acabamento;
    private double area, areaPiscina;


    public Imovel(String rua, int numPorta, String cidade, Tipo tipoCasa, Acabamento acabamento, double area, int numQuartos, int numWC, double areaPiscina) {
        this.rua = rua;
        this.numPorta = numPorta;
        this.cidade = cidade;
        this.tipoCasa = tipoCasa;
        this.acabamento = acabamento;
        this.area = area;
        this.numQuartos = numQuartos;
        this.numWC = numWC;
        this.areaPiscina = areaPiscina;
    }


    public Acabamento getAcabamento(){
        return this.acabamento;
    }

    public void setAcabamento(Acabamento acabamento) {
        this.acabamento = acabamento;
    }

    /*public void precoCasa() {

        double valorImovel = (this.numQuartos * 7500) + (this.numWC * 10500) + (this.areaPiscina * 1000);

        if (this.tipoCasa.equals(tipoCasa.APARTAMENTO)) {

            if (this.acabamento.equals(this.acabamento.RESTAURO)) {
                double preco = (this.area * 1000) * 0.5 + valorImovel;
                System.out.println("O valor da casa é: "+preco+ " €");
            } else if (this.acabamento.equals(this.acabamento.USADA)) {
                double preco = (this.area * 1000) * 0.9 + valorImovel;
                System.out.println("O valor da casa é: "+preco+ " €");
            } else if (this.acabamento.equals(this.acabamento.NOVA)) {
                double preco = (this.area * 1000) + valorImovel;
                System.out.println("O valor da casa é: "+preco+ " €");
            } else if (this.acabamento.equals(this.acabamento.NOVA_COM_ALTO_ACABAMENTO)) {
                double preco = (this.area * 1000) * 1.25 + valorImovel;
                System.out.println("O valor da casa é: "+preco+ " €");
            }
        } else if (this.tipoCasa.equals(tipoCasa.CASA)) {

            if (this.acabamento.equals(this.acabamento.RESTAURO)) {
                double preco = (this.area * 3000) * 0.5 + valorImovel;
                System.out.println("O valor da casa é: "+preco+ " €");
            } else if (this.acabamento.equals(this.acabamento.USADA)) {
                double preco = (this.area * 3000) * 0.9 + valorImovel;
                System.out.println("O valor da casa é: "+preco+ " €");
            } else if (this.acabamento.equals(this.acabamento.NOVA)) {
                double preco = (this.area * 3000) + valorImovel;
                System.out.println("O valor da casa é: "+preco+ " €");
            } else if (this.acabamento.equals(this.acabamento.NOVA_COM_ALTO_ACABAMENTO)) {
                double preco = (this.area * 3000) * 1.25 + valorImovel;
                System.out.println("O valor da casa é: "+preco+ " €");
            }
        } else if (this.tipoCasa.equals(tipoCasa.MANSAO)) {

            if (this.acabamento.equals(this.acabamento.RESTAURO)) {
                double preco = (this.area * 5000) * 0.5 + valorImovel;
                System.out.println("O valor da casa é: "+preco+ " €");
            } else if (this.acabamento.equals(this.acabamento.USADA)) {
                double preco = (this.area * 5000) * 0.9 + valorImovel;
                System.out.println("O valor da casa é: "+preco+ " €");
            } else if (this.acabamento.equals(this.acabamento.NOVA)) {
                double preco = (this.area * 5000) + valorImovel;
                System.out.println("O valor da casa é: "+preco+ " €");
            } else if (this.acabamento.equals(this.acabamento.NOVA_COM_ALTO_ACABAMENTO)) {
                double preco = (this.area * 5000) * 1.25 + valorImovel;
                System.out.println("O valor da casa é: "+preco+ " €");
            }
        }
    }*/

    public double valorCasa(){

        int preco = 0;

        if (this.tipoCasa.equals(tipoCasa.APARTAMENTO)){
            preco = 1000;
        }
        else if (this.tipoCasa.equals(tipoCasa.CASA)) {
            preco = 3000;
        }
        else if (this.tipoCasa.equals(tipoCasa.MANSAO)){
            preco = 5000;
        }

        double desc = 1;

        if (this.acabamento.equals(acabamento.RESTAURO)){
            desc = 0.5;
        }
        else if (this.acabamento.equals(acabamento.USADA)){
            desc = 0.9;
        }
        else if (this.acabamento.equals(acabamento.NOVA_COM_ALTO_ACABAMENTO)){
            desc = 1.25;
        }

        double valorFinal = (this.area * preco * desc) + (this.numQuartos * 7500) + (this.numWC * 10500) + (this.areaPiscina * 1000);
        System.out.println("O valor da casa é: "+valorFinal+ " €");

        return valorFinal;
    }


}
