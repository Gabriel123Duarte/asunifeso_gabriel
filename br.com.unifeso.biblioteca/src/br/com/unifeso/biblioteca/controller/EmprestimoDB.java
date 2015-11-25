package br.com.unifeso.biblioteca.controller;

import br.com.unifeso.biblioteca.model.Aluno;
import br.com.unifeso.biblioteca.model.Emprestimo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gabriel Duarte <gabriellagoa10@yahoo.com.br>
 */
public class EmprestimoDB implements LogAplicacao{
    
    private List<Emprestimo> emprestimos;
    
    public EmprestimoDB(){
        emprestimos = new ArrayList<>();    
    }
    
    public void inserirEmprestimo(Emprestimo emprestimo){
        emprestimos.add(emprestimo);
        gravarLog("Novo empréstimo realizado!");
    }
    
    public List<Emprestimo> retornarTodos(){
        return emprestimos;
    }
    
    // Função auxiliar para tratar o atributo de qualidade que diz que o Aluno so pode ter 3 emprestimos
    public List<Emprestimo> retornarEmprestimoAluno(Aluno aluno){
        List<Emprestimo> emp = new ArrayList<>();
        for(Emprestimo e : emprestimos)
            if(e.getAluno().getMatricula().equals(aluno.getMatricula()))
                emp.add(e);
        return emp;
    }
    
    @Override
    public void gravarLog(String log) {
        System.out.println(log);
    }
}
