package br.edu.unisep.biblioteca.funcoes;

import br.edu.unisep.biblioteca.model.Autor;
import br.edu.unisep.biblioteca.model.Emprestimo;
import br.edu.unisep.biblioteca.model.Livro;
import br.edu.unisep.biblioteca.model.Usuario;

import javax.swing.*;
import java.util.Calendar;

public class Funcoes {
    public Livro adicionarLivro() {
        int idLivro = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do livro"));
        String titulo = JOptionPane.showInputDialog("Digite o nome do livro");
        String editora = JOptionPane.showInputDialog("Digite a editora do livro");
        String isbn = JOptionPane.showInputDialog("Digite o isbn do livro");
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do livro"));
        String sinopse = JOptionPane.showInputDialog("Digite o sinopse do livro");

        Livro livro = new Livro();
        livro.setId(idLivro);
        livro.setTitulo(titulo);
        livro.setAutor(adicionarAutor());
        livro.setEditora(editora);
        livro.setIsbn(isbn);
        livro.setAno(ano);
        livro.setSinopse(sinopse);

        return livro;
    }

    public Autor adicionarAutor() {
        int idautor = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do autor"));
        String email = JOptionPane.showInputDialog("Digite o email do autor");
        String telefone = JOptionPane.showInputDialog("Digite o telegone do autor");
        String biografia = JOptionPane.showInputDialog("Digite a biografia do autor");
        String livros = JOptionPane.showInputDialog("Digite os livros escritos pelo autor");
        String nome = JOptionPane.showInputDialog("Digite o nome do autor");

        Autor autor = new Autor();
        autor.setId(idautor);
        autor.setEmail(email);
        autor.setTelefone(telefone);
        autor.setBiografia(biografia);
        autor.setLivros(livros);
        autor.setNome(nome);

        return autor;
    }

    public void adicionarEmprestimo() {
        int idEmp = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do emprestimo"));
        Calendar dataEmprestimo = Calendar.getInstance();
        Calendar dataDevolucao = Calendar.getInstance();
        String observacao = JOptionPane.showInputDialog("Digite o observacao");

        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setId(idEmp);
        emprestimo.setDataEmprestimo(dataEmprestimo);
        emprestimo.setObservacao(observacao);
        emprestimo.setDataDevolucao(dataDevolucao);
        emprestimo.setLivro(adicionarLivro());
        emprestimo.setUsuario(adicionarUsuario());
        JOptionPane.showMessageDialog(null, emprestimo);

    }

    public Usuario adicionarUsuario() {
        String nome = JOptionPane.showInputDialog("Digite o nome do usuario");
        String email = JOptionPane.showInputDialog("Digite o email do usuario");
        String senha = JOptionPane.showInputDialog("Digite o senha do usuario");
        String telefone = JOptionPane.showInputDialog("Digite o telefone do usuario");
        String cpf = JOptionPane.showInputDialog("Digite o cpf do usuario");
        String login = JOptionPane.showInputDialog("Digite o login do usuario");

        Usuario usuario = new Usuario();
        usuario.setNome(nome);
        usuario.setEmail(email);
        usuario.setSenha(senha);
        usuario.setTelefone(telefone);
        usuario.setCpf(cpf);
        usuario.setLogin(login);

        return usuario;
    }
}
