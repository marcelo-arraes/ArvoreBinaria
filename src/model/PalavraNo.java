/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import core.util.Util;
import model.generic.No;
import org.omg.CORBA.UNKNOWN;

/**
 *
 * @author Marcelo
 */
public class PalavraNo extends No{
    private String palavra;
    private int quantidade;

    public PalavraNo() {
        this.palavra = "";
        this.quantidade = 1;
    }
    
    public PalavraNo(String palavra) {
        this.palavra = palavra;
        this.quantidade = 1;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void incrementaQuantidade() {
        this.quantidade++;
    }

    @Override
    public boolean isEquals(No valor) {
        return this.palavra.equalsIgnoreCase(((PalavraNo) valor).palavra);
    }

    @Override
    public boolean isMaior(No valor) {
        return this.palavra.compareToIgnoreCase(((PalavraNo) valor).palavra) > 0;
    }
    
}
