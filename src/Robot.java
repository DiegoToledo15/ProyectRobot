public class Robot {
    private Mano manoDerecha;
    private Mano manoIzquierda;
    private Pierna piernaDerecha;
    private Pierna piernaIzquierda;
    private Torso torso;
    private Cabeza cabeza;

    public Robot() {
        this.manoDerecha = new Mano();
        this.manoIzquierda = new Mano();
        this.piernaDerecha = new Pierna(90);
        this.piernaIzquierda = new Pierna(90);
        this.torso = new Torso("Metal", 100);
        this.cabeza = new Cabeza("Azul");
    }

    public void caminar() {
        piernaDerecha.estirar();
        piernaIzquierda.doblar();
        System.out.println("El robot está caminando.");
    }

    public void usarOutfit(Outfit outfit) {
        outfit.aplicar();
    }
}
