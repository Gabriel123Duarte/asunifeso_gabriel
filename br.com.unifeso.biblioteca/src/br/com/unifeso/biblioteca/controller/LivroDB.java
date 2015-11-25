package br.com.unifeso.biblioteca.controller;

import br.com.unifeso.biblioteca.model.Livro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gabriel Duarte <gabriellagoa10@yahoo.com.br>
 */
public class LivroDB implements LogAplicacao{
    
     private List<Livro> livros;
    
    public LivroDB(){
        livros = new ArrayList<>();    
    }
    
    public void inserirLivro(Livro livro){
        livros.add(livro);
        gravarLog("Novo livro: " + livro.getNome());
    }
    
    public List<Livro> retornarTodos(){
        return livros;
    }
    
    @Override
    public void gravarLog(String log) {
        System.out.println(log);
    }
}
