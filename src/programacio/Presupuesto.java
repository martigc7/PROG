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
public class Presupuesto {
    private int id;
    private String concepto;
    private double precio;
    private String estado;
    
    public Presupuesto(int id, String concepto, double precioDes, String estado){
        this.id=id;
        this.concepto=concepto;
        this.precio=precio;
        this.estado=estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
