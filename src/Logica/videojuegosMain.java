package Logica;

public class videojuegosMain {
    public static void main(String[] args) {
        Videojuego v1 = new Videojuego();
        Videojuego v2 = new Videojuego();
        Videojuego v3 = new Videojuego();

        v1.nombre = "Valorant";
        v1.genero = "Shooter";
        v1.activo = false;
        v1.version = "24.00.23";

        v2.nombre = "Red Read Redemption";
        v2.genero = "Accion";
        v2.activo = false;
        v2.version = "14.23.34";

        v3.nombre = "Overcooked";
        v3.genero = "Aventura";
        v3.activo = false;
        v3.version = "15.80.2026";

        v1.mostrarInformacion();
        System.out.println();
        v1.iniciar();
        v1.mostrarVersion();
        System.out.println();
        v1.mostrarInformacion();
        System.out.println();
        v1.cerrar();
        System.out.println();
        v1.mostrarInformacion();
        System.out.println();

        v2.mostrarInformacion();
        System.out.println();
        v2.iniciar();
        v2.mostrarVersion();
        System.out.println();
        v2.mostrarInformacion();
        System.out.println();
        v2.cerrar();
        System.out.println();
        v2.mostrarInformacion();
        System.out.println();

        v3.mostrarInformacion();
        System.out.println();
        v3.iniciar();
        v3.mostrarVersion();
        System.out.println();
        v3.mostrarInformacion();
        System.out.println();
        v3.cerrar();
        System.out.println();
        v3.mostrarInformacion();
    }
}
