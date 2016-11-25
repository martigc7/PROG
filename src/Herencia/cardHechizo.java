/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author 47942307a
 */
public class cardHechizo extends card {
    private int rango;
    private String modo;

    public cardHechizo(String name, int elixir, int vida, int rango, String modo) {
        super(name, elixir, vida);
        this.rango = rango;
        this.modo = modo;
    }

    public int getRango() {
        return rango;
    }

    public void setRango(int rango) {
        this.rango = rango;
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

    
    
}
