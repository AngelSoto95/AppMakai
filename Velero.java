package Makai;

import Makai.Capitan;
import Makai.Embarcacion;

public class Velero extends Embarcacion {

    private int cantidadMastiles;

    public Velero(Capitan capitan, int precioBase, int valorAdicional, int fechaFabricacion, int esloraMetros, int cantidadMastiles) {
        super(capitan, precioBase, valorAdicional, fechaFabricacion, esloraMetros);
        this.cantidadMastiles = cantidadMastiles;
    }

    public void mostrarInfo(){
        System.out.println("La informacion a mostrar es: " );
        System.out.println("precio base: " + getPrecioBase() + " Monto alquiler: " + " Fecha fabricacion : " + getFechaFabricacion());
    }
    public void evaluarTamanio() {
        if (cantidadMastiles > 4){
            System.out.println("Su velero es grande");
        }else{
            System.out.println("Su velero es pequeño");
        }
    }

}
