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
public class cardEstructura extends card {

    private int defensa;
    
    public cardEstructura(String name, int elixir, int vida, int defensa) {
        super(name, elixir, vida);
        this.defensa = defensa;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }
    
}
