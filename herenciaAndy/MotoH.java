package herenciaAndy;

public class MotoH extends VehiculoH{
    double kilometraje;
    
    public  MotoH(String modelo, String tipoDeCombustible, double kilometraje){
        super(modelo, tipoDeCombustible); //cosntructor clase madre
        this.kilometraje = kilometraje;
    }

    public void hacerCaballito(){
        System.out.println("La moto esta haciendo caballito");
    }
    @Override
    public void mostrarDetallesDeVehiculo(){
        super.mostrarDetallesDeVehiculo();
        System.out.println("El kilometraje "+ kilometraje+ " km/l");
    }
}
