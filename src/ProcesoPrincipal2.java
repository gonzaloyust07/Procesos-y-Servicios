public class ProcesoPrincipal2 {
    public static void main (String[] args) {

        try {
            //Tengo que invocar desde el proceso principal al proceso secundario y
            //capturar su código de retorno y hacer algo
            //Como llamo al proceso
            String ruta = System.getProperty("java.class.path");
            System.out.println(ruta);
            //Quiero ejecutar un programa que está scrito en java
            String[] infoProceso = {"java", "-cp", ruta, "ProcesoSecundario"};
            //Para ejecutarlo, hay que crear un proceso, y lo ejecuto con Runtime
            Process proceso = Runtime.getRuntime().exec(infoProceso);
            //Espero a que el proceso secundario haya acabado y recojo el valor de retorno
            int valorRetorno = proceso.waitFor();
            //Luego escribo dicho valor de retorno
            System.out.println("Proceso secundario terminado. " +
                    "El código de error es:  " + valorRetorno);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
