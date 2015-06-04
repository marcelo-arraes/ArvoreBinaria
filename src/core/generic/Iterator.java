/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core.generic;

/**
 *
 * @author Marcelo
 */
public interface Iterator<E> {
    E first();
    E next();
    boolean hasNext();
}
