package br.edu.unisep.biblioteca.model;

public class Livro {
    private int id;
    private String titulo;
    private Autor autor;
    private String editora;
    private String isbn;
    private int ano;
    private String sinopse;

    public Livro() {
    }

    public Livro(int id, String titulo, Autor autor, String editora, String isbn, int ano, String sinopse) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.isbn = isbn;
        this.ano = ano;
        this.sinopse = sinopse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "id=" + id + "\n" +
                ", titulo='" + titulo + '\'' + "\n" +
                ", autor='" + autor + '\'' + "\n" +
                ", editora='" + editora + '\'' + "\n" +
                ", isbn='" + isbn + '\'' + "\n" +
                ", ano=" + ano + "\n" +
                ", sinopse='" + sinopse + '\'' + "\n" +
                '}';
    }
}
