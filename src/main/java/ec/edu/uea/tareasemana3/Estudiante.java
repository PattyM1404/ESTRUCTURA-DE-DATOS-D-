package ec.edu.uea.tareasemana3;

public class Estudiante {

    // ========================
    // Atributos (campos) privados
    // ========================

    // Datos no cambian, por eso es final
    private final int id; 
    private final String nombres;
    private final String apellidos;
    private final String direccion;
    private final String[] telefonos;

    // ========================
    // Constructor
    // ========================
    // Este constructor recibe todos los datos al momento de crear el objeto Estudiante
    public Estudiante(int id, String nombres, String apellidos, String direccion, String[] telefonos) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefonos = telefonos;
    }

    // ========================
    // Método para mostrar todos los datos del estudiante
    // ========================
    public void mostrarDatos() {
        System.out.println("ID: " + id);
        System.out.println("Nombres: " + nombres);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Direccion: " + direccion);

        // Recorremos el arreglo de teléfonos y mostramos cada uno
        for (int i = 0; i < telefonos.length; i++) {
            System.out.println("Telefono " + (i + 1) + ": " + telefonos[i]);
        }
    }
}
