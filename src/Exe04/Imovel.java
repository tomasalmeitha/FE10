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

    public void descricaoCasa(){
        System.out.println("O "+this.getClass().getSimpleName()+" fica na "+this.rua+" nº "+this.numPorta+" na cidade do "+this.cidade+" é uma casa do tipo "+this.tipoCasa+" com um acabamento "+this.acabamento+" com uma área de "+this.area+" m2 e com "+this.numQuartos+" quartos "+this.numWC+" WC's e uma piscina de "+this.areaPiscina+" m2" );
    }

    public Imovel compararImoveis(Imovel casa2){
        double valor1 = this.valorCasa();
        double valor2 = casa2.valorCasa();

        if(valor1>valor2){
            System.out.println("A casa 1 é mais cara e custa: "+valor1+ " €");
            return this;
        } else if (valor1<valor2) {
            System.out.println("A casa 2 é mais cara e custa: "+valor2+ " €");
            return casa2;
        }
        else {
            System.out.println("Ambas as casas têm o mesmo valor" +valor1);
            return null;
        }

    }

}

