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
public class cardTropa extends card{
    
    private int ataque;

    public cardTropa(String name, int elixir, int vida, int ataque) {
        super(name, elixir, vida);
        this.ataque = ataque;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
    
}

