import procesos.Consumidor;
import procesos.ListaCompartida;
import procesos.Productor;

public class Lanzador {

    public static void main(String[] args) throws InterruptedException {
        int MAX_ELEMENTOS_COLA = 10;

        //Aquí crea la variable de cola compartida
        //Esto es crear el almacen de la tienda
        ListaCompartida colaCompartida = new ListaCompartida(MAX_ELEMENTOS_COLA);

        /*Construimos los productores*/
        Productor productor = new Productor(colaCompartida);
        Thread hiloProductor = new Thread(productor);
        hiloProductor.start();

        /*Construimos los consumidores*/
        Consumidor consumidor = new Consumidor(colaCompartida);
        Thread hiloConsumidor = new Thread(consumidor);
        hiloConsumidor.start();

    }
}