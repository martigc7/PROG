/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacio;

import java.util.ArrayList;

/**
 *
 * @author 47942307a
 */
public class ListaPresupuestos {
    
    private ArrayList<Presupuesto> lista;

    public ListaPresupuestos() {
        lista=new ArrayList<>();
    }

    public ArrayList<Presupuesto> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Presupuesto> lista) {
        this.lista = lista;
    }

}
