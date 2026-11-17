package procesos;

import java.util.LinkedList;

//Lo que hace es simular por ejemplo, un almacen de tienda
//Tiene una capacidad máxima de MAX_ELEMENTOS;
//y lo que va a guardar son números enteros, integer

public class ListaCompartida {
    private int MAX_ELEMENTOS;
    LinkedList<Integer> almacen = new LinkedList<>();

    public ListaCompartida(int max) {
        this.MAX_ELEMENTOS = max;
    }

    /* En realidad, si estamos seguro de que nadie
    llamara a este metodo podriamos ponerla como no
    synchronized*/
    public synchronized boolean estaVacia() {
        return almacen.size() == 0;
    }

    /* Igual que antes, si estamos seguro de que nadie llamara a este metodo podriamos ponerla como no
    synchronized*/
    public synchronized boolean estaLlena() {
        int numElementos = almacen.size();
        if (numElementos == this.MAX_ELEMENTOS) {
            return true;
        }
        return false;
    }

    /* Devuelve true si se pudo hacer y false si no se pudo*/
    public synchronized boolean agregarElemento(int numero) {
        if (estaLlena()) { //comprueba que si la fila está llena no se puede agregar ningun número
            return false;
        }
        almacen.addLast(numero);
        //System.out.println("=> Hay " + almacen.size() + " elementos en la cola");
        return true;
    }
    public synchronized int leerPrimeroDeFila() {
        if (estaVacia()) {
            return -1;
        }
        int numero= almacen.removeFirst();
        //System.out.println("=> Hay " + almacen.size() + " elementos en la cola");
        return numero;
    }
}
