package FiguraPolimorfismo;

public class Circulo extends Figura{
    double radio;
    double pi = 3.14;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea(){
        return pi*radio*radio;  
    }
}
