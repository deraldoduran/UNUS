/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unus;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextPane;

/**
 *
 * @author duran
 */
public class EscreverArquivo {
   File tempArquivo;//vai ser utilizado por todos os métodos
    Aluno record;
   
   
    public void setArquivo(String n1, String n2, String n3, String n4,boolean b){
try{
              tempArquivo=new File("arquivotemp.txt");
             FileWriter wtarquivo ;
             record =new Aluno();
             String texto;
             do{
            wtarquivo = new FileWriter(tempArquivo,true);
            record.setNome(n1);
            record.setDisciplina(n2);
            record.setMatricula(n3);
            record.setTurma(n4);
            texto=record.toString();
            wtarquivo.write(texto+"\n");
        }while(!b);
             wtarquivo.close();
        }catch(Exception ex){
            System.out.println("Erro ao manipular arquivo" + ex.getMessage());
        }
}
    
    public String getNomeAluno(String nomeAluno){
            FileReader rdArquivo=null;
            BufferedReader br;
        try{
            tempArquivo=new File("arquivotemp.txt");
            rdArquivo = new FileReader(tempArquivo);
             br=new BufferedReader(rdArquivo);
            String linha=null;
            do{
                linha=br.readLine();
            
            if(linha !=null){
            String infos[]=linha.split(";");
            
            for(int i=0;i<infos.length;i++){
                if(linha.contains(nomeAluno)){
                    return (infos[0]+";"+infos[1]+";"+infos[2]+";"+infos[3]+";"); 
                }
            } 
            }
            }while(linha!=null);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
      return ("não encontrado");  
    }
    
    public void setArquivoProf(String b, String nota, String frequencia){
            record=new Aluno();
          try{
              tempArquivo=new File("arquivotemp.txt");
             FileWriter wtarquivo ;
             record =new Aluno();
             String texto;
             
            wtarquivo = new FileWriter(tempArquivo,true);
            
            texto=(b + nota+";" + frequencia);
            wtarquivo.write(texto+"\n");
        
             wtarquivo.close();
        }catch(Exception ex){
            System.out.println("Erro ao manipular arquivo" + ex.getMessage());
        }
            
       
        }
    
     public String getNomeSomenteAluno(String nomeAluno){
            FileReader rdArquivo=null;
            BufferedReader br;
        try{
            tempArquivo=new File("arquivotemp.txt");
            rdArquivo = new FileReader(tempArquivo);
             br=new BufferedReader(rdArquivo);
            String linha=null;
            do{
                linha=br.readLine();
            
            if(linha !=null){
            String infos[]=linha.split(";");
            
            for(int i=0;i<infos.length;i++){
                if(linha.contains(nomeAluno)){
                    return (infos[0]+"  o aluno está regular!"/*+";"+infos[1]+";"+infos[2]+";"+infos[3]+";"*/); //só vai retornar o nome do aluno
                }
            } 
            }
            }while(linha!=null);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
      return ("não encontrado");  
    }
     
     public String getinfoAluno(String nomeAluno, String matricula,String turma, String disciplina, String nota,String frequencia){
            FileReader rdArquivo=null;
            BufferedReader br;
        try{
            tempArquivo=new File("arquivotemp.txt");
            rdArquivo = new FileReader(tempArquivo);
             br=new BufferedReader(rdArquivo);
            String linha=null;
            do{
                linha=br.readLine();
            
            if(linha !=null){
            String infos[]=linha.split(";");
            
            for(int i=0;i<infos.length;i++){
                if(linha.contains(nomeAluno)){
                    return (infos[0]+";"+infos[1]+";"+infos[2]+";"+infos[3]+";");
                    
                }else if(linha.contains(matricula)){
                    return (infos[1]);
                    
                }else if(linha.contains(turma)){
                    return(infos[2]);
                    
                }else if(linha.contains(disciplina)){
                    return(infos[3]);
                    
                }else if(linha.contains(nota)){
                    return(infos[4]);
                    
                }else if(linha.contains(frequencia)){
                    return(infos[5]);
                    
                }
            } 
            }
            }while(linha!=null);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
      return ("não encontrado");  
    }
}
