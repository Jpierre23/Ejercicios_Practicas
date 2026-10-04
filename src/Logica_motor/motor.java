package Logica_motor;

public class motor {
    public String nombre;
    public double potencia;
    double velocidad;
    boolean encendido;

    public void encender(){
        if (encendido){
            System.out.println("El motor ya esta encendido");
        }
        else{
            System.out.println("Motor encendido.");
            encendido = true;
        }
    }

    public void mostrarInformacion(){
        System.out.println("Nombre del motor: " + nombre);
        System.out.println("Potencia: " + potencia);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Encendido: "+ encendido);
    }

    void apagar(){
        if (encendido){
            System.out.println("Motor Apagado.");
            encendido = false;
        }
        else{
            System.out.println("El motor esta apagado.");
        }
    }

    void mostrarEstado(){
        System.out.println(
                encendido ? "El motor esta encendido" : "El motor esta apagado"
        );
    }

}
