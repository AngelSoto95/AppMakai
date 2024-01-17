package Makai;

import Makai.Capitan;

public class Main {
    public static void main(String[] args) {
        Capitan capitan1 = new Capitan("Juan", "Perez", "ABC123");
        Velero velero1 = new Velero(capitan1, 50.000, 100, 2022, 15.000, 4, 4);
        Capitan capitan2 = new Capitan("Sam", "Swalt", "HBT043");
        Yate yate1 = new Yate(capitan2,80.000, 500, 2023, 35.000,"AK24", 4);

        capitan1.mostrarInfoCapitan();
        capitan2.mostrarInfoCapitan();
        velero1.mostrarInfo();
        yate1.mostrarInfoYate();
        System.out.println("El valor total del alquiler es: " + velero1.calcularAlquiler());
        /*Makai.Velero velero1 = new Makai.Velero(30.000,10000, 2024, 80.000,4,3);
        Makai.Yate yate1 = new Makai.Yate(40.000, 5000 , 2022, 90.000,"AKJ768",5);
        velero1.calcularAlquiler();
        velero1.mostrarInfo();
        yate1.calcularAlquiler();
        yate1.mostrarInfoYate();
        System.out.println("Es grande el velero? " + velero1.esGrande());*/
    }
}
