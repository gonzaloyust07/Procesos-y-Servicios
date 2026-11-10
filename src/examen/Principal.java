package examen;

import java.io.PrintWriter;
import java.util.Scanner;

public class Principal {

    private static final String FICHERO_RESULTADO = "resultados_calculadora.txt";

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Empezamos con una opción distinta de 0 para mostrar el menú.
        int opcion = -1;

        // Esta ruta permite que Java encuentre la clase Calculadora.
        String classpath = System.getProperty("java.class.path");

        // El menú se repite hasta que el usuario elige salir.
        while (opcion != 0) {
            System.out.println();
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            // Comprobamos que la opción introducida sea un número.
            if (!entrada.hasNextInt()) {
                System.out.println("Introduce una opción numérica.");
                // Quitamos el dato incorrecto para poder volver a preguntar.
                entrada.next();
                continue;
            }
            opcion = entrada.nextInt();

            // Solo pedimos los operandos si se ha elegido una operación válida.
            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Introduce el primer número: ");
                int numero1 = leerNumero(entrada);
                System.out.print("Introduce el segundo número: ");
                int numero2 = leerNumero(entrada);

                // Iniciamos Calculadora y le pasamos los datos que necesita.
                try { // java ejecuta el programa y -cp indica dónde buscar las clases.
                    Process proceso = new ProcessBuilder("java", "-cp", classpath, "examen.Calculadora")
                            .redirectError(ProcessBuilder.Redirect.INHERIT).start();

                    // Enviamos los valores en el mismo orden en que Calculadora los lee.
                    PrintWriter escritor = new PrintWriter(proceso.getOutputStream());
                    escritor.println(opcion);
                    escritor.println(numero1);
                    escritor.println(numero2);
                    escritor.println(FICHERO_RESULTADO);
                    escritor.close();

                    // Esperamos a que termine el proceso hijo antes de volver al menú.
                    int codigoSalida = proceso.waitFor();
                    if (codigoSalida == 0) {
                        System.out.println("Resultado guardado en " + FICHERO_RESULTADO);
                    } else {
                        System.out.println("No se pudo realizar la operación.");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (opcion != 0) {
                // El 0 sale del bucle; cualquier otra opción fuera de 1-4 no es válida.
                System.out.println("Opción no válida.");
            }
        }

        entrada.close();
    }

    private static int leerNumero(Scanner entrada) {
        // Si no se escribe un entero, lo descartamos y volvemos a pedirlo.
        while (!entrada.hasNextInt()) {
            System.out.println("Introduce un número entero.");
            entrada.next();
        }
        // Devolvemos el número para que se pueda enviar al proceso Calculadora.
        return entrada.nextInt();
    }
}
