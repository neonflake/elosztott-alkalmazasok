package hu.gdf;

/**
 * Elosztott alkalmazások beadandó feladat
 * @author Erős Ákos <wlxgpb@neptun.gdf.hu>
 */
public class ElosztottAlkalmazasok {

    public static void main(String[] args) {
        GameDemo game = new GameDemo();
        System.out.println("Interactive game demo (use the commands below)");
        System.out.println("list - list all actors by name");
        System.out.println("fight - simulate a fight for players");
        System.out.println("exit - quits the demo");
        System.out.println();
        boolean running = true;
        while (running) {
            switch (ConsoleReader.readInput()) {
                case "exit":
                    running = false;
                    break;
                case "list":
                    game.listActors();
                    break;
                case "fight":
                    game.simulateFight();
                    break;
            }
        }
        System.out.println();
    }
}
