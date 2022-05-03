
package Ejercicio4;

import Ejercicio4.Entidades.Circulo;
import Ejercicio4.Entidades.Rectangulo;

/**
 *
 * @author franc
 */
public class Main {

    
    public static void main(String[] args) {
        
        Circulo c = new Circulo();
        
        System.out.println("\033[31m Calcular area del circulo");
        c.calcularArea();
        
        System.out.println("\033[31m Calcular perimetro del circulo");
        c.calcularPerimetro();
        
        Rectangulo r = new Rectangulo();
        
        System.out.println("\033[31m Calcular area del Rectangulo");
        r.calcularArea();
        
        System.out.println("\033[31m Calcular perimetro del Rectangulo");
        r.calcularPerimetro();
    }
    
}
