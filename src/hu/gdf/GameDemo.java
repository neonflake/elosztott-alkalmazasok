package hu.gdf;

import java.io.Serializable;
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
    
    public GameDemo() {
        actors = gameData.readActorsFromDisk();
        if (actors == null) {
            System.out.println("No save found: starting in a clean state\n");
            initActors();
        } else {
            System.out.println("Save found: loading previous state\n");
        }
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
                System.out.println("Adding NPC failed");
            } 
        }
        PlayerCharacter player1 = new Fighter("Gourry", 2);
        player1.addTool(new Tool("Sword of light"));
        actors.add(player1);
        PlayerCharacter player2 = new Mage("Lina", 3);
        player2.addTool(new Tool("Fireball spell"));
        actors.add(player2);
        Collections.sort(actors);
    }
    
    public void listActors() {
        System.out.println("Actors listed by name:");
        actors.stream().forEach(actor -> System.out.println(actor));
        System.out.println();
    }
    
    public void simulateFight() {
        System.out.println("A fight has broken out!");
        for (int i = 0; i < 3;i++) {
            for (Actor actor : actors) {
                if (actor instanceof PlayerCharacter) {
                    ((PlayerCharacter)actor).useTool(0);
                }
            }
        }
        System.out.println();
    }
    
    public void saveGameState() {
        gameData.writeActorsToDisk(actors);
    }
    
    public void resetGameState() {
        gameData.deleteActorsFromDisk();
    }
}
