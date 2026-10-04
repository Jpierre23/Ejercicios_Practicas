package Logica_Modulo;

public class moduloMain {
    public static void main(String[] args) {
        Modulo_Software m1 = new Modulo_Software();
        Modulo_Software m2 = new Modulo_Software();
        Modulo_Software m3 = new Modulo_Software();

        m1.nombre = "Login";
        m1.lenguaje = "Java";
        m1.version = "2026";
        m1.terminado = true;

        m2.nombre = "Inventario";
        m2.lenguaje = "Python";
        m2.version = "20.03";
        m2.terminado = false;

        m3.nombre = "Reportes";
        m3.lenguaje = "Java";
        m3.version = "26.2.12";
        m3.terminado = false;

        m1.mostrarInformacion();
        m1.mostrarVersion();
        System.out.println();
        m1.marcarTerminado();
        System.out.println();
        m1.mostrarEstado();
        System.out.println();

        m2.mostrarInformacion();
        m2.mostrarVersion();
        System.out.println();
        m2.marcarTerminado();
        System.out.println();
        m2.mostrarEstado();
        System.out.println();

        m3.mostrarInformacion();
        m3.mostrarVersion();
        System.out.println();
        m3.mostrarEstado();
        m3.marcarTerminado();
        System.out.println();
        m3.mostrarEstado();

    }
}
