package br.com.unifeso.biblioteca.controller;

import br.com.unifeso.biblioteca.model.Editora;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gabriel Duarte <gabriellagoa10@yahoo.com.br>
 */
public class EditoraDB {
    
    private List<Editora> editoras;
    
    public EditoraDB(){
        editoras = new ArrayList<>();    
    }
    
    public void inserirEditora(Editora editora){
        editoras.add(editora);
    }
    
    public List<Editora> retornarTodas(){
        return editoras;
    }
}
