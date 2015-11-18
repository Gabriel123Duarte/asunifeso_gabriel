package br.com.unifeso.biblioteca.view;

import br.com.unifeso.biblioteca.model.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gabriel Duarte <gabriellagoa10@yahoo.com.br>
 */
public class ViewConsole {
    
    public static void main(String args[])
    {
        Biblioteca objBiblioteca = new Biblioteca();
        objBiblioteca.setNome("Biblioteca ABC");
        
        
        Aluno objAluno = new Aluno();
        objAluno.setNome("Aluno A");
        objAluno.setMatricula("123456");
        
        
        Funcionario objFuncionario = new Funcionario();
        objFuncionario.setNome("Funcionario A");
        objFuncionario.setCpf("12345678");
        
        Editora objEditora = new Editora();
        objEditora.setNome("Editora A");
        
        Livro objLivro = new Livro(objEditora);
        objLivro.setCodigo("123");
        objLivro.setNome("Livro 1");
        
        Emprestimo objEmprestimo = new Emprestimo();
        objEmprestimo.setDataEntrega("15/11/2015");
        objEmprestimo.setFuncionario(objFuncionario);
        objEmprestimo.setAluno(objAluno);
        objEmprestimo.setLivro(objLivro);
        
        Emprestimo objEmprestimo2 = new Emprestimo();
        objEmprestimo2.setDataEntrega("20/11/2015");
        objEmprestimo2.setFuncionario(objFuncionario);
        objEmprestimo2.setAluno(objAluno);
        objEmprestimo2.setLivro(objLivro);
        
        List<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
        emprestimos.add(objEmprestimo);
        emprestimos.add(objEmprestimo2);
        
        for (Emprestimo emprestimo : emprestimos) {
            System.out.println("Data entrega: " + emprestimo.getDataEntrega());
        }
    }
}
   