package Exercicio1;

public class Hyundai extends Carros {
    public Hyundai() {
        super("Hyundai Tucson", 2005, 25.000, "Azul", 4);
    }

    @Override
    public void iniciarMotor() {
        velocidade = 5;
        System.out.println();
        System.out.println("Iniciando o motor... minha velocidade está em " + velocidade + " km/h");
    }

    @Override
    void freio() {
        velocidade -= 2;
        System.out.println("Freando... minha velocidade está em " + velocidade + " km/h");
    }

    @Override
    void acelerar()  {
        velocidade += 15;
        System.out.println("Acelerando... minha velocidade está em " + velocidade + " km/h");
    }



}
