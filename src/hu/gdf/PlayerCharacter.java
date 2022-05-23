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
    
    private void increaseExperiencePoints(int amount) {
        experiencePoints += amount;
        if (experiencePoints % 10 == 0) {
            increaseLevel();
        }
    }
    
    @Override
    public void addTool(Tool tool){
        tools.add(tool);
    }
    
    @Override
    public String useTool(int toolIndex) {
        String text = getName();
        if (toolIndex < tools.size() && toolIndex > -1) {
            text = text + tools.get(toolIndex).use();
            increaseExperiencePoints(5);
        } else {
            increaseExperiencePoints(2);
            text = text + " uses kicks and punches";
        }
        return text;
    }
}
