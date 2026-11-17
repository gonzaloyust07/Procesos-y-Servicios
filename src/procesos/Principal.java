package procesos;

import java.io.*;

public class Principal {
    static void main(String[] args) throws IOException {


        String classpath = System.getProperty("java.class.path");
        int suma = 0;
        int total=0;
        String[] vocales = {"a","e","i","o","u","w"};

        Process[] procesos = new Process[vocales.length];

        for (int i = 0; i< vocales.length;i++){
            procesos[i] = new ProcessBuilder("java","-cp", classpath,"Contador","el quijote.txt",vocales[i]).start();

            BufferedReader br = new BufferedReader(new InputStreamReader(((Process) procesos[i]).getInputStream()));
            System.out.println(br.readLine());

        }
        
    }
}
