/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unus;

/**
 *
 * @author duran
 */
public class Diretor extends Professor {
     private String curso;
     private String professor;
     private String disciplina;
    
    public void incluirDisciplina(){
        this.disciplina=disciplina;
    }
    
    public void incluirCurso(){
        this.curso=curso;
    }
    
    public void incluirProfessor(){
        this.professor=professor;
    }
   static Diretor juk=new Diretor();
    private Diretor(){
        
    }
    public static Diretor getInstance(){
        return  juk;
    }
}
