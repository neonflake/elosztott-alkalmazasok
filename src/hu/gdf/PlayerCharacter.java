package hu.gdf;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Erős Ákos <wlxgpb@neptun.gdf.hu>
 */
public abstract class PlayerCharacter extends Actor implements ToolUser {
    
    private final List<Tool> tools = new ArrayList();
    private int experiencePoints;
    
    public PlayerCharacter(String name) {
        super(name);
    }
    
    public PlayerCharacter(String name, int level) {
        super(name, level);
    }
    
    private void increaseExperiencePoints() {
        experiencePoints += 5;
        if (experiencePoints % 10 == 0) {
            increaseLevel();
        }
    }
    
    @Override
    public void addTool(Tool tool){
        tools.add(tool);
    }
    
    @Override
    public void useTool(int toolIndex) {
        if (toolIndex < tools.size() && toolIndex > -1) {
            System.out.print(getName());
            tools.get(toolIndex).use();
            increaseExperiencePoints();
        } else {
            System.out.println(getName() + " has no such tool!");
        }
    }
}
