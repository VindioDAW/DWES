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
public class Nodo {
    private int inf;
    private Nodo sig;

    public Nodo() {
    }

    public Nodo(int inf, Nodo sig) {
        this.inf = inf;
        this.sig = sig;
    }

    public Nodo(int inf) {
        this.inf = inf;
        this.sig = null;
    }

    public Nodo(Nodo n) {
        this.inf = n.getInf();
        this.sig = n.getSig();
    }

    public int getInf() {
        return inf;
    }

    public void setInf(int inf) {
        this.inf = inf;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    @Override
    public String toString() {
        return "Nodo{" + "inf=" + inf + ", sig=" + sig + '}';
    }
}
