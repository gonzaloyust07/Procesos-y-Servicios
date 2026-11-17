import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Contador {

    public static void main(String[] args) {
        if (args.length != 2 || args[1].length() != 1
                || "aeiouAEIOU".indexOf(args[1].charAt(0)) == -1) {
            System.err.println("Uso: Contador <fichero> <vocal>");
            System.exit(1);
        }

        char vocal = Character.toLowerCase(args[1].charAt(0));
        long cantidad = 0;

        try (BufferedReader lector = Files.newBufferedReader(Paths.get(args[0]))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                for (int i = 0; i < linea.length(); i++) {
                    if (Character.toLowerCase(linea.charAt(i)) == vocal) {
                        cantidad++;
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("No se pudo leer el fichero: " + e.getMessage());
            System.exit(1);
            return;
        }

        System.out.println("El numero de " + vocal + " es " + cantidad + ".");
    }
}
