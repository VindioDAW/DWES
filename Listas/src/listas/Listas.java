/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author vindi
 */
public class Listas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista l = new Lista();
        l.addFirst(0);
        l.addLast(1);
        l.addLast(2);
        l.addLast(3);
        l.addLast(4);
        l.addLast(5);
        l.addLast(6);
        l.addLast(7);
        l.addLast(8);
        l.addLast(9);
        l.addLast(2);
        int pri = l.indexOf(2);
        int fin = l.lastIndexOf(2);
        System.out.println("Primero " + pri + " ultimo " + fin);
        System.out.println("OK");
        l.mostrar();
    }
    
}
