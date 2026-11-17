package procesos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Principal1 {
    static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String classpath = System.getProperty("java.class.path");
        String opcion = "";
        String cadena = "";

        do {
            System.out.println("Escoge una opcion:" +
                    "\n1. Transformar cadena a minusculas" +
                    "\n2. Eliminar espacios" +
                    "\n0. Salir");
            opcion = sc.nextLine();
                switch (opcion){
                    case "1": {
                        System.out.println("escribe una cadena, asegurate de que tenga caracteres en mayuscula: ");
                        cadena = sc.nextLine();
                        System.out.println("------------------------------------");
                    }
                        break;
                    case "2": {
                        System.out.println("escribe una cadena, asegurate de que tenga espacios");
                        cadena = sc.nextLine();
                        System.out.println("------------------------------------");

                    }
                        break;
                    case "0":{
                        System.out.println("Finalizando ejecución");
                    }
                        break;
                    default:{
                        System.out.println("Opcion no disponible, por favor, escribe una opcion correcta");
                    }
                }

            Process proceso = new ProcessBuilder("java", "-cp", classpath, "Secundario1", opcion, cadena).start();

            BufferedReader br = new BufferedReader(new InputStreamReader(((Process) proceso).getInputStream()));
            System.out.println(br.readLine()+"\n");


        } while (opcion == "0");


    }
}
