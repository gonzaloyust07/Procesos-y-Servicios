import java.io.IOException;
import java.util.*;

public class Apagador {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Selecciona tu opción:  (s-apagar / r-reiniciar): ");
        String opcion = scanner.nextLine();
        System.out.print("¿Cuántos segundos quieres esperar hasta que el comando se ejecute (0 significa de inmediato): ");
        String tiempo = scanner.nextLine();
        String command;
        //En el caso de que mi SO sea windows
        if (System.getProperty("os.name").toLowerCase().startsWith("windows")) {
            command = "C:\\Windows\\System32\\shutdown.exe /" + opcion + " /t " + tiempo;
            //Si quiero que se reinicie en 10 segundos, el comando seria
            //shutdown /r /t 10
        }
        //Para sistemas linux
        else {
            command = "shutdown -" + opcion + " -t " + tiempo;
        }
        // Prepare the process and launch it
        ProcessBuilder builder = new ProcessBuilder(command.split("\\s"));
        builder.start();  //Lanza el proceso


    }
}