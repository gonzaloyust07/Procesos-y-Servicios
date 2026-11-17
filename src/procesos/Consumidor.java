package procesos;

import procesos.ListaCompartida;

public class Consumidor implements Runnable{
    ListaCompartida almacen;

    //También tiene en su constructor un objeto de tipo ListaCompartida
    public Consumidor(ListaCompartida cola){
        this.almacen =cola;
    }

    @Override
    public void run() { //Ejecución de la hebra Consumidor
        int num;
        //Un bucle infinito
        while (true){
            //El consumidor lo que hace es leer el primero número de la cola
            //Para ello desencola
            num= almacen.leerPrimeroDeFila(); //es similar a comprar un juguete
            if (num!=-1){
                System.out.println("Consumidor leyó de la cola compartida el numero:"+num);
            } /* Fin del if*/
        } /*Fin del bucle infinito*/
    } /* Fin del run()*/
} /* Fin de la clase Consumidor*/