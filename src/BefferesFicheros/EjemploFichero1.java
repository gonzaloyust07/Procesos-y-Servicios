package BefferesFicheros;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EjemploFichero1 {
    public static void main(String[]args){

        // Lectura de un fichero de texto y escribir por consola el contenido
        try {
            BufferedReader lector = new BufferedReader(new FileReader("texto.txt"));
            String linea = "";
            while (linea != null) {
                System.out.println(linea);
                linea = lector.readLine();
            }
            lector.close();
        } catch(FileNotFoundException fnef) {
            System.out.println("No se encuentra el fichero de texto.txt");
        } catch(IOException ioe) {
            System.out.println("No se puede leer el fichero texto.txt");
        }
    }
}
