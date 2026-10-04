package Logica_motor;

public class motorMain {
    public static void main(String[] args) {
        motor m1 = new motor();
        motor m2 = new motor();
        motor m3 = new motor();

        m1.nombre = "Motor de auto";
        m1.encendido = false;
        m1.velocidad = 120;
        m1.potencia = 3;

        m2.nombre = "Motor de avion";
        m2.encendido = false;
        m2.velocidad = 500;
        m2.potencia = 5;

        m3.nombre = "Motor de moto";
        m3.encendido = false;
        m3.velocidad = 60;
        m3.potencia = 2;

        m1.mostrarInformacion();
        m1.mostrarEstado();
        System.out.println();
        m1.encender();
        System.out.println();
        m1.mostrarInformacion();
        m1.mostrarEstado();
        m1.apagar();
        System.out.println();
        m1.mostrarInformacion();
        System.out.println();
        m2.mostrarInformacion();
        System.out.println();
        m3.mostrarInformacion();

    }
}
