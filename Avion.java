public class Avion extends Vehiculo{
    public void calefaccionarCarburador(){
        System.out.println("Carburador listo");
    }
    public void regularMezclaDeCombustible(){
        System.out.println("Mezcla de combustible regulada");
    }
    @Override
    public void encender(){
        calefaccionarCarburador();
        regularMezclaDeCombustible();
    }
    @Override
    public void acelerar(){
        System.out.println("El avión esta acelerando");
    }
}
