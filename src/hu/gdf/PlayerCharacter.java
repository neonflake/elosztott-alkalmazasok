/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hu.gdf;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Erős Ákos <wlxgpb@neptun.gdf.hu>
 */
public abstract class PlayerCharacter extends Actor implements ToolUser {
    
    protected List<Tool> tools = new ArrayList();
    protected int points;

    public PlayerCharacter(String name) {
        this(name, 1);
    }
    
    public PlayerCharacter(String name, int level) {
        this.name = name;
        if (level < 1) {
           System.out.println("Tapasztalati szint minimum 1!");
           level = 1;
        }
        this.level = level;
    }
    
    private void increasePoints() {
        points += 5;
        if (points % 10 == 0) {
            level++;
        }
    }
    
    @Override
    public void addTool(Tool tool){
        tools.add(tool);
    }
    
    @Override
    public void useTool(int toolIndex) {
        if (toolIndex < tools.size() && toolIndex > -1) {
            System.out.print(name);
            tools.get(0).use();
            increasePoints();
        } else {
            System.out.println(name + " has no such tool!");
        }
    }
}
