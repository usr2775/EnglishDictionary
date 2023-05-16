package duolingo.util;

public class SanitizarPalabras {
    public static String sanitizarPalabra(String palabra) {
        String palabraSanitizada = palabra.toLowerCase().trim();
        return palabraSanitizada;
    }
}
