package FiguraPolimorfismo;

public class Cuadrado extends Figura{
    double lado;

    public Cuadrado(double lado){
        this.lado = lado;

    }
    @Override
    public double  calcularArea(){
        return lado*lado;
    }   
}

