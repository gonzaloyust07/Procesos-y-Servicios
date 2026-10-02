public class ProcesoPrincipal {
    public static void main(String[] args) {

       try {

           //Tengo que invocar al proceso principal al proceso secundario
           //capturar su codigo de retorno y hacer algo

           //como llamo al porceso secundario desde el proceso principal
           String ruta = System.getProperty("java.class.path");
           System.out.println(ruta);
           String[] infoProceso = {"java", "-cp", ruta, "paquete.ProcesoSecundario"};

           Process proceso = Runtime.getRuntime().exec("C:\\Program Files\\Microsoft Office\\root\\Office16\\ONENOTE.EXE /memoryWindow start");
           //Espero a que el proceso secundario haya acabado y recojo el valor de retorno
           int valorRetorno = proceso.waitFor();
           //luego escribo dicho valor de retorno
           System.out.println("Proceso secundario terminado" + "El codigo de error es: " + valorRetorno);

       } catch (Exception e) {
           e.printStackTrace();
       }

    }
}
