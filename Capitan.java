package Makai;

class Capitan {
    String nombre;
    String apellido;
    String matriculaNavegacion;

    public Capitan(String nombre, String apellido, String matriculaNavegacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matriculaNavegacion = matriculaNavegacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getMatriculaNavegacion() {
        return matriculaNavegacion;
    }

    public void mostrarInfoCapitan(){
        System.out.println("La informacion del capitan es: Nombre: " + getNombre() +
                ",Apellido: " + getApellido() + ",Matricula de navegacion: " + getMatriculaNavegacion());
    }

}