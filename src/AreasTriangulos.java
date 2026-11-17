import java.util.concurrent.ThreadLocalRandom;

public class AreasTriangulos {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            double base = ThreadLocalRandom.current().nextInt(1, 11);
            double altura = ThreadLocalRandom.current().nextInt(1, 11);
            Thread hilo = new Thread(
                    new CalculadorAreas(base, altura), "CalculadorAreas-" + (i + 1));
            hilo.setPriority(Thread.NORM_PRIORITY);
            hilo.start();
        }
    }
}
