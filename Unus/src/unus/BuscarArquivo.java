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
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author duran
 */
public class BuscarArquivo {
    File  tempArquivoDiretoreCoordenador;//vai ser utilizado por todos os métodos
    
    
     public String getinfoProf(String n2){
            FileReader rdArquivo=null;
            BufferedReader br;
        try{
            tempArquivoDiretoreCoordenador=new File("arquivotempdiretcoord.txt");
            rdArquivo = new FileReader(tempArquivoDiretoreCoordenador);
             br=new BufferedReader(rdArquivo);
            String linha=null;
            do{
                linha=br.readLine();
            
            if(linha !=null){
            String infos[]=linha.split(";");
            
            for(int i=0;i<infos.length;i++){
                /*if(linha.contains(n)){//professor
                    return (infos[0]+";"+infos[1]+";"+infos[2]+";"+infos[3]+";");
                    
                }else if(linha.contains(n1)){//curso
                    return (infos[1]);
                    
                }else*/ if(linha.contains(n2)){//disciplina
                    return(infos[3]);
                    
               
            } /*else if(linha.contains(n3)){//pre requisito
                return infos[3];
                
            }*/
            }
            }
            }while(linha!=null);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
      return ("não encontrado");  
    }
    
      public Boolean  getinfoPrereq(String n3){
            FileReader rdArquivo=null;
            BufferedReader br;
        try{
            tempArquivoDiretoreCoordenador=new File("arquivotempdiretcoord.txt");
            rdArquivo = new FileReader(tempArquivoDiretoreCoordenador);
             br=new BufferedReader(rdArquivo);
            String linha=null;
            do{
                linha=br.readLine();
            
            if(linha !=null){
            String infos[]=linha.split(";");
            
            for(int i=0;i<infos.length;i++){
                /*if(linha.contains(n)){//professor
                    return (infos[0]+";"+infos[1]+";"+infos[2]+";"+infos[3]+";");
                    
                }else if(linha.contains(n1)){//curso
                    return (infos[1]);
                    
               // }elseif(linha.contains(n)){//disciplina
                    //return true;
                    
               
            } else*/ if(linha.contains(n3)){//pre requisito
                return true;
                
            }
            }
            }
            }while(linha!=null);
            rdArquivo.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
      return false;  
    }
     
      public String getinfoProfParaCoord(String n){
            FileReader rdArquivo=null;
            BufferedReader br;
        //try{
            tempArquivoDiretoreCoordenador=new File("arquivotempdiretcoord.txt");
        try {
            rdArquivo = new FileReader(tempArquivoDiretoreCoordenador);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(BuscarArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
             br=new BufferedReader(rdArquivo);
            String linha=null;
            do{
                try {
                    linha=br.readLine();
                } catch (IOException ex) {
                    Logger.getLogger(BuscarArquivo.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            if(linha !=null){
            String infos[]=linha.split(";");
            
            for(int i=0;i<infos.length;i++){
                if(linha.contains(n)){//professor
                    return (infos[1]);
                    
               /* }else if(linha.contains(n1)){//curso
                    return (infos[1]);
                    
                }else if(linha.contains(n2)){//disciplina
                    return(infos[3]);
                    
               
            } /*else if(linha.contains(n3)){//pre requisito
                return infos[3];
                
            }*/
            }
            }
            }
            
            }while(linha!=null);
        //}catch(Exception ex){
 //           JOptionPane.showMessageDialog(null, ex);
        //}
        
      return ("não encontrado");  
    
      
}
}
