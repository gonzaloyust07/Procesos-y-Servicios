package procesos;

import java.io.*;

public class Contador {
    static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("resultado_vocales.txt", true));
        try {

            FileReader fr = new FileReader(args[0]);
            char vocalALeer = args[1].charAt(0);
            int contador = 0;
            int caracter = fr.read();
            while (caracter!=-1 ){
                char letra = (char) caracter;
                if (letra == vocalALeer){contador++;}
                caracter = fr.read();
            }
            System.out.println("el total de \""+vocalALeer+"\" son: "+contador);
            bw.write("el total de \""+vocalALeer+"\" son: "+contador+"\n");
            fr.close();
            bw.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
