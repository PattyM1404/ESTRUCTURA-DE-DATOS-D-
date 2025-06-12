package ec.edu.uea.tareasemana3;

public class TareaSemana3 {
    /*Elabore un documento PDF que contenga la definición de las clases, 
    arrays y/o matrices necesarias en C# o Java para manejar el registro de un 
    estudiante que posea los siguientes datos (id, nombres, apellidos, dirección 
    y tres teléfonos*/ 
    public static void main(String[] args) {
        String[] telefonos = {"0991111111", "0992222222", "0993333333"};
        Estudiante estudiante = new Estudiante(1, "Patricia", "Matute", "Av. Ruta Viva 123", telefonos);
        
        estudiante.mostrarDatos();
    }
}

