package Logica_Biblioteca;

public class LibrosMain {
    public static void main(String[] args) {

        Libro l1 = new Libro();
        Libro l2 = new Libro();
        Libro l3 = new Libro();

        l1.titulo = "El Principito";
        l1.autor = "Antoine de Saint-Exupery";
        l1.paginas = 96;


        l2.titulo = "1984";
        l2.autor = "George Orwell";
        l2.paginas = 328;


        l3.titulo = "Don Quijote de la Mancha";
        l3.autor = "Miguel de Cervantes";
        l3.paginas = 863;

        l1.prestar();

        l1.devolver();

        l3.prestar();

        l1.mostrarInformacion();
        l2.mostrarInformacion();
        l3.mostrarInformacion();

        l1.mostrarEstado();
        l2.mostrarEstado();
        l3.mostrarEstado();
    }
}
