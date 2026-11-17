import java.io.IOException;

public class Principal {

    public static void main(String[] args) throws IOException, InterruptedException {
        if (args.length != 1) {
            System.err.println("Uso: Principal <fichero>");
            System.exit(1);
        }

        String classpath = System.getProperty("java.class.path");
        String[] vocales = {"a", "e", "i", "o", "u"};
        Process[] procesos = new Process[vocales.length];

        for (int i = 0; i < vocales.length; i++) {
            procesos[i] = new ProcessBuilder(
                    "java", "-cp", classpath, "Contador", args[0], vocales[i])
                    .inheritIO().start();
        }

        int error = 0;
        for (Process proceso : procesos) {
            if (proceso.waitFor() != 0) {
                error = 1;
            }
        }

        if (error != 0) {
            System.exit(error);
        }
    }
}
