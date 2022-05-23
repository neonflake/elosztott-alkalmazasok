package hu.gdf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Erős Ákos <wlxgpb@neptun.gdf.hu>
 */
public class GameDemo{
    
    private List<Actor> actors;
    private GameData gameData = new GameData();
    private GameWindow window = null;
    
    public GameDemo() {
        actors = gameData.readActorsFromDisk();
        if (actors == null) {
            ConsoleHelper.writeToConsole("No save found: starting in a clean state\n");
            initActors();
        } else {
            ConsoleHelper.writeToConsole("Save found: loading previous state\n");
        }
    }
    
    public void setGameWindow(GameWindow window) {
        this.window = window;
    }
    
    public List<Actor> getActors() {
        return actors;
    }
    
    private void initActors() {
        actors = new ArrayList();
        NonPlayerCharacter npc = new NonPlayerCharacter("Villager");
        for (int i = 0; i < 3;i++) {
            try {
                actors.add(npc.clone());
            } catch (CloneNotSupportedException exception) {
                ConsoleHelper.writeToConsole("Adding NPC failed");
            } 
        }
        PlayerCharacter player1 = new Fighter("Gourry", 2);
        player1.addTool(new Tool("Sword of light"));
        actors.add(player1);
        PlayerCharacter player2 = new Mage("Lina", 3);
        player2.addTool(new Tool("Fireball spell"));
        actors.add(player2);
        PlayerCharacter player3 = new Mage("Amelia", 1);
        actors.add(player3);
        Collections.sort(actors);
    }
    
    public void listActors() {
        StringBuilder text = new StringBuilder("Actors listed by name:\n");
        actors.stream().forEach(actor -> text.append(actor.toString()).append("\n"));
        if (window == null) {
            ConsoleHelper.writeToConsole(text.toString());
        }
    }
    
    public void simulateFight() {
        StringBuilder text = new StringBuilder("A fight has broken out!\n");
        for (int i = 0; i < 3;i++) {
            for (Actor actor : actors) {
                if (actor instanceof PlayerCharacter) {
                    text.append(((PlayerCharacter)actor).useTool(0)).append("\n");
                }
            }
        }
        if (window == null) {
            ConsoleHelper.writeToConsole(text);
        } else {
            window.displayOnWindow(text);
        }
    }
    
    public void saveGameState() {
        gameData.writeActorsToDisk(actors);
    }
    
    public void resetGameState() {
        gameData.deleteActorsFromDisk();
    }
}
