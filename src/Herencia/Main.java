package Herencia;
import static tools.InputData.pedirEntero;


public class Main {
    
     public static void main(String[] args) {
     crearJugadoresyCartas();
   int menu = 0;
        do {
            showMenu();
            menu = pedirEntero("Introduce una opción");
            switch (menu){
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
            }
        }while(menu != 4);

    }
     
    public static void crearJugadoresyCartas(){
        cardTropa guerrero = new cardTropa ("Guerrero",5,100,70);
        cardTropa arquero = new cardTropa ("Arquero",3,50,60);
        cardTropa paladin = new cardTropa ("Paladin",4,80,90);
        
        cardEstructura castillo = new cardEstructura ("Castillo",5,100,100);
        cardEstructura ballesta = new cardEstructura ("Ballesta",2,50,50);
        cardEstructura catapulta = new cardEstructura ("Catapulta",4,70,60);
        
        cardHechizo fuego = new cardHechizo ("Fuego",5,50,70,"Daño");
        cardHechizo veneno = new cardHechizo ("Veneno",3,50,40,"Daño");
        cardHechizo luz = new cardHechizo ("Luz",5,50,100,"Curacion");
        
        Jugadores jugador1 = new Jugadores ("Marti","12345",0);
        Jugadores jugador2 = new Jugadores ("Albert","12345",0);
        Jugadores jugador3 = new Jugadores ("Arnau","12345",0);
    }
            
    public static void showMenu(){
        System.out.println("** Menú principal **");
        System.out.println("1. Conseguir Cartas");
        System.out.println("2. Batalla");
        System.out.println("3. Obtener Ranking");

    }
}
