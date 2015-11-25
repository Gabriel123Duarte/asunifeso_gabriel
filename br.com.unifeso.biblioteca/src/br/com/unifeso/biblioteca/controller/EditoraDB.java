package br.com.unifeso.biblioteca.controller;

import br.com.unifeso.biblioteca.model.Editora;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gabriel Duarte <gabriellagoa10@yahoo.com.br>
 */
public class EditoraDB implements LogAplicacao{
    
    private List<Editora> editoras;
    
    public EditoraDB(){
        editoras = new ArrayList<>();    
    }
    
    public void inserirEditora(Editora editora){
        editoras.add(editora);
        gravarLog("Editora cadastrada: " + editora.getNome());
    }
    
    public List<Editora> retornarTodas(){
        return editoras;
    }

    @Override
    public void gravarLog(String log) {
        System.out.println(log);
    }
}
