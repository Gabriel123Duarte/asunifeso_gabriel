package br.com.unifeso.biblioteca.controller;

import br.com.unifeso.biblioteca.model.Aluno;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gabriel Duarte <gabriellagoa10@yahoo.com.br>
 */
public class AlunoDB implements LogAplicacao{
    
    private List<Aluno> alunos;
    
    public AlunoDB(){
        alunos = new ArrayList<>();    
    }
    
    public void inserirAluno(Aluno aluno){
        alunos.add(aluno);
        gravarLog("Aluno inserido - " + aluno.getNome());
    }
    
    public List<Aluno> retornarTodos(){
        return alunos;
    }

    @Override
    public void gravarLog(String log) {
        System.out.println(log);
    }
    
    
    
}
