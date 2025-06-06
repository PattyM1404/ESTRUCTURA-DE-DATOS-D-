public class FigurasGeometricas {
    public static void main(String[] args) {
        Circulo miCirculo = new Circulo(5);
        System.out.println("Área del círculo: " + miCirculo.calcularArea());
        System.out.println("Perímetro del círculo: " + miCirculo.calcularPerimetro());

        Rectangulo miRectangulo = new Rectangulo(4, 3);
        System.out.println("Área del rectángulo: " + miRectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + miRectangulo.calcularPerimetro());
    }
}
