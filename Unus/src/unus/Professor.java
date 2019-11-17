/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unus;

import java.util.ArrayList;

/**
 *
 * @author duran
 */
public class Professor {
    private String nomeprof;
    private String avaliacoes;
    private String frequencia;
    ArrayList<Turma> aulasdadas=new ArrayList();

    public String getNomeprof() {
        return nomeprof;
    }

    public void setNomeprof(String nomeprof) {
        this.nomeprof = nomeprof;
    }

    public String getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(String avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    public ArrayList<Turma> getAulasdadas() {
        return aulasdadas;
    }

    public void setAulasdadas(ArrayList<Turma> aulasdadas) {
        this.aulasdadas = aulasdadas;
    }
}
