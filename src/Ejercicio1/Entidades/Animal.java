
package Ejercicio1.Entidades;

/**
 *
 * @author Franco
 */
public class Animal {
    protected String nombre;
    protected int edad;
    protected String alimento;
    protected String raza;

    public Animal(String nombre, int edad, String alimento, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.alimento = alimento;
        this.raza = raza;
    }

    public Animal() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", edad=" + edad + ", alimento=" + alimento + ", raza=" + raza + '}';
    }
    
    public void alimentarse(){
        System.out.println("Nombre: "+nombre+"\n"
                + "Raza: "+raza+"\n"
                + "Se alimenta a base de: "+alimento);
        System.out.println("======================");
    }
    
    
}
