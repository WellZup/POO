package Exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);


        System.out.println("\"----------\"Escolha a marca de carro desejada:\"----------\"");
        System.out.println("\"----------\" 1 - Fiat  ||  2 - Hyundai || 3 - Reanult\"----------\"" );
        String marca = entrada.nextLine();


        Carros carro;

        switch (marca.toLowerCase()) {
            case "1":
                carro = new Fiat();
                carro.mostraCarro();
                break;
            case "2":
                carro = new Hyundai();
                carro.mostraCarro();
                break;
            case "3":
                carro = new Renault();
                carro.mostraCarro();
                break;
            default:
                System.out.println("Marca de carro inválida.");
                return;
        }

        carro.iniciarMotor();

        boolean sair = false;

        while (!sair) {
            System.out.println("Escolha uma ação ( 1-acelerar | 2-frear | 3-sair:) ");
            String acao = entrada.nextLine();

            switch (acao.toLowerCase()) {
                case "1":
                    carro.acelerar();
                    break;

                case "2":
                    carro.freio();
                    break;
                case  "3":
                    sair = true;
                    break;

                default:
                    System.out.println("Ação invalida.");
                    break;

            }
        }

    }
}
