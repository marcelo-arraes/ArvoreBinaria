/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.util;

import java.text.Normalizer;

/**
 *
 * @author Marcelo
 */
public class Util {

    public static String removerAcentos(String str) {
        return Normalizer.normalize(str, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
    }

    public static String removerPontuacao(String str) {
        return str.replaceAll("[^A-Za-z0-9\\s]", "");
    }
}
