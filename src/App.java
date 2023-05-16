import duolingo.entities.*;
import duolingo.util.*;

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
          
    }
}