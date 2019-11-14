/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unus;

import java.io.File;
import java.io.FileWriter;

/**
 *
 * @author duran
 */
public class EscreverArquivo {
    
    public void setArquivo(String n1, String n2, String n3, String n4,boolean b){
try{
             File tempArquivo=new File("arquivotemp.txt");
             FileWriter wtarquivo = new FileWriter(tempArquivo,true);
             Aluno record =new Aluno();
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
}
