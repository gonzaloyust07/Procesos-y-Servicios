public class ProcesoSecundario {
    public static void main(String[] args) {
        System.out.println("Se ha ejecutado un proceso Secundario");
        //Finalizo el proceso con un código 103 (exit)
        System.exit(103);

       //Esta propiedad user.dir nos devuelve la ruta absoluta donde se encuentra
        //esta clase, para que así pueda ser invocada correctamente desde el padre
       //System.out.println(System.getProperty("user.dir"));


    }
}