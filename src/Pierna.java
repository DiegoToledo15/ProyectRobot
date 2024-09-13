public class Pierna {
    private int longitud;
    private boolean doblada;

    public Pierna(int longitud) {
        this.longitud = longitud;
        this.doblada = false;
    }

    public void doblar() {
        this.doblada = true;
        System.out.println("La pierna está doblada.");
    }

    public void estirar() {
        this.doblada = false;
        System.out.println("La pierna está estirada.");
    }
}
