package br.com.unifeso.biblioteca.controller;

import br.com.unifeso.biblioteca.model.Funcionario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gabriel Duarte <gabriellagoa10@yahoo.com.br>
 */
public class FuncionarioDB implements LogAplicacao{
    
    private List<Funcionario> funcionarios;
    
    public FuncionarioDB(){
        funcionarios = new ArrayList<>();    
    }
    
    public void inserirFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
        gravarLog("Funcionário cadastrado: " + funcionario.getNome());
    }
    
    public List<Funcionario> retornarTodos(){
        return funcionarios;
    }
    
    @Override
    public void gravarLog(String log) {
        System.out.println(log);
    }
}
