using System; // Importa el espacio de nombres básico de .NET

namespace RegistroEstudiante
{
    // Definición de la clase Estudiante
    class Estudiante
    {
        // Atributos o propiedades públicas del estudiante
        public int Id;               // Número de identificación del estudiante
        public string Nombres;      // Nombres del estudiante
        public string Apellidos;    // Apellidos del estudiante
        public string Direccion;    // Dirección de domicilio
        public string[] Telefonos;  // Arreglo de 3 teléfonos personales

        // Constructor: se ejecuta cuando se crea una nueva instancia de Estudiante
        public Estudiante(int id, string nombres, string apellidos, string direccion, string[] telefonos)
        {
            // Asignación de parámetros a los atributos
            Id = id;
            Nombres = nombres;
            Apellidos = apellidos;
            Direccion = direccion;
            Telefonos = telefonos;
        }

        // Método que muestra por pantalla la información del estudiante
        public void MostrarInformacion()
        {
            Console.WriteLine("\n===== INFORMACIÓN DEL ESTUDIANTE =====");
            Console.WriteLine($"ID: {Id}"); // Muestra el ID
            Console.WriteLine($"Nombres: {Nombres}"); // Muestra los nombres
            Console.WriteLine($"Apellidos: {Apellidos}"); // Muestra los apellidos
            Console.WriteLine($"Dirección: {Direccion}"); // Muestra la dirección

            // Muestra los teléfonos uno por uno usando un bucle
            Console.WriteLine("Teléfonos:");
            for (int i = 0; i < Telefonos.Length; i++)
            {
                Console.WriteLine($"  Teléfono {i + 1}: {Telefonos[i]}");
            }
        }
    }

    // Clase principal donde se ejecuta el programa
    class Program
    {
        // Método principal, punto de entrada del programa
        static void Main(string[] args)
        {
            // Ingreso del ID del estudiante con validación para evitar errores
            Console.Write("Ingrese el ID del estudiante: ");
            int id;
            // Mientras el usuario no ingrese un número válido, se repite la solicitud
            while (!int.TryParse(Console.ReadLine(), out id))
            {
                Console.Write("ID inválido. Intente de nuevo: ");
            }

            // Ingreso de nombres (verifica que no sea nulo o vacío)
            Console.Write("Ingrese los nombres del estudiante: ");
            string nombres = LeerTextoNoVacio();

            // Ingreso de apellidos
            Console.Write("Ingrese los apellidos del estudiante: ");
            string apellidos = LeerTextoNoVacio();

            // Ingreso de dirección
            Console.Write("Ingrese la dirección del estudiante: ");
            string direccion = LeerTextoNoVacio();

            // Ingreso de los 3 teléfonos utilizando un array
            string[] telefonos = new string[3];
            for (int i = 0; i < 3; i++)
            {
                Console.Write($"Ingrese el teléfono {i + 1}: ");
                telefonos[i] = LeerTextoNoVacio(); // Valida cada teléfono
            }

            // Se crea un nuevo objeto de tipo Estudiante con los datos recolectados
            Estudiante estudiante = new Estudiante(id, nombres, apellidos, direccion, telefonos);

            // Llamada al método que muestra la información del estudiante
            estudiante.MostrarInformacion();
        }

        // Método auxiliar que asegura que el texto ingresado no sea nulo o vacío
        static string LeerTextoNoVacio()
        {
            string? entrada; // Permite entrada posiblemente nula
            do
            {
                entrada = Console.ReadLine(); // Lectura desde consola
                if (string.IsNullOrWhiteSpace(entrada)) // Verifica si es nulo o solo espacios
                {
                    Console.Write("Entrada vacía, intente de nuevo: ");
                }
            } while (string.IsNullOrWhiteSpace(entrada)); // Se repite hasta que no esté vacío

            return entrada; // Devuelve el valor válido ingresado
        }
    }
}
