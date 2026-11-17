package procesos;

import java.io.*;

public class PadreContabilidad {
    static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("resultados"));

        String classpath = System.getProperty("java.class.path");
        int suma = 0;
        int total=0;
        String[] ficheros={"rrhh","informatica","gerencia","contabilidad.txt","comercio.txt"};

        Process[] procesos = new Process[ficheros.length];

        for (int i = 0; i< ficheros.length;i++){
            procesos[i] = new ProcessBuilder("java","-cp", classpath,"HijoContabilidad",ficheros[i]).start();

            BufferedReader br = new BufferedReader(new InputStreamReader(((Process) procesos[i]).getInputStream()));

            String linea = br.readLine();
            suma = suma+Integer.parseInt(linea);
            bw.write("suma"+i+" : " +suma+"\n");
            total += suma;
        }
        bw.write("suma total: "+total);
        System.out.println(total);
        bw.close();
    }
}
