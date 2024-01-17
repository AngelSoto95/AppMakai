package Makai;

import Makai.Capitan;
import Makai.Embarcacion;

public class Yate extends Embarcacion {

    private String motor;
    private int cantidadCamarotes;


    public Yate(Capitan capitan, double precioBase, int valorAdicional, int fechaFabricacion, double montoAlquiler, String motor, int cantidadCamarotes) {
        super(capitan, precioBase, valorAdicional, fechaFabricacion, montoAlquiler);
        this.motor = motor;
        this.cantidadCamarotes = cantidadCamarotes;
    }

    public String getMotor() {
        return motor;
    }

    public int getCantidadCamarotes() {
        return cantidadCamarotes;
    }

    public void comprar(){
        System.out.println("El yate ha sido comprado con exito");
    }

    @Override
    public double calcularAlquiler() {
        double nuevoMontoAlquiler = getPrecioBase();
        if (getFechaFabricacion() > 2020){
            nuevoMontoAlquiler += 20000;
        }
        setMontoAlquiler(nuevoMontoAlquiler);
        return getMontoAlquiler();
    }
    public void mostrarInfoYate(){
        System.out.println("La informacion del Makai.Yate Camaron Sangrante es: " );
        System.out.println("precio base: " + getPrecioBase() + " Monto alquiler: " + getMontoAlquiler() + " Fecha fabricacion : " + getFechaFabricacion() + " Motor : " + getMotor() +  " cantidad camarotes: " + getCantidadCamarotes() );
    }
}
