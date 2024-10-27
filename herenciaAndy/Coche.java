package herenciaAndy;

public class Coche extends VehiculoH{
    int cantidadPuertas;

    public  Coche(String modelo, String tipoDeCombustible, int cantidadPuertas){
        super(modelo, tipoDeCombustible);
        this.cantidadPuertas = cantidadPuertas;
    }
    
    public void tocarPito(){
        System.out.println("El auto toca el claxofon, PIIIIII!!!!!!!!");
    }
    @Override
    public void mostrarDetallesDeVehiculo(){
        super.mostrarDetallesDeVehiculo();
        System.out.println("Numero de puertas "+ cantidadPuertas);
    }
}
