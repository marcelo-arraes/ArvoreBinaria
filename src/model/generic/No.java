/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.generic;

/**
 *
 * @author Marcelo
 */
public abstract class No {
    private No noEsquerdo;
    private No noDireto;

    public No() {
        this.noEsquerdo = null;
        this.noDireto = null;
    }
    
    public No getNoEsquerdo() {
        return noEsquerdo;
    }

    public void setNoEsquerdo(No noEsquerdo) {
        this.noEsquerdo = noEsquerdo;
    }

    public No getNoDireto() {
        return noDireto;
    }

    public void setNoDireto(No noDireto) {
        this.noDireto = noDireto;
    }
    
    public abstract boolean isEquals(No valor);
    public abstract boolean isMaior(No valor);
}
