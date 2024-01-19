package Makai;

import Makai.Capitan;

public abstract class Embarcacion {
    //Atributos
    private Capitan capitan;
    private int precioBase;
    private int valorAdicional;
    private int fechaFabricacion;
    private int esloraMetros;

    //Contructor

    public Embarcacion(Capitan capitan, int precioBase, int valorAdicional, int fechaFabricacion, int esloraMetros) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.fechaFabricacion = fechaFabricacion;
        this.esloraMetros = esloraMetros;
    }


    //getters y setters


    public int getEsloraMetros() {
        return esloraMetros;
    }

    public Capitan getCapitan() {

        return capitan;
    }

    public void setCapitan(Capitan capitan) {

        this.capitan = capitan;
    }

    public double getPrecioBase() {

        return precioBase;
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

    public void setPrecioBase(int precioBase) {

        this.precioBase = precioBase;
    }

    //Metodos
    public void calcularAlquiler(){
        if (fechaFabricacion > 2020){
            int total = 0;
            total = precioBase + 20000;
            System.out.println("El alquiler es: " + total);
        }else {
            System.out.println("El alquiler es: " + precioBase);
        }
    }

    @Override
    public String toString() {
        return "Embarcacion{" +
                "capitan=" + capitan +
                ", precioBase=" + precioBase +
                ", valorAdicional=" + valorAdicional +
                ", fechaFabricacion=" + fechaFabricacion +
                ", esloraMetros=" + esloraMetros +
                '}';
    }
}


