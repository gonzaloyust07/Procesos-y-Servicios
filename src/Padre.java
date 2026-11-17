import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Padre {
    public static void main(String[] args) throws IOException {
        //Es averiguar la ruta de lso ficheros class de este proyecto
        String ruta = System.getProperty("java.class.path");


        //Crea un proceso hijo a partir de comenzar o start un ProcessBuilder con los argumentos
        Process hijo1 = new ProcessBuilder("java", "-cp", ruta, "Hijo", "Antonia").start();

        //Como sé que el proceso hijo ha escrito en el System.out. que es un canal de salida
        //tengo que definir un canal de entrada aquí en este padre a partir del proceso hijo
        BufferedReader br = new BufferedReader(new InputStreamReader(hijo1.getInputStream()));
        String linea = br.readLine();
        //esta línea leida si se va a escribir en la consola del proceso padre
        System.out.println(linea);

        //Hijo 2
        Process hijo2 = new ProcessBuilder("java", "-cp", ruta, "Hijo", "Juan").start();
        br = new BufferedReader(new InputStreamReader(hijo2.getInputStream()));
        linea = br.readLine();
        System.out.println(linea);

        //Hijo 3
        Process hijo3 = new ProcessBuilder("java", "-cp", ruta, "Hijo", "Pepe").start();
        br = new BufferedReader(new InputStreamReader(hijo3.getInputStream()));
        linea = br.readLine();
        System.out.println(linea);





    }
}
