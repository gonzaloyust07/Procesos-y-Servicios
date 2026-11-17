package procesos;

import procesos.ListaCompartida;

public class Productor implements Runnable{

    ListaCompartida cola; // El productor va a hacer modificaciones sobre el almacén de la tienda
    int nEjecuciones = 100; // Él va a generar 100 elementos, no más

    public Productor(ListaCompartida colaCompartida){

        this.cola =colaCompartida;
    }

    public void run() {
        //Mientras no paremos el proceso, es un bucle infinito
        while (nEjecuciones > 0){
            //El productor gener un número aleatorio entre 1 y 10 y lo mete en la cola
            int num= (int) (Math.random() * 10) + 1;
            if (cola.estaLlena()) { // En el caso en que almacén esté lleno, se duerme un rato
                int tiempoEspera = 2000;
                try {
                    Thread.sleep(tiempoEspera);
                    System.out.println("El hilo Productor espera " + tiempoEspera);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            else { // En el caso en que no esté lleno el almacén, pues agrega el elemento
                cola.agregarElemento(num);
                System.out.println("Productor agregó  el numero: " + num);
            }
            nEjecuciones --;
        }
    }
}