package FiguraPolimorfismo;

public class Figura {
    public double calcularArea(){
        return 0; // n° x defecto
    }

    public static void main(String[] args) {
        Circulo circulo = new Circulo(2.5);
        System.out.println("El área del circulo es: "+circulo.calcularArea());
        
        Cuadrado cuadrado= new Cuadrado(4.5);
        System.out.println("El área del cuadrado es: "+cuadrado.calcularArea());
        
        Triangulo triangulo = new Triangulo(3.8, 4.8);
        System.out.println("El área del triangulo es: "+ triangulo.calcularArea());

    }

}

