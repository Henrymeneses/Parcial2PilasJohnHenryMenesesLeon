import java.util.Scanner;

/**
 * Clase principal que ejecuta el menú interactivo por consola.
 */
public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HistorialDocumento navegador = new HistorialDocumento();
        int opcion = 0;

        do {
            System.out.println("\n--- GESTOR DE DOCUMENTOS ---");
            System.out.println("1. Ingrese nuevo documento ");
            System.out.println("2. Retroceder al documento anterior ");
            System.out.println("3. Ver documento actual ");
            System.out.println("4. Ver historial completo");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("[!] Entrada inválida. Por favor, ingrese un número del 1 al 5.");
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del documento: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el tipo de documento: ");
                    String tipo = scanner.nextLine();
                    System.out.print("Ingrese la ruta del documento: ");
                    String ruta = scanner.nextLine();
                    navegador.visitarDocumento(nombre, tipo, ruta);
                    break;

                case 2:
                    navegador.retroceder();
                    break;

                case 3:
                    navegador.verDocumentoActual();
                    break;

                case 4:
                    navegador.verHistorial();
                    break;

                case 5:
                    System.out.println("\n¡Hasta luego!");
                    break;

                default:
                    System.out.println("[!] Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}