package herenciaAndy;

public class Profesor extends Persona{
    private String asignatura;
    public  Profesor(String nombre, int edad, String asignatura){
        super(nombre, edad);
        this.asignatura = asignatura;
    }
    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("La asignatura "+ asignatura);
    }
}
