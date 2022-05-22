package hu.gdf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Erős Ákos <wlxgpb@neptun.gdf.hu>
 */
public class GameDemo {
    
    private final List<Actor> actors = new ArrayList();
    
    public GameDemo() {
        initActors();
    }
    
    private void initActors() {
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
        PlayerCharacter player2 = new Magician("Lina", 3);
        player2.addTool(new Tool("Fireball spell"));
        actors.add(player2);
        Collections.sort(actors);
    }
    
    public void showActors() {
        System.out.println("List of actors by name:");
        actors.stream().forEach(actor -> System.out.println(actor));
        System.out.println();
    }
    
    public void doSomeAction() {
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
}
