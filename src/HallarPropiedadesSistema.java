public class HallarPropiedadesSistema {
    public static void main(String[] args) {
        System.out.println("Version de java: " + System.getProperty("java.version"));
        System.out.println("Proveedor de java: " + System.getProperty("java.vendor"));
        System.out.println("Directorio de java: " + System.getProperty("java.home"));
        System.out.println("Sistema operativo: " + System.getProperty("os.name") +
                " " + System.getProperty("os.arch") + " " + System.getProperty("os.version"));

        System.out.println("Usuario: " + System.getProperty("user.name"));
        System.out.println("Directorio personal: " + System.getProperty("user.home"));
        System.out.println("Directorio trabajo actual: " + System.getProperty("user.dir"));

        System.out.println("Classpath de Java: " + System.getProperty("java.class.path"));

    }
}
