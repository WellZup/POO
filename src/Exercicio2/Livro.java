package Exercicio2;

public class Livro {

    private String genero;
    private String nome;
    private String isbn;
    private String autor;

    public Livro(String genero, String nome, String isbn, String autor) {
        this.genero = genero;
        this.nome = nome;
        this.isbn = isbn;
        this.autor = autor;
    }

    public Livro(String isbn) {
        this.isbn = isbn;
    }

    public Livro(String isbn, String nome) {
        this.isbn = isbn;
        this.nome = nome;
    }

    public Livro(String isbn, String nome, String genero) {
        this.isbn = isbn;
        this.nome = nome;
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public String getNome() {
        return nome;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAutor() {
        return autor;
    }
}
