public class ProcesoAbreWriter {
    public static void main(String[] args) {
        try {
            String[] infoProceso = {"C:\\Program Files\\LibreOffice\\program\\swriter.exe",
                    "C:\\Users\\GuerreroHerruzo\\Desktop\\prueba.odt"};

            Process proceso = Runtime.getRuntime().exec(infoProceso);
        }catch(Exception e) {
            e.printStackTrace();
        }


    }
}
