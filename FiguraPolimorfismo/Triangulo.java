package FiguraPolimorfismo;

public class Triangulo {
    double base; double altura;

    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double  calcularArea(){
        return (base*altura)/2;
    }
}
