package hu.gdf;

/**
 * Elosztott alkalmazások beadandó feladat
 * @author Erős Ákos <wlxgpb@neptun.gdf.hu>
 */
public class ElosztottAlkalmazasok {

    public static void main(String[] args) {
        System.out.println("Interactive Game Demo\n"); 
        GameDemo game = new GameDemo();
        showCommandsOnConsole();
        runGameOnConsole(game);
    }
    
    private static void runGameOnConsole(GameDemo game) {
        boolean running = true;
        while (running) {
            switch (ConsoleReader.readInput()) {
                case "exit":
                    game.resetGameState();
                    running = false;
                    break;
                case "list":
                    game.listActors();
                    break;
                case "fight":
                    game.simulateFight();
                    break;
                case "pause":
                    running = false;
                    game.saveGameState();
                    break;
            }
        }
        System.exit(0);
    }
    
    private static void showCommandsOnConsole() {
        System.out.println("Commands available:");
        System.out.println("list - list all actors by name");
        System.out.println("fight - simulate a fight for players");
        System.out.println("pause - quit the demo and save progress");
        System.out.println("exit - quit the demo and reset game state\n");
    }
}
