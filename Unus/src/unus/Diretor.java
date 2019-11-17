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
     private String prerequisito;

    public String getPrerequisito() {
        return prerequisito;
    }

    public void setPrerequisito(String prerequisito) {
        this.prerequisito = prerequisito;
    }
    
    public void incluirDisciplina(String n){
        this.disciplina=n;
    }
    
    public void incluirCurso(String n){
        this.curso=n;
    }
    
    public void incluirProfessor(String n){
        this.professor=n;
    }
   static Diretor Andrea=new Diretor();
    Diretor(){
        
    }
    public static Diretor getInstance(){
        return  Andrea;
    }

    @Override
    public String toString() {
        return ( /*Diretor.getInstance()+ ";" */ professor  + ";" + curso  + ";" + disciplina + ";"+ prerequisito );
    }

    

   
}
