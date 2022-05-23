package hu.gdf;

import javax.swing.JFrame;

/**
 * Elosztott alkalmazások beadandó feladat
 * @author Erős Ákos <wlxgpb@neptun.gdf.hu>
 */
public class ElosztottAlkalmazasok {

    public static void main(String[] args) {
        ConsoleHelper.writeToConsole("Interactive Game Demo\n"); 
        showCommandsOnConsole();
        runGameOnConsole(new GameDemo());
    }
    
    private static void runGameOnConsole(GameDemo game) {
        boolean runOnConsole = true;
        while (runOnConsole) {
            switch (ConsoleHelper.readFromConsole()) {
                case "exit":
                    game.resetGameState();
                    runOnConsole = false;
                    break;
                case "list":
                    game.listActors();
                    break;
                case "fight":
                    game.simulateFight();
                    break;
                case "pause":
                    game.saveGameState();
                    runOnConsole = false;
                    break;
                case "gui":
                    runGameOnWindow(game);
                    runOnConsole = false;
            }
        }
    }
    
    private static void runGameOnWindow(GameDemo game) {
        GameWindow window = new GameWindow(game);
        game.setGameWindow(window);
        window.setTitle("Interactive Game Demo");
        window.setVisible(true);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    private static void showCommandsOnConsole() {
        StringBuilder text = new StringBuilder("Commands available:\n")
                .append("list - list all actors by name\n")
                .append("fight - simulate a fight for players\n")
                .append("pause - quit the demo and save progress\n")
                .append("gui - continue the demo on a graphical interface\n")
                .append("exit - quit the demo and reset game state\n");
        ConsoleHelper.writeToConsole(text);
    }
}
