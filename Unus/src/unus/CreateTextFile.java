/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unus;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author duran
 */
public class CreateTextFile {
    private Formatter output;//objeto utilizado para gerar saida de texto no arquivo
    //permite ao usuario abrir o arquivo
    public void openFile(){
        try{
            output =new Formatter("C:\\Users\\duran\\Documents\\curso ufc\\2 semestre\\POO\\alunos.txt"); //abre o arquivo e fim do try
        }
        catch(SecurityException securityException){
            System.err.println("Você não tem acesso para escrever no arquivo");
            System.exit(1);//termina o programa
            //fim do catch
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CreateTextFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//fim do método openFile

    
    //adiciona registros ao arquivo
    public void addRecords(String nome, String matricula, String turma, String disciplina){
        //objeto a ser gravado no arquivo
        Aluno record=new Aluno();
       try{//gera saida de valores pro arquivo
        record.setNome(nome);
        record.setDisciplina(disciplina);
        record.setMatricula(matricula);
        record.setTurma(turma);
        //output.format("%s", record.getNome());
       // JOptionPane.showMessageDialog(null, record.getNome());
        output.format("%s %s %s %s",record.getNome(),record.getMatricula(),record.getTurma(),record.getDisciplina());
        JOptionPane.showMessageDialog(null, "escrito no arquivo");
        }
        catch(FormatterClosedException formatterCloseException){
            //JOptionPane.showMessageDialog(null, System.err.checkError());
            System.err.println("error writting to file");
            return;
            
        }
        catch(NoSuchElementException elementException){
            System.out.println("Invalid input, try again");
        }
        
        //fim do método addRecords
    }
    public void closeFile(){
        if(output != null){
            output.close();
        }//arquivo fechado
    }//fimm da classe
}
