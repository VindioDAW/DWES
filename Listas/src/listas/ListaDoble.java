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
public class ListaDoble {
    private NodoDoble ini;
    private NodoDoble fin;

    public ListaDoble() {
    }

    public ListaDoble(NodoDoble ini, NodoDoble fin) {
        this.ini = ini;
        this.fin = fin;
    }
    
    public ListaDoble(ListaDoble l) {
        this.ini = l.getIni();
        this.fin = l.getFin();
    }

    public NodoDoble getIni() {
        return ini;
    }

    public void setIni(NodoDoble ini) {
        this.ini = ini;
    }

    public NodoDoble getFin() {
        return fin;
    }

    public void setFin(NodoDoble fin) {
        this.fin = fin;
    }
    
    public void addFirst(int i){
        NodoDoble n = new NodoDoble(i);
        n.setSig(this.getIni());
        this.setIni(n);
    }
    
    public void addLast(int i){
        NodoDoble n = new NodoDoble(i);
        n.setAnt(this.getFin());
        this.setFin(n);
    }
    
    public int indexOf(int i){
        int res = -1;
        int cont = 0;
        NodoDoble n = this.getIni();
        if(n.getInf() == i) res = 1;
        else {
            while(n.getInf()!=i){
                n = n.getSig();
                cont++;
                if(n.getInf() == i) {
                    res = 1;
                    break;
                }
                if(n.getSig() == null) break;
            }
        }
        if (res != -1) return cont;
        else return res;
    }
    
    public int lastIndexOf(int i){
        int cont = 0;
        int res = -1;
        NodoDoble n = this.getIni();
        if(n.getSig() == null){
            if (n.getInf() == i) return cont;
            else return res;
        }
        else {
            while (n != null){
                if (n.getInf() == i) res = cont;
                n = n.getSig();
                cont++;
            }
        }
        return res;
    }
    
    public boolean removeFirst(int i){
        NodoDoble borrar = this.getIni();
        NodoDoble anterior = this.getIni();
        NodoDoble posterior = borrar.getSig();
        boolean res = false;
        if (borrar.getInf() == i) {
            this.setIni(posterior);
            posterior.setAnt(null);
            borrar = null;
            res = true;
        }
        else {
            borrar = borrar.getSig();
            posterior = borrar.getSig();
        }
        while (borrar.getInf() != i && borrar!= null){
            anterior = borrar;
            borrar = borrar.getSig();
            posterior = borrar.getSig();
        }
        if (borrar.getInf() == i){
            anterior.setSig(posterior);
            posterior.setAnt(anterior);
            if(posterior == null) this.setFin(anterior);
            borrar = null;
            res = true;
        }
        return res;
    }
    
    public boolean removeLast(int i){
        NodoDoble borrar = this.getFin();
        NodoDoble posterior = this.getFin();
        NodoDoble anterior = borrar.getAnt();
        boolean res = false;
        if (borrar.getInf() == i) {
            this.setFin(anterior);
            if(this.getFin()==null) this.setIni(null);
            borrar = null;
            res = true;
        }
        else {
            borrar = borrar.getAnt();
            anterior = borrar.getAnt();
        }
        while (borrar.getInf() != i && borrar!= null){
            posterior = borrar;
            borrar = borrar.getAnt();
            anterior = borrar.getAnt();
        }
        if (borrar.getInf() == i){
            posterior.setAnt(anterior);
            anterior.setSig(posterior);
            if (anterior == null) this.setIni(posterior);
            borrar = null;
            res = true;
        }
        return res;
    }
    
    public void addListFirst(ListaDoble l){
        NodoDoble finl = l.getFin();
        NodoDoble inithis = this.getIni();
        finl.setSig(inithis);
        inithis.setAnt(finl);
        this.setIni(l.getIni());
    }
    
    public void addListLast(ListaDoble l){
        NodoDoble inil = l.getIni();
        NodoDoble finthis = this.getFin();
        inil.setAnt(finthis);
        finthis.setSig(inil);
        this.setFin(l.getFin());
    }
    
    public void mostrarIniFin(){
        String res = "";
        NodoDoble n = this.getIni();
        while(n != null){
            res = res + n.getInf()+ " " ;
            n = n.getSig();
        }
        System.out.println(res);
    }
    
    public void mostrarFinIni(){
        String res = "";
        NodoDoble n = this.getFin();
        while(n != null){
            res = res + n.getInf()+ " " ;
            n = n.getAnt();
        }
        System.out.println(res);
    }
    
    public boolean buscar(int i){
        boolean res = false;
        NodoDoble n = this.getIni();
        while (n != null){
            if(n.getInf() == i){
                res = true;
                break;
            }
            n = n.getSig();
        }
        return res;
    }
}
