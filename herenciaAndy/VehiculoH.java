package herenciaAndy;
/*Crea una clase base Vehiculo con atributos de modelo y tipo de combustible.
Luego, crea dos clases derivadas, Coche y Moto, que hereden Vehiculo y añadan características y
métodos específicos para cada uno. */
public class VehiculoH {
    String modelo; String tipoDeCombustible;
    public VehiculoH(String modelo, String tipoDeCombustible){
        this.modelo= modelo;
        this.tipoDeCombustible = tipoDeCombustible;
    }

    public void mostrarDetallesDeVehiculo(){
        System.out.println("El modelo es: "+ modelo + " su tipo de combustibles es " + tipoDeCombustible);
    }
    public static void main(String[] args) {
        Coche coche = new Coche("BMW M2 competetion", " Premium", 4);
        MotoH moto1 = new MotoH("Naked", "Premium y Regular", 25);

        coche.mostrarDetallesDeVehiculo();
        System.out.println();
        moto1.mostrarDetallesDeVehiculo();
    }
}
