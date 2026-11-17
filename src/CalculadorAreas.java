public class CalculadorAreas implements Runnable {

    private final double base;
    private final double altura;

    public CalculadorAreas(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void run() {
        double area = base * altura / 2;
        System.out.println("Base: " + base + ", altura: " + altura
                + ", area del triangulo: " + area);
    }
}
