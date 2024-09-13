public class Torso {
    private String tipoMaterial;
    private int nivelResistencia;

    public Torso(String tipoMaterial, int nivelResistencia) {
        this.tipoMaterial = tipoMaterial;
        this.nivelResistencia = nivelResistencia;
    }

    public void mostrarResistencia() {
        System.out.println("El nivel de resistencia del torso es: " + nivelResistencia);
    }
}
