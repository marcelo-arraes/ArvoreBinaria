/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.generic.No;

/**
 *
 * @author Marcelo
 */
public class Arvore {
    private No raiz;

    public Arvore() {
        this.raiz = null;
    }

    public No getRaiz() {
        return raiz;
    }
    
    public boolean addElemento(No elemento){
        if(this.raiz == null) {
            this.raiz = elemento;
            return true;
        }
        
        return this.addElemento(elemento, this.raiz) != null;
    }
    
    private No addElemento(No novo, No anterior){
        No aux;
        if(anterior != null){
            if(novo.isEquals(anterior)){
                return null;
            }else if(novo.isMaior(anterior)){
                aux = this.addElemento(novo, anterior.getNoDireto());
                if(aux == null) return null;
                anterior.setNoDireto(aux);
            }else{
                aux = this.addElemento(novo, anterior.getNoEsquerdo());
                if(aux == null) return null;
                anterior.setNoEsquerdo(aux);
            }
            
        }else{
            anterior = novo;
        }
        
        return anterior;
    }
    
    public No buscar(No valor){
         return this.buscar(this.raiz, valor);
    }
    
    private No buscar(No no,No valor){
        if(no == null){
            return null;
        }else if(no.isEquals(valor)){
                return no;
        }else if(valor.isMaior(no)){
            return this.buscar(no.getNoDireto(), valor);
        }else{
            return this.buscar(no.getNoEsquerdo(), valor);
        }
    }
}
