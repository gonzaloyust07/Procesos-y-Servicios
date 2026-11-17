import java.io.*;

public class PrincipalContabilidad {


    public static void main(String[] args) throws IOException {

        String classpath = System.getProperty("java.class.path");

        int total = 0;  //se refiere a la suma total de todas las contabilidades de los ficheros
        String[] ficheros = {"informatica.txt", "gerencia.txt", "contabilidad.txt",
                "comercio.txt", "rrhh.txt"};
        /* Lanzamos los procesos*/
        Process[] procesos = new Process[ficheros.length];

        for (int i = 0; i < ficheros.length; i++) {
            procesos[i] =  new ProcessBuilder
                    ("java", "-cp", classpath, "HijoContabilidad", ficheros[i]).start();

            // Aqui primero leo lo que hace el Contabilidad
            //Comunicación con el proceso de Contabilidad que retorna al principal
            BufferedReader lector = new BufferedReader(new InputStreamReader
                    (((Process)procesos[i]).getInputStream()));
            String linea = lector.readLine();
            int sumaParcial = Integer.parseInt(linea);

            System.out.println(ficheros[i] + " => " + sumaParcial);
            total += sumaParcial;
        }

        System.out.println("El total de todos los ficheros es: " + total);

        //Y lo escribimos en un fichero de resultados
       PrintWriter pw = new PrintWriter(new FileWriter("resultados_contabilidad.txt",
               true));
        pw.println(total);
        pw.close();
    //Fin del main
    }
}
