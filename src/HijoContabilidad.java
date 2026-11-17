//Este proceso lo que va a hacer es leer las líneas de un archivo de texto
//que son números y los va a ir sumando.
//Al final escribirá la suma con un System.out.println

import java.io.*;


public class HijoContabilidad {

    public static void main(String[] args) {
        try{
            //Defino un lector sobre un archivo que he recibido como argumento
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            String linea = br.readLine();

            int suma = 0;
            while (linea != null) {
                //La linea leida la quiero transformar en numero ya que el archivo contiene numeros
                int numeroLeido = Integer.parseInt(linea);
                //System.out.println(numeroLeido);
                suma += numeroLeido;
                linea = br.readLine();
            }
            System.out.println(suma);   //Arrojo al canal estándar de salida la suma
            br.close();

        }catch(FileNotFoundException e) {
            System.out.println("No se encontro el archivo");
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }

}
