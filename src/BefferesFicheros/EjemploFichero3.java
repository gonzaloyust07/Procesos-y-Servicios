package BefferesFicheros;

import java.io.*;

//Este ejercicio leera 2 ficheros de texto y unira todas sus líneas
//en un nuevo fichero mezclando el contenido de ambos ficheros

//Pista: hay que definir 2 lectores y un escritor
//2 BufferedReader y 1 BufferedWriter


public class EjemploFichero3 {
    public static void main(String[] args) {

        try {
            BufferedReader br1 = new BufferedReader(new FileReader("numeros.txt"));
            BufferedReader br2 = new BufferedReader(new FileReader("letras.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("mezcla.txt"));

            String lineaFichero1 = br1.readLine();
            String lineaFichero2 = br2.readLine();

            do {
                if(lineaFichero1 != null) {
                    bw.write(lineaFichero1);
                    bw.newLine();
                    lineaFichero1 = br1.readLine();
                }

                if(lineaFichero2 != null) {
                    bw.write(lineaFichero2);
                    bw.newLine();
                    lineaFichero2 = br2.readLine();
                }

            } while (lineaFichero1 != null || lineaFichero2 != null);

        } catch (IOException e) {
            System.out.println("No se puede leer el fichero numeros.txt");
        }
    }
}
//>>>SIN ACABAR<<<