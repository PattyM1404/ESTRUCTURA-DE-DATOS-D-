// Clase para representar un círculo
public class Circulo {
    private double radio; // tipo de dato primitivo double

    // Constructor que recibe el radio del círculo
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Método para calcular el área del círculo
    // Calcula usando la fórmula: π * radio^2
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    // Método para calcular el perímetro del círculo
    // Calcula usando la fórmula: 2 * π * radio
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

// Clase para representar un rectángulo
public class Rectangulo {
    private double base;    // tipo de dato primitivo double
    private double altura;  // tipo de dato primitivo double

    // Constructor que recibe la base y la altura
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método para calcular el área del rectángulo
    // Calcula usando la fórmula: base * altura
    public double calcularArea() {
        return base * altura;
    }

    // Método para calcular el perímetro del rectángulo
    // Calcula usando la fórmula: 2 * (base + altura)
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}

// Clase principal para probar las figuras
public class FigurasGeometricas {
    public static void main(String[] args) {
        // Crear un círculo con radio 5
        Circulo miCirculo = new Circulo(5);
        System.out.println("Área del círculo: " + miCirculo.calcularArea());
        System.out.println("Perímetro del círculo: " + miCirculo.calcularPerimetro());

        // Crear un rectángulo con base 4 y altura 3
        Rectangulo miRectangulo = new Rectangulo(4, 3);
        System.out.println("Área del rectángulo: " + miRectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + miRectangulo.calcularPerimetro());
    }
}
