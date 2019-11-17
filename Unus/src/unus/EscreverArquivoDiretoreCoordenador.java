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
public class EscreverArquivoDiretoreCoordenador {
     File tempArquivoDiretoreCoordenador;//vai ser utilizado por todos os métodos
    Professor record;
    Coordenador recordCoor;
    Diretor recordDiret;
    
    
     public void setArquivo(String n1, String n2, String n3,String n4,boolean b){
try{
              tempArquivoDiretoreCoordenador=new File("arquivotempdiretcoord.txt");
             FileWriter wtarquivo ;
             recordDiret =new Diretor();
             String texto;
             do{
            wtarquivo = new FileWriter(tempArquivoDiretoreCoordenador,true);
            recordDiret.incluirProfessor(n1);
            recordDiret.incluirCurso(n2);
            recordDiret.incluirDisciplina(n3);
            recordDiret.setPrerequisito(n4);
           // recordCoor.incluirDisciplina(n4);
            //record.aulasdadas();
            texto=recordDiret.toString();
            wtarquivo.write(texto+"\n");
        }while(!b);
             wtarquivo.close();
        }catch(Exception ex){
            System.out.println("Erro ao manipular arquivo" + ex.getMessage());
        }
}
}
