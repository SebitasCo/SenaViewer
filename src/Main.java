import edu.misena.senaviewer.model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean exit = false;

            while (!exit) {
                mostrarMenu();
                int opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:

                        System.out.println("Lista de Peliculas: ");
                        break;
                    case 2:
                        System.out.println("Lista de Series: ");
                        break;
                    case 3:
                        System.out.println("Lista de Libros: ");
                        break;
                    case 4:
                        System.out.println("Lista de Revistas: ");
                        break;
                    case 5:
                        System.out.println("Lista de Reportes: ");
                        break;
                    case 6:
                        System.out.println("Reporte del dia: ");
                        break;
                    case 7:
                        exit = true;
                        System.out.println("Saliendo de la aplicación. ¡Hasta luego!");
                        break;
                    default:
                        System.out.println("Error: Selecciona una opción válida (0-6).");
                }


                if (!exit) {
                    System.out.println("\nPresiona Enter para regresar al menú...");
                    scanner.nextLine();
                }
            }

            scanner.close();
        }

        public static void mostrarMenu() {
            System.out.println("=== Menú Principal ===");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("3. Books");
            System.out.println("4. Magazines");
            System.out.println("5. Report");
            System.out.println("6. Report Today");
            System.out.println("0. Exit");
            System.out.print("Selecciona una opción: ");
        }



    }