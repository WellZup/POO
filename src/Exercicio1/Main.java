package Exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.println("\"----------\"Escolha a marda de carro desejada:\"----------\"");
        String marca = entrada.nextLine();


        Carros carro;

        switch (marca.toLowerCase()) {
            case "renault":
                carro = new Renault();
                carro.mostraCarro();
                break;
            case "fiat":
                carro = new Fiat();
                carro.mostraCarro();
                break;
            case "hyundai":
                carro = new Hyundai();
                carro.mostraCarro();
                break;
            default:
                System.out.println("Marca de carro inválida.");
                return;
        }

        carro.iniciarMotor();

        boolean sair = false;

        while (!sair) {
            System.out.println("Escolha uma ação (acelerar | frear) ou sair: ");
            String acao = entrada.nextLine();

            switch (acao.toLowerCase()) {
                case "acelerar":
                    carro.acelerar();
                    break;

                case "frear":
                    carro.freio();
                    break;
                case  "sair":
                    sair = true;
                    break;

                default:
                    System.out.println("Ação invalida.");
                    break;

            }
        }

    }
}
