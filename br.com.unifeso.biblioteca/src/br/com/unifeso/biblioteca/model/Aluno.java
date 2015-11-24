package br.com.unifeso.biblioteca.model;

/**
 *
 * @author Gabriel Duarte <gabriellagoa10@yahoo.com.br>
 */
public class Aluno extends Usuario {
    
    private String matricula;
    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }    
        
    @Override
    public String toString(){
        return matricula + " - " + super.getNome();
    }
}
