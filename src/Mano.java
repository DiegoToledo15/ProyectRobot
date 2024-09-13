public class Mano {
    private int numeroDedos;
    private boolean abierta;

    public Mano() {
        this.numeroDedos = 5;
        this.abierta = true;
    }

    public void cerrar() {
        this.abierta = false;
        System.out.println("La mano está cerrada.");
    }

    public void abrir() {
        this.abierta = true;
        System.out.println("La mano está abierta.");
    }
}