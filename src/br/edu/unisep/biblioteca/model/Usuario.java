package br.edu.unisep.biblioteca.model;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private String telefone;
    private String cpf;
    private String login;

    public Usuario() {
    }

    public Usuario(String nome, String email, String senha, String telefone, String cpf, String login) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.cpf = cpf;
        this.login = login;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' + "\n" +
                ", email='" + email + '\'' + "\n" +
                ", senha='" + senha + '\'' + "\n" +
                ", telefone='" + telefone + '\'' + "\n" +
                ", cpf='" + cpf + '\'' + "\n" +
                ", login='" + login + '\'' + "\n" +
                '}';
    }
}
