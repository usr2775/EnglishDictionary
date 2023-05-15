package duolingo.entities;
import java.util.*;

public class PalabrasPorInicial {
    private Map<Character, List<String>> palabras;

    public PalabrasPorInicial() {
        palabras = new HashMap<>();
    }

    public void agregarPalabra(String palabra) {
        String palabraSanitizada = SanitizarPalabras.sanitizarPalabra(palabra);
        char inicial = palabraSanitizada.charAt(0);
        if (!palabras.containsKey(inicial)) {
            palabras.put(inicial, new ArrayList<>());
        }
        List<String> lista = palabras.get(inicial);
        if (!lista.contains(palabra)) {
            lista.add(palabra);
        }
    }
}