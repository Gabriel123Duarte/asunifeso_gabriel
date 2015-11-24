package br.com.unifeso.biblioteca.controller;

import br.com.unifeso.biblioteca.model.Aluno;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gabriel Duarte <gabriellagoa10@yahoo.com.br>
 */
public class AlunoDB {
    
    private List<Aluno> alunos;
    
    public AlunoDB(){
        alunos = new ArrayList<>();    
    }
    
    public void inserirAluno(Aluno aluno){
        alunos.add(aluno);
    }
    
    public List<Aluno> retornarTodos(){
        return alunos;
    }
    
    
}
