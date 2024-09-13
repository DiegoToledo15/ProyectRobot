public class Cabeza {
    private String colorOjos;
    private boolean bocaAbierta;

    public Cabeza(String colorOjos) {
        this.colorOjos = colorOjos;
        this.bocaAbierta = false;
    }

    public void abrirBoca() {
        this.bocaAbierta = true;
        System.out.println("La boca está abierta.");
    }

    public void cerrarBoca() {
        this.bocaAbierta = false;
        System.out.println("La boca está cerrada.");
    }
}
