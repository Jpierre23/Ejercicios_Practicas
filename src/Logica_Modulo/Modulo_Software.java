package Logica_Modulo;

public class Modulo_Software {
    public String nombre;
    public String lenguaje;
    String version;
    boolean terminado;

    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Lenguaje: " + lenguaje);
    }

    public void marcarTerminado(){
        if (terminado){
            System.out.println("El modulo está terminado.");
        }
        else {
            System.out.println("El modulo se ha registrado como terminado correctamente.");
            terminado = true;
        }
    }

    void mostrarEstado(){
        System.out.println(
                terminado ? "El Estado del modulo es Terminado" : "El modulo sigue en progreso"
        );
    }

    void mostrarVersion(){
        System.out.println("Version: " + version);
    }
}
