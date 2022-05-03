
package Ejercicio4.Entidades;

import Ejercicio4.Interfaces.CalculoFormas;
import java.util.Scanner;

/**
 *
 * @author franco
 */
public class Circulo implements CalculoFormas{
    double diametro,radio;

    public Circulo() {
    }

    public Circulo(double diametro, double radio) {
        this.diametro = diametro;
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    @Override
    public void calcularPerimetro() {
        double perimetro;
        
        System.out.println("Ingrese el diametro del circulo");
         diametro = leer.nextDouble();
        
        perimetro = pi * diametro;
        System.out.println("El perimetro del circulo es: "+perimetro);
    }

    @Override
    public void calcularArea() {
       
        double area;
        System.out.println("Ingrese el radio del circulo");
         radio = leer.nextDouble();
        
        area = pi *Math.pow(radio, 2);
        System.out.println("El area del circulo es: "+area);
        
        
        
    }
    
}
