//clase madre/padre
public class Vehiculo{
    public static void main(String[] args) {
        System.out.println("-------------AVION------------");
        probar(new Avion());
        System.out.println("------------BICICLETA---------");
        probar(new Bicicleta());
        System.out.println("--------------MOTO------------");
        probar(new Moto());

        //Avion avion = new Avion();
        //avion.encender();
        //Creando objeto, para acceder a los métodos por separado
        Moto moto1= new Moto();
        moto1.acelerar();
    }

    public static void probar(Vehiculo v) {
        v.encender();
    }

    public void encender(){
        System.out.println("El vehículo esta encendido");
    }
    
    public void acelerar(){
        System.out.println("El vehículo esta acelerando");
    }
}