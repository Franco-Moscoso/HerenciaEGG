
package Ejercicio1;

import Ejercicio1.Entidades.Animal;
import Ejercicio1.Entidades.Caballo;
import Ejercicio1.Entidades.Gato;
import Ejercicio1.Entidades.Perro;
import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Animal perro = new Perro("Loki",2,"Royal Canin","Ovejero");
        perro.alimentarse();
        
        Perro perro1 = new Perro("Kala",4,"Balanceado","Ovejero");
        perro1.alimentarse();
        
        Gato gato = new Gato("Michi",1,"Pescado","Siberiano");
        gato.alimentarse();
        
        Caballo caballo = new Caballo("Sultan",2,"Pasto","Shire");
        caballo.alimentarse();
    }
    
}
