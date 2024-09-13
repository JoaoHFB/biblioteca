package br.edu.unisep.biblioteca.model;

public class Autor {
    private int Id;
    private String Nome;
    private String Email;
    private String Telefone;
    private String Biografia;
    private String Livros;

    public Autor() {

    }

    public Autor(String nome, String email, String telefone, String id, String biografia, String livros) {
        Nome = nome;
        Email = email;
        Telefone = telefone;
        Id = Integer.parseInt(id);
        Biografia = biografia;
        Livros = livros;
    }

    public String getNome() {
        return Nome;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public String getBiografia() {
        return Biografia;
    }

    public void setBiografia(String biografia) {
        Biografia = biografia;
    }

    public String getLivros() {
        return Livros;
    }

    public void setLivros(String livros) {
        Livros = livros;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "Id=" + Id + "\n" +
                ", Nome='" + Nome + '\'' + "\n" +
                ", Email='" + Email + '\'' + "\n" +
                ", Telefone='" + Telefone + '\'' + "\n" +
                ", Biografia='" + Biografia + '\'' + "\n" +
                ", Livros='" + Livros + '\'' + "\n" +
                '}';
    }
}
