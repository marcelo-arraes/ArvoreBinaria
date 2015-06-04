/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.util;

import core.generic.Iterator;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marcelo
 */
public class LeitorArquivo {

    private static final String nomeArquivo = System.getProperty("user.dir") + File.separator + "arquivos" + File.separator + "ArquivoDeDados.txt";

    public static Iterator getArquivoIterator() {
        FileReader arq = null;
        Iterator it = new ArquivoIterator(null);
        try {
            arq = new FileReader(nomeArquivo);
            BufferedReader lerArq = new BufferedReader(arq);
            it = new ArquivoIterator(lerArq);
        } catch (FileNotFoundException ex) {
        } finally {
            try {
                arq.close();
            } catch (IOException ex) {
            }
        }
        return it;
    }
}
