package br.edu.unisep.biblioteca.view;
import br.edu.unisep.biblioteca.funcoes.Funcoes;
import br.edu.unisep.biblioteca.model.Autor;
import br.edu.unisep.biblioteca.model.Emprestimo;
import br.edu.unisep.biblioteca.model.Livro;
import br.edu.unisep.biblioteca.model.Usuario;

import javax.swing.*;
import java.util.Calendar;

public class Principal {
    public static void main(String[] args) {
        Funcoes funcoes = new Funcoes();
        //funcoes.adicionarLivro();
       // funcoes.adicionarAutor();
        funcoes.adicionarEmprestimo();
    }
}
