package Exercicio2;

import java.util.ArrayList;


public class Biblioteca {
    public static void main(String[] args) {
        ArrayList<Livro> livros = new ArrayList<>();

        Livro livro1 = new Livro("Ficção Científica", "Fundação", "9788576570054", "Isaac Asimov");
        Livro livro2 = new Livro("Fantasia", "O Senhor dos Anéis", "9788533613379", "J.R.R. Tolkien");
        Livro livro3 = new Livro("Suspense", "O Código Da Vinci", "9788532524013", "Dan Brown");

        // Adicionando livros à lista
        livros.add(livro1);
        livros.add(livro2);
        livros.add(livro3);


        // Mostrando informações dos livros
        for (Livro livro : livros) {
            System.out.println("Gênero: " + livro.getGenero());
            System.out.println("Nome: " + livro.getNome());
            System.out.println("ISBN: " + livro.getIsbn());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println();
        }
        // Registrar livro apenas com o ISBN
        Livro livro4 = new Livro("9788576570011");
        System.out.println("O livro foi registrado com o ISBN " + livro4.getIsbn());

        // Registrar livro apenas com o ISBN e nome
        Livro livro5 = new Livro("9788576570022", "Dom Casmurro");
        System.out.println("O livro foi registrado com o ISBN " + livro5.getIsbn() + " e o nome " + livro5.getNome());

        // Registrar livro apenas com o ISBN, nome e gênero
        Livro livro6 = new Livro("9788576570033", "A Guerra dos Tronos", "Fantasia");
        System.out.println("O livro foi registrado com o ISBN " + livro6.getIsbn() + ", o nome " + livro6.getNome() + " e o gênero " + livro6.getGenero());

        // Registrar livro com todos os atributos
        new Livro("Ficção Científica", "Neuromancer", "9788576570044", "William Gibson");
        System.out.println("O livro foi registrado com todos os atributos.");
    }


}



