package br.edu.unisep.biblioteca.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Emprestimo {
    private Livro livro;
    private int id;
    private Usuario usuario;
    private String titulo;
    private Calendar dataEmprestimo;
    private Calendar dataDevolucao;
    private String observacao;

    public Emprestimo() {
    }

    public Emprestimo(Livro livro, int id, Usuario usuario, String titulo, Calendar dataEmprestimo, Calendar dataDevolucao, String observacao) {
        this.livro = livro;
        this.id = id;
        this.usuario = usuario;
        this.titulo = titulo;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.observacao = observacao;

    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Calendar getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Calendar dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Calendar getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Calendar dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        return "Emprestimo{" +
                "livro=" + livro + "\n" +
                ", id=" + id + "\n" +
                ", usuario=" + usuario + "\n" +
                ", titulo='" + titulo + '\'' + "\n" +
                ", DataEmprestimo=" + sdf.format(dataEmprestimo.getTime()) + "\n" +
                ", DataDevolucao='" + sdf.format(dataDevolucao.getTime())+ '\'' + "\n" +
                ", observacao='" + observacao + '\'' + "\n" +
                '}';
    }
}

