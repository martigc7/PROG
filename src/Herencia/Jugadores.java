/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;
import java.util.ArrayList;
/**
 *
 * @author 47942307a
 */
public class Jugadores {
    private String usuario;
    private String password;
    private int trofeos;
    private ArrayList Card;

    public Jugadores(String usuario, String password, int trofeos) {
        this.usuario = usuario;
        this.password = password;
        this.trofeos = trofeos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTrofeos() {
        return trofeos;
    }

    public void setTrofeos(int trofeos) {
        this.trofeos = trofeos;
    }

    public ArrayList getCard() {
        return Card;
    }

    public void setCard(ArrayList Card) {
        this.Card = Card;
    }
    
    
}
