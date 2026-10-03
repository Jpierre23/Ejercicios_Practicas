package Logica;

public class Videojuego {
    public String nombre;
    public  String genero;
    String version;
    boolean activo;

    public void mostrarInformacion(){
        System.out.println("Nombre del videojuego: " + nombre);
        System.out.println("Genero: " + genero);
        System.out.println("Estado: " + activo);
    }

    public void iniciar(){
        if (activo){
            System.out.println("El juego está abierto.");
        }
        else{
            System.out.println("Iniciando el juego.");
            activo = true;
        }
    }

    void cerrar(){
        if (activo){
            System.out.println("Cerrando el juego.");
            activo = false;
        }
        else{
            System.out.println("El juego está cerrado.");
        }
    }

    void mostrarVersion(){
        System.out.println("Version: " + version);
    }
}
