package Exe01;

public class Carro {

    // Atributos de instância
    private String marca;
    private String modelo;
    private int anoFabrico;
    private int potencia;
    private int cilindrada;
    private Combustivel tipoCombustivel;
    private double litros100km;


    //Método construtor
    public Carro(String marca, String modelo, int anoFabrico, int potencia, int cilindrada, Combustivel tipoCombustivel, double litros100km) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.tipoCombustivel = tipoCombustivel;
        this.litros100km = litros100km;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getPotencia(){
        return this.potencia;
    }

    public int getCilindrada(){
        return this.cilindrada;
    }

    public int getAnoFabrico(){
        return this.anoFabrico;
    }

    public void ligar() {

        if (this.anoFabrico <= 1993) {

            if (this.tipoCombustivel.equals("DIESEL")) {

                System.out.println("Deita um pouco de fumo… Custa a pegar… O carro está ligado Vrum-vrum-vrum");
            } else {

                System.out.println("Custa a pegar... O carro está ligado! Vrum-vrum-vrum");
            }

        }

        if (this.anoFabrico > 1993) {

            if (this.potencia < 250) {
                System.out.println("O carro está ligado! Vruummmmmmm");
            } else {
                System.out.println("O carro está ligado! VRUUMMMMMM");
            }
        }
    }
        public Carro corrida(Carro carroAdv){


        if (this.potencia > carroAdv.potencia) {
            System.out.println("O vencedor é o carro 1!");
            return this;
        }
        else if (this.potencia < carroAdv.potencia) {
            System.out.println("O vencedor é o carro 2!");
            return carroAdv;
        } else {
            if (this.cilindrada < carroAdv.cilindrada) {
                System.out.println("O vencedor é o carro 2!");
                return carroAdv;
            } else if (this.cilindrada > carroAdv.cilindrada) {
                System.out.println("O vencedor é o carro 1!");
                return this;
            } else {
                if (this.anoFabrico > carroAdv.cilindrada) {
                    System.out.println("O vencedor é o carro 1!");
                    return this;
                } else if (this.anoFabrico < carroAdv.anoFabrico){
                    System.out.println("O vencedor é o carro 2!");
                    return carroAdv;
                }
            }
            }
        return null;
        }

        public void consumoCombustivel(double distancia){
            double consumo = (this.litros100km*distancia)/100;
            System.out.println("O carro " +this.marca+ " consumiu "+consumo+ " litros");
        }
    }



