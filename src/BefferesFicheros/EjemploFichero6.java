package BefferesFicheros;

//Leer los numeros que se encuentran en un fichero de texto, colocados cada uno en una línea
//e imprimir la media por consola. El nombre del fichero se pasa como argumento de la línea
//
// de comandos

import java.io.BufferedReader;
import java.io.FileReader;

public class EjemploFichero6 {

    public static void main(String[] args) {
        int suma = 0;
        int i = 0;

        try {
            BufferedReader bf = new BufferedReader(new FileReader(args[0]));
            String linea = bf.readLine();
            while (linea != null) {
                suma += Integer.parseInt(linea);
                i++;
                linea = bf.readLine();
            }
            bf.close();
            double media = (double) suma / i;
            System.out.println("La media es: " + media + " y se han leido " + i + " numeros");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
