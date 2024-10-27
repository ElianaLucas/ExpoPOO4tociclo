public class Bicicleta extends Vehiculo {
    public void prenderPantalla(){
        System.out.println("Pantala prendida");
    }
    public void energizarMotor(){
        System.out.println("Motor listo");
    }

    @Override
    public void encender(){
        prenderPantalla();
        energizarMotor();
    }
    @Override
    public void acelerar(){
        System.out.println("La bicicleta esta acelerando");
    }
}

