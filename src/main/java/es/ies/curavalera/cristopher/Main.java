package es.ies.curavalera.cristopher;

public class Main {

    static void main() {
        Empleado empleado = new Empleado("44885522R","Juan Gómez", "C/de mi casa,5");
        empleado.setNumHijos(12);

        empleado.mostrarInfo();
    }
}
