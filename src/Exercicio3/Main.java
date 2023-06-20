package Exercicio3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

// TODO: 20/06/2023

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criação das instâncias da classe Exercicio3.Funcionario
        System.out.println("Digite os dados do Funcionário 1:");
        Funcionario funcionario1 = criarFuncionario(scanner);

        System.out.println("\nDigite os dados do Funcionário 2:");
        Funcionario funcionario2 = criarFuncionario(scanner);

        System.out.println("\nDigite os dados do Funcionário 3:");
        Funcionario funcionario3 = criarFuncionario(scanner);

        // Exibição dos atributos dos funcionários
        System.out.println("\nFuncionário 1:");
        exibirDadosFuncionario(funcionario1);

        System.out.println("\nFuncionário 2:");
        exibirDadosFuncionario(funcionario2);

        System.out.println("\nFuncionário 3:");
        exibirDadosFuncionario(funcionario3);
    }

    // TODO: 20/06/2023 Dentro do método main, solicitamos ao usuário que insira os dados para cada funcionário
    //  usando o método criarFuncionario e atribuímos as instâncias de Exercicio3.Funcionario correspondentes.
    //  Em seguida, utilizamos o método exibirDadosFuncionario para exibir os atributos dos funcionários criados.

    // TODO: 20/06/2023  incluímos loops do-while nos métodos criarFuncionario para solicitar que o usuário insira
    //  novamente a data de admissão ou o salário caso sejam inválidos.
    //  Dentro desses loops, adicionamos as chamadas aos métodos validarDataAdmissao e validarSalario para garantir
    //  que as entradas do usuário atendam aos requisitos.
    public static Funcionario criarFuncionario(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        String dataAdmissao;
        do {
            System.out.print("Data de Admissão (formato: dd/mm/aaaa): ");
            dataAdmissao = scanner.nextLine();
            if (!validarDataAdmissao(dataAdmissao)) {
                System.out.println("Data inválida. Não é permitido adicionar uma data no futuro.");
            }
        } while (!validarDataAdmissao(dataAdmissao));

        double salario;
        do {
            System.out.print("Salário: ");
            salario = Double.parseDouble(scanner.nextLine());
            if (!validarSalario(salario)) {
                System.out.println("Salário inválido. O salário mínimo permitido é R$ 700,00.");
            }
        } while (!validarSalario(salario));

        return new Funcionario(nome, dataAdmissao, salario);
    }

    public static void exibirDadosFuncionario(Funcionario funcionario) {
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Data de Admissão: " + funcionario.getDataAdmissao());
        System.out.println("Salário: " + funcionario.getSalario());
        System.out.println("Identificador: " + funcionario.getIdentificador());
    }

    // TODO: 20/06/2023  um DateTimeFormatter personalizado no método criarFuncionario para fazer o
    //  parsing da data de admissão fornecida pelo usuário.
    public static boolean validarDataAdmissao(String dataAdmissao) {
        LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataInformada = LocalDate.parse(dataAdmissao, formatter);
        return dataInformada.isBefore(dataAtual) || dataInformada.isEqual(dataAtual);
    }

    public static boolean validarSalario(double salario) {
        return salario >= 700.0;
    }
}