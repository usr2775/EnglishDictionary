package duolingo.util;

public class SanitizarPalabra {
    public static String sanitizarPalabra(String palabra) {
        String palabraSanitizada = palabra.toLowerCase().trim();
        return palabraSanitizada;
    }
}
