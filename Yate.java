package Makai;

import Makai.Capitan;
import Makai.Embarcacion;

public class Yate extends Embarcacion {

    private int cantidadCamarotes;

    public Yate(Capitan capitan, int precioBase, int valorAdicional, int fechaFabricacion, int esloraMetros, int cantidadCamarotes) {
        super(capitan, precioBase, valorAdicional, fechaFabricacion, esloraMetros);
        this.cantidadCamarotes = cantidadCamarotes;
    }

    public void mostrarInfoYate(){
        System.out.println("La informacion del Makai.Yate Camaron Sangrante es: " );
        System.out.println("precio base: " + getPrecioBase() + " Monto alquiler: " + " Fecha fabricacion : " + getFechaFabricacion() + " Motor : "  );
    }

    public void comprarYate() {
        if (cantidadCamarotes > 7){
            System.out.println("El yate que desea comprar es de lujo y tiene un precio de 100 mil dolares");
        }else{
            System.out.println("El yate que desea comprar no es considerado como lujoso y su valor es de 5 mil dolares");
        }
}
}
