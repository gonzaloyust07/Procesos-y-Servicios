package procesos;

import java.io.IOException;
import java.util.Locale;

public class Secundario1 {
    static void main(String[] args) throws IOException {


        String texto = args[1];

        if (Integer.parseInt(args[0]) == 1) {
            texto=texto.toLowerCase(Locale.ROOT);
            System.out.println("Texto en minusculas: \"" + texto + "\"");
        } else if (Integer.parseInt(args[0]) == 2) {
            texto=texto.replace(" ", "");
            System.out.println("Texto sin espacios: \"" + texto + "\"");

        }


    }
}
