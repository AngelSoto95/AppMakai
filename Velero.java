package Makai;

import Makai.Capitan;
import Makai.Embarcacion;

public class Velero extends Embarcacion {

    private int cantidadMastiles;
    private int cantidadVelas;

    public Velero(Capitan capitan, double precioBase, int valorAdicional, int fechaFabricacion, double montoAlquiler, int cantidadMastiles, int cantidadVelas) {
        super(capitan, precioBase, valorAdicional, fechaFabricacion, montoAlquiler);
        this.cantidadMastiles = cantidadMastiles;
        this.cantidadVelas = cantidadVelas;
    }

    public int getCantidadMastiles() {

        return cantidadMastiles;
    }

    public int getCantidadVelas() {

        return cantidadVelas;
    }

    @Override
    public double calcularAlquiler() {
        double montoAlquiler = getPrecioBase() + getValorAdicional();

        if (getFechaFabricacion() > 2020) {
            return montoAlquiler;
        }

        setMontoAlquiler(montoAlquiler);
        //System.out.println("El monto del alquiler es: " + getMontoAlquiler());

        return getMontoAlquiler();
    }
    public void mostrarInfo(){
        System.out.println("La informacion a mostrar es: " );
        System.out.println("precio base: " + getPrecioBase() + " Monto alquiler: " + getMontoAlquiler() + " Fecha fabricacion : " + getFechaFabricacion() + " Cantidad mastiles: " + getCantidadMastiles() + " Cantidad de velas: " + getCantidadVelas() );
    }
    public boolean definirTamaño() {
        return cantidadMastiles > 4;
    }
    }
