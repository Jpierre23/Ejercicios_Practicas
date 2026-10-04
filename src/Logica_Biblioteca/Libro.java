package Logica_Biblioteca;

public class Libro {
    public String titulo;
    public String autor;

    int paginas;
    boolean prestado;

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + paginas);
    }

    public void prestar() {
        prestado = true;
    }

    void devolver() {
        prestado = false;
    }

    void mostrarEstado() {
        System.out.println(
                prestado ? "El libro está prestado" : "El libro está disponible"
        );
    }
}
