package BefferesFicheros;

import java.io.File;

public class EjemploFichero4 {
     //Ejercicio de listar los ficheros del directorio actual
     //o cualquier otro
    File f = new File(".");
    String[] listaArchivos = f.list();

}
