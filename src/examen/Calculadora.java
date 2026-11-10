package examen;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        // Leemos los datos que nos envía Principal.
        Scanner entrada = new Scanner(System.in);
        // Se leen en el mismo orden en que Principal los envía.
        int operacion = entrada.nextInt();
        int numero1 = entrada.nextInt();
        int numero2 = entrada.nextInt();
        String ficheroResultado = entrada.next();
        entrada.close();

        String nombreOperacion;
        String simbolo;
        int resultado;

        // Según la opción, elegimos la operación y el símbolo que irá en el fichero.
        switch (operacion) {
            case 1:
                nombreOperacion = "suma";
                simbolo = "+";
                resultado = numero1 + numero2;
                break;
            case 2:
                nombreOperacion = "resta";
                simbolo = "-";
                resultado = numero1 - numero2;
                break;
            case 3:
                nombreOperacion = "multiplicación";
                simbolo = "*";
                resultado = numero1 * numero2;
                break;
            case 4:
                if (numero2 == 0) {
                    System.out.println("No se puede dividir entre cero.");
                    System.exit(1);
                    return;
                }
                nombreOperacion = "División";
                simbolo = "/";
                // Al ser números enteros, el resultado de la división también es entero.
                resultado = numero1 / numero2;
                break;
            default:
                // No se escribe ningún resultado si la opción no existe.
                System.out.println("La operación debe estar entre 1 y 4.");
                System.exit(1);
                return;
        }

        String linea = "La " + nombreOperacion + " de "
                + numero1 + " " + simbolo + " " + numero2 + " es " + resultado;

        try {
            // Guardamos el resultado al final del fichero.
            // El true hace que se añada una línea sin borrar las anteriores.
            PrintWriter escritor = new PrintWriter(new FileWriter(ficheroResultado, true));
            escritor.println(linea);
            escritor.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
