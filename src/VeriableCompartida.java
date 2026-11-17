public class VeriableCompartida {

    private static int variableCompartida;

    private static synchronized void incrementar() {
        variableCompartida++;
    }

    public static void main(String[] args) throws InterruptedException {
        int numeroHilos = 1000;
        int incrementosPorHilo = 1000;
        Thread[] hilos = new Thread[numeroHilos];

        for (int i = 0; i < numeroHilos; i++) {
            hilos[i] = new Thread(() -> {
                for (int j = 0; j < incrementosPorHilo; j++) {
                    incrementar();
                }
            });
            hilos[i].start();
            System.out.println("Hilo " + i + ": " + variableCompartida);
        }

        for (Thread hilo : hilos) {
            hilo.join();
        }

        System.out.println("Valor final de la variable compartida: " + variableCompartida);
    }
}
