package Exercicio1;

abstract class Carros {

     String marca;
     int ano;
     double valor;
     String cor;
     int portas;
     double velocidade;

    public Carros(String marca, int ano, double valor, String cor, int portas) {
        this.marca = marca;
        this.ano = ano;
        this.valor = valor;
        this.cor = cor;
        this.portas = portas;

    }

    public void iniciarMotor() {

        System.out.println("Dando partida no carro. Minha velocidade é de: " + velocidade +"Km");
    }

    abstract void freio();

    abstract void acelerar();


        public void mostraCarro() {
            System.out.print("---------INFORMAÇÕES DO CARRO--------");
            System.out.printf("\n---------Marca: " + marca + "----------");
            System.out.printf("\n---------Ano:" + ano + "----------");
            System.out.printf("\n---------Valor: R$" + valor + "----------");
            System.out.printf("\n---------Cor: " + cor + "----------");
            System.out.printf("\n---------Número de portas: " + portas + "----------");
        }



}
