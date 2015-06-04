/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import core.generic.Iterator;
import core.util.LeitorArquivo;
import model.Arvore;
import model.PalavraNo;
import model.generic.No;

/**
 *
 * @author Marcelo
 */
public class PalavraArvoreCtrl {
    private Arvore arvore = new Arvore();

    public Arvore getArvore() {
        return arvore;
    }
     public void reiniciaArvore(){
         this.arvore = new Arvore();
     }
     
     public void inserir(PalavraNo elem){
         PalavraNo elemAux = (PalavraNo) this.arvore.buscar(elem);
         if(elemAux != null) elemAux.incrementaQuantidade();
         else this.arvore.addElemento(elem);
         //boolean inseriu = this.arvore.addElemento(elem);
         //if(!inseriu) elem.incrementaQuantidade();
     }
     
     public void iniciaArvoreDoArquivo(){
         Iterator<String> it = LeitorArquivo.getArquivoIterator();
         
         while(it.hasNext()){
             PalavraNo no = new PalavraNo(it.next());
             this.inserir(no);
         }
     }
}
