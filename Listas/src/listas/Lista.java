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
public class Lista {
    private Nodo ini;

    public Lista() {
        this.ini = null;
    }

    public Lista(Nodo ini) {
        this.ini = ini;
    }

    public Nodo getIni() {
        return ini;
    }

    public void setIni(Nodo ini) {
        this.ini = ini;
    }
    
    public void addFirst(int i){
        Nodo n = new Nodo(i, this.getIni());
        this.setIni(n);
    }
    
    public void addLast(int i){
        Nodo n = new Nodo(i, null);
        Nodo temp = this.getIni();
        while(temp.getSig() != null){
            temp = temp.getSig();
        }
        temp.setSig(n);
    }
    
    public int indexOf(int i){
        int res = -1;
        int cont = 0;
        Nodo n = this.getIni();
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
        Nodo n = this.getIni();
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
    
    public boolean remove(int i){
        Nodo borrar = this.getIni();
        Nodo anterior = this.getIni();
        boolean res = false;
        if (borrar.getInf() == i) {
            this.setIni(borrar.getSig());
            borrar = null;
            res = true;
        }
        else borrar = borrar.getSig();
        while (borrar.getInf() != i && borrar.getSig()!= null){
            anterior = borrar;
            borrar = borrar.getSig();
        }
        if (borrar.getInf() == i){
            anterior.setSig(borrar.getSig());
            borrar = null;
            res = true;
        }
        return res;
    }
    
    public void addListFirst(Lista l){
        Nodo n = l.getIni();
        while(n.getSig() != null) n = n.getSig();
        n.setSig(this.getIni());
        this.setIni(l.getIni());
    }
    
    public void addListLast(Lista l){
        Nodo n = this.getIni();
        while(n.getSig() != null) n = n.getSig();
        n.setSig(l.getIni());
    }
    
    @Override
    public String toString(){
        String res = "";
        Nodo n = this.getIni();
        while(n != null){
            res = res + n.getInf()+ " " ;
            n = n.getSig();
        }
        return res;
    }
    
    public void mostrar(){
        System.out.println(this.toString());
    }
    
    public boolean buscar(int i){
        boolean res = false;
        Nodo n = this.getIni();
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
