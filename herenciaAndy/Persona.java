package herenciaAndy;
/*Crea una clase base Persona con un constructor que reciba el nombre y la edad de la persona.
 Luego, crea dos clases derivadas, Estudiante y Profesor,
 que hereden de Persona y agreguen atributos específicos para cada una, usando sus propios constructores. */
public class Persona {
    protected String nombre;  protected int edad;
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public void mostrarInformacion(){
        System.out.println("Nombre "+ nombre+" edad "+ edad);
    }
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Lukas ", 20, " TICS");
        Profesor profe = new Profesor("Lalito ", 30, " Matemáticas");
        estudiante.mostrarInformacion();
        System.out.println();
        profe.mostrarInformacion();
    }
}
