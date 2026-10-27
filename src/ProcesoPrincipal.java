public class ProcesoPrincipal {

    public static void main(String[] args) {
        try{
            //Tengo que saber la ruta de los class de Java para poder llamar
            //al secundario de forma correcta
            String ruta = System.getProperty("java.class.path");
            System.out.println(ruta);
            //Declaro un array, en el que le digo que ejecute con java (java.exe)
            //un ProcesoSecundario que se encuentra en el classpath especificada
            //por ruta (hallada en la anterior linea)
            //Voy a montar los parámetros de llamada del comando
            String[] infoProceso = {"java",  "-cp", ruta,  "ProcesoSecundario"};
            //Creo un proceso con Runtime a partir de los parametros anteriores y lo ejecuto
            //Runtime.getRuntime()
            //proceso es el proceso secundario, lo llamo y espero
            Process proceso = Runtime.getRuntime().exec(infoProceso);
            //Espero a que el proceso secundario haya acabado y recojo el valor de retorno
            int valorRetorno = proceso.waitFor();
            //Luego escribo dicho valor de retorno
            System.out.println("Proceso secundario terminado. " +
                    "El código de error es:  " + valorRetorno);
        } catch(Exception e){
            e.printStackTrace();
        }
    }

}
