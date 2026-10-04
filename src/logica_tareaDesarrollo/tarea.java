package logica_tareaDesarrollo;

public class tarea {
    public String titulo;
    public String responsable;
    double horasEstimadas;
    boolean completada;

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Responsable: " + responsable);
        System.out.println("Horas estimadas: " + horasEstimadas);
    }

    public void completar() {
        completada = true;
    }

    void mostrarResponsable() {
        System.out.println("Responsable: " + responsable);
    }

    void mostrarEstado() {
        System.out.println(
                completada ? "La tarea está completada" : "La tarea está pendiente"
        );
    }
}
