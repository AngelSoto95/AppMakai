package Makai;

import Makai.Capitan;

public abstract class Embarcacion {
    //Atributos
    private Capitan capitan;
    private double precioBase;
    private int valorAdicional;
    private int fechaFabricacion;
    private double montoAlquiler;


    //Contructor

    public Embarcacion(Capitan capitan, double precioBase, int valorAdicional, int fechaFabricacion, double montoAlquiler) {
        this.capitan = new Capitan(capitan.nombre, capitan.apellido, capitan.matriculaNavegacion);
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.fechaFabricacion = fechaFabricacion;
        this.montoAlquiler = montoAlquiler;
    }

    //getters y setters


    public Capitan getCapitan() {
        return capitan;
    }

    public void setCapitan(Capitan capitan) {
        this.capitan = capitan;
    }

    public double getPrecioBase() {

        return precioBase;
    }

    public void setPrecioBase(int precioBase) {

        this.precioBase = precioBase;
    }

    public int getValorAdicional() {

        return valorAdicional;
    }

    public void setValorAdicional(int valorAdicional) {

        this.valorAdicional = valorAdicional;
    }

    public int getFechaFabricacion() {

        return fechaFabricacion;
    }

    public void setFechaFabricacion(int fechaFabricacion) {

        this.fechaFabricacion = fechaFabricacion;
    }

    public void setPrecioBase(double precioBase) {

        this.precioBase = precioBase;
    }

    public double getMontoAlquiler() {

        return montoAlquiler;
    }

    public void setMontoAlquiler(double montoAlquiler) {

        this.montoAlquiler = montoAlquiler;
    }

    //Metodos
    public abstract double calcularAlquiler();

    @Override
    public String toString() {
        return "Makai.Embarcacion{" +
                "capitan=" + capitan +
                ", precioBase=" + precioBase +
                ", valorAdicional=" + valorAdicional +
                ", fechaFabricacion=" + fechaFabricacion +
                ", montoAlquiler=" + montoAlquiler +
                '}';
    }
}


