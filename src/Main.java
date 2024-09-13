public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot();

        robot.caminar();

        CasualOutfit casualOutfit = new CasualOutfit();
        robot.usarOutfit(casualOutfit);

        FormalOutfit formalOutfit = new FormalOutfit();
        robot.usarOutfit(formalOutfit);
    }
}