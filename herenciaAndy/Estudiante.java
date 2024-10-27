package herenciaAndy;

public class Estudiante extends Persona{
    protected String carrera;
    public Estudiante(String nombre, int edad, String carrera){
        super(nombre,edad); //llama al constructor
        this.carrera = carrera;
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Carrera "+carrera);
    }

}
