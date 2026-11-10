package procesos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HijoContabilidad {
    static void main(String[] args) throws FileNotFoundException {

        try {
            BufferedReader br = new BufferedReader( new FileReader(args[0]));
            int suma = 0;
            String linea = br.readLine();
            while (linea !=null){
                suma = suma+Integer.parseInt(linea);
                linea= br.readLine();
            }
            System.out.println(suma);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
