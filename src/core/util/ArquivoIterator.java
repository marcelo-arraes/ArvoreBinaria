/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.util;

import core.generic.Iterator;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marcelo
 */
public class ArquivoIterator implements Iterator<String>{
    private BufferedReader lerArq;
    private String[] conteudo;
    private int contador;

    public ArquivoIterator(BufferedReader lerArq) {
        try {
            this.lerArq = lerArq;
            this.conteudo = lerArq !=null ? getConteudoDoArquivo() : new String[0];
            this.contador = 0;
        } catch (IOException ex) {
            Logger.getLogger(ArquivoIterator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private String[] getConteudoDoArquivo() throws IOException{
        String conteudo = "";
        String linha = this.lerArq.readLine();
        conteudo = linha;
        
        while(linha != null){
            linha = this.lerArq.readLine();
            conteudo += " ";
            conteudo += linha != null ? linha : "";
        }
        
        return Util.removerPontuacao(Util.removerAcentos(conteudo.trim())).split(" ");
    }
    
    @Override
    public String first() {
        try {
            this.lerArq.reset();
            this.conteudo = getConteudoDoArquivo();
            this.contador = 0;
            
            return  this.conteudo[this.contador++];
        } catch (IOException ex) {
            return "";
        }
    }

    @Override
    public String next() {
        return this.conteudo[this.contador++];
    }

    @Override
    public boolean hasNext() {
        return this.contador < this.conteudo.length;
    }
}
