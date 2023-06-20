package Exercicio3;

// TODO: 20/06/2023 Nesta implementação, os atributos nome, dataAdmissao e salario são definidos como privados usando
//  o modificador private. Para acessar ou modificar esses atributos, foram criados métodos getters (getNome(),
//  getDataAdmissao(), getSalario()) e setters (setNome(), setDataAdmissao(), setSalario()), respectivamente.
//  Foi adicionado o atributo estático identificador do tipo int à classe Exercicio3.Funcionario.
//  Esse atributo é incrementado a cada vez que uma nova instância de Exercicio3.Funcionario é criada no construtor.
//  Os getters e setters foram implementados para permitir o acesso ao identificador de cada funcionário.
//  Dessa forma, o primeiro funcionário instanciado terá o identificador 1, o segundo terá o identificador 2,
//  e assim por diante.
public class Funcionario {
    private String nome;
    private String dataAdmissao;
    private double salario;
    private static int identificador = 0;

    public Funcionario(String nome, String dataAdmissao, double salario) {
        this.nome = nome;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
        identificador++;
    }

    public String getNome() {
        return nome;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public double getSalario() {
        return salario;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    // TODO: 20/06/2023  Foi adicionada uma condição no método setSalario para verificar se o salário fornecido
    //  é maior ou igual a R$ 700,00. Se for, o salário é atribuído ao atributo salario. Caso contrário,
    //  é exibida uma mensagem de erro informando que o salário é inválido, e não é realizado nenhuma alteração no valor
    //  do salário.
    //  Essa validação garante que salários inferiores a R$ 700,00 não serão atribuídos aos funcionários.
    public void setSalario(double salario) {
        if (salario >= 700.0) {
            this.salario = salario;
        } else {
            System.out.println("Salário inválido. O salário mínimo permitido é R$ 700,00.");
        }
    }
}