package procesos;

public class Propertyes {
    static void main(String[] args) {
        String version= "";
        version= System.getProperty("user.dir");
        System.out.println(version);

        System.out.println("Usuario en uso: "+System.getProperty("user.name"));
        System.out.println("ruta actual: "+System.getProperty("user.dir"));
        System.out.println("directorio personal: "+System.getProperty("user.name"));
        System.out.println("Ruta de java:"+System.getProperty("java.home"));
        System.out.println("ClassPath de java: "+System.getProperty("java.class.path"));
    }
}
