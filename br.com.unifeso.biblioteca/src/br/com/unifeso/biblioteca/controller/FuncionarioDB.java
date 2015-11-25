package br.com.unifeso.biblioteca.controller;

import br.com.unifeso.biblioteca.model.Funcionario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gabriel Duarte <gabriellagoa10@yahoo.com.br>
 */
public class FuncionarioDB {
    
    private List<Funcionario> funcionarios;
    
    public FuncionarioDB(){
        funcionarios = new ArrayList<>();    
    }
    
    public void inserirFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }
    
    public List<Funcionario> retornarTodos(){
        return funcionarios;
    }
}
