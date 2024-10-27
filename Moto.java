

public class Moto extends Vehiculo{
    public void encenderLuces(){
        System.out.println("Las luces de la moto esta encendida");
    }
    public void activarPito(){
        System.out.println("El pito esta activado. PIIII");
    }
    @Override
    public void encender(){
        encenderLuces();
        activarPito();
    }
    @Override
    public void acelerar(){
        System.out.println("La moto esta acelerando");
    }
    
}
