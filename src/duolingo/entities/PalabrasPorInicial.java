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

    public boolean eliminarPalabra(String palabra) {
        char inicial = Character.toLowerCase(palabra.charAt(0));
        List<String> palabrasIniciales = palabras.get(inicial);
        if (palabrasIniciales != null && palabrasIniciales.remove(palabra.toLowerCase())) {
            if (palabrasIniciales.isEmpty()) {
                palabras.remove(inicial);
            }
            return true;
        }
        return false;
    }

}