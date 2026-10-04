package logica_tareaDesarrollo;

public class tareaMain {
    public static void main(String[] args) {
        tarea t1 = new tarea();
        tarea t2 = new tarea();
        tarea t3 = new tarea();

        t1.titulo = "Diseñar interfaz";
        t1.responsable = "Juan";
        t1.horasEstimadas = 5;


        t2.titulo = "Programar login";
        t2.responsable = "Pedro";
        t2.horasEstimadas = 8;


        t3.titulo = "Realizar pruebas";
        t3.responsable = "Ana";
        t3.horasEstimadas = 3;

        t2.completar();

        t1.mostrarEstado();
        t2.mostrarEstado();
        t3.mostrarEstado();
    }
}
