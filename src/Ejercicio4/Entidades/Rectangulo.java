
package Ejercicio4.Entidades;

import Ejercicio4.Interfaces.CalculoFormas;
import java.util.Scanner;

/**
 *
 * @author franco
 */
public class Rectangulo implements CalculoFormas {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    double base,altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    @Override
    public void calcularPerimetro() {
        double perimetro;
        System.out.println("Ingrese la base del rectangulo");
        base = leer.nextDouble();
        
        System.out.println("Ingrese la altura del rectangulo");
        altura = leer.nextDouble();
        
        perimetro = (base + altura) *2;
        System.out.println("El perimetro del rectangulo es: "+perimetro);
    }

    @Override
    public void calcularArea() {
        double area;
        System.out.println("Ingrese la base del rectangulo");
        base = leer.nextDouble();
        
        System.out.println("Ingrese la altura del rectangulo");
        altura = leer.nextDouble();
        
        area = base * altura;
        System.out.println("El area del rectangulo es: "+area);
    }
    
}
