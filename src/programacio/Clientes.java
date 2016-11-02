/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacio;

/**
 *
 * @author 47942307a
 */
public class Clientes {
    private String nombre;
    private String apellidos;
    private int telefono;
    private boolean vip;
    
    public Clientes() {
    }
    
    private ListaPresupuestos presupuestosC;

    public ListaPresupuestos getPresupuestosC() {
        return presupuestosC;
    }

    public void setPresupuestosC(ListaPresupuestos presupuestosC) {
        this.presupuestosC = presupuestosC;
    }

    
    public Clientes(String nombre, String apellidos, int telefono, boolean vip){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.telefono=telefono;
        this.vip=vip;
        this.presupuestosC=new ListaPresupuestos();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }
    
}
