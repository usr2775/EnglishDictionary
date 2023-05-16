import duolingo.entities.*;


import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PalabrasPorInicial diccionario = new PalabrasPorInicial();
        System.out.println("Bienvenido al diccionario de palabras por inicial.");

        int opcion = 0;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Añadir palabra");
            System.out.println("2. Eliminar palabra");
            System.out.println("3. Existe palabra");
            System.out.println("4. Mostrar iniciales disponibles");
            System.out.println("5. Ver palabras por inicial");
            System.out.println("6. Cerrar programa");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.print("Introduzca la palabra que desea añadir: ");
                    String palabraAgregar = sc.nextLine();
                    diccionario.agregarPalabra(palabraAgregar);
                    System.out.println("La palabra se ha añadido correctamente.");
                    break;
                case 2:
                    System.out.println("Introduce la alabra que desea eliminar:");
                    String palabraEliminar = sc.nextLine();
                    if (diccionario.eliminarPalabra(palabraEliminar)) {
                        System.out.println("La palabra se ha eliminado correctamente.");
                    } else {
                        System.out.println("La palabra no estaba almacenada.");
                    }
                    break;
                case 3:
                    System.out.print("Introduzca la palabra que desea buscar: ");
                    String palabraBuscar = sc.nextLine();
                    if (diccionario.existePalabra(palabraBuscar)) {
                        System.out.println("La palabra" + palabraBuscar + " se ha encontrado.");
                    } else {
                        System.out.println("La palabra" + palabraBuscar + " no se ha encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("Iniciales disponibles: " + diccionario.obtenerIniciales());
                    break;
                case 5:
                    System.out.print("Introduzca la letra de la inicial que desea buscar: ");
                    char inicial = sc.nextLine().charAt(0);
                    System.out.println("Palabras por inicial: " + diccionario.obtenerPalabras(inicial));
                    break;
                case 6:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 6);
    }
}