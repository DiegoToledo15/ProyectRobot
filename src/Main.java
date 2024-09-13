public class Main {
    public static void main(String[] args) {
        // Crear una instancia del robot
        Robot robot = new Robot();

        // Hacer que el robot camine
        robot.caminar();

        // Aplicar un outfit casual al robot
        CasualOutfit casualOutfit = new CasualOutfit();
        robot.usarOutfit(casualOutfit);

        // Aplicar un outfit formal al robot
        FormalOutfit formalOutfit = new FormalOutfit();
        robot.usarOutfit(formalOutfit);
    }
}