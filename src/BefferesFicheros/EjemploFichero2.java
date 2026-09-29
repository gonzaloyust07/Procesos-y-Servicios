package BefferesFicheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EjemploFichero2 {
    public static void main(String[]args){

        //Ejemplo de escritura de un fichero de texto
        //Escribe 3 o 4 palabras de un fichero

        Scanner sc = new Scanner(System.in);
        try {
            //Flujo de salida de escritura
            BufferedWriter bw = new BufferedWriter(new FileWriter("texto.txt"));
            System.out.println("Escribe una palabra: ");
            String palabra = sc.nextLine();


        //Mejora: Serás capaz de pedir esas palabras por teclado y escribirlas en un fichero??
        //Pararias de pedir palabras cuando la palabra introducida sea 'adios'

            while ( !palabra.equals("adios")) {
                bw.write(palabra);
                bw.newLine();
                System.out.println("Escribe otra palabra: ");
                palabra = sc.nextLine();
            }

            bw.close();

        } catch (IOException e) {
            System.out.println("No se puede escribir en el fichero texto.txt");
        }

    }
}