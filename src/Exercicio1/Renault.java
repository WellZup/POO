package Exercicio1;

public class Renault extends Carros {
    public Renault () {
        super("Sandero", 2008, 23000, "Azul", 4);
    }



    @Override
    public void iniciarMotor() {
        velocidade = 0;
        System.out.println();
        System.out.println("Iniciando o motor... minha velocidade está em " + velocidade + " km/h");
    }

    @Override
    void freio() {
        if (velocidade < 5){
            System.out.println("Carro parado.");
        }
        velocidade -= 5;
        System.out.println("Freando... minha velocidade está em " + velocidade + " km/h");
    }

    @Override
    void acelerar()  {
        velocidade += 10;
        System.out.println("Acelerando... minha velocidade está em " + velocidade + " km/h");
    }


}
