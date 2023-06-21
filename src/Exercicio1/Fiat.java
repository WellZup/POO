package Exercicio1;

public  class Fiat extends Carros {


    public Fiat () {
        super("Uno Mille",2005 , 10000, "Azul", 2);
    }

    @Override
    public void iniciarMotor() {
        velocidade = 3;
        System.out.println();
        System.out.println("Iniciando o motor... minha velocidade está em " + velocidade + " km/h");
    }

    @Override
    void freio() {
        velocidade -= 6;
        System.out.println("Freando... minha velocidade está em " + velocidade + " km/h");
    }

    @Override
    void acelerar()  {
        velocidade += 12;
        System.out.println("Acelerando... minha velocidade está em " + velocidade + " km/h");
    }

    @Override
    public void mostraCarro() {
        super.mostraCarro();
    }
}
