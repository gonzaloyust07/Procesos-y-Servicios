import java.io.File;
import java.io.IOException;
import java.util.Map;

public class Instancias10Notepad {
   public static void main (String[] args) {
       //ProcessBuilder pb = new ProcessBuilder("notepad.exe");
       ProcessBuilder pb = new ProcessBuilder("notepad.exe");


       //También vamos a crear un objeto Map con la información proporcionada por el SO
       //Con ello hallamos las variables de entorno del sistema operativo
       Map<String, String> env = pb.environment();
       //Creamos un iterador que nos escriba tanto el key como su valor
       env.entrySet().stream().forEach(e -> {
           System.out.println(e.getKey() + " = " + e.getValue());
       });

       for(int i = 0; i < 5; i++){
           try {
               //Va a empezar 5 procesos con el constructor de procesos definido antes
               Process p = pb.start();  //Los inicia
           } catch (IOException e) {
               throw new RuntimeException(e);
           }
       }
   }
}
