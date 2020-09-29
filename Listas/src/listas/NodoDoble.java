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
public class NodoDoble {
    private NodoDoble ant;
    private NodoDoble sig;
    private int inf;

    public NodoDoble() {
    }

    public NodoDoble(NodoDoble ant, NodoDoble sig, int inf) {
        this.ant = ant;
        this.sig = sig;
        this.inf = inf;
    }

    public NodoDoble(int inf) {
        this.inf = inf;
    }
    
    public NodoDoble(NodoDoble n) {
        this.ant = n.getAnt();
        this.sig = n.getSig();
        this.inf = n.getInf();
    }

    public NodoDoble getAnt() {
        return ant;
    }

    public void setAnt(NodoDoble ant) {
        this.ant = ant;
    }

    public NodoDoble getSig() {
        return sig;
    }

    public void setSig(NodoDoble sig) {
        this.sig = sig;
    }

    public int getInf() {
        return inf;
    }

    public void setInf(int inf) {
        this.inf = inf;
    }

    @Override
    public String toString() {
        return "NodoDoble{" + "ant=" + ant + ", sig=" + sig + ", inf=" + inf + '}';
    }
}
