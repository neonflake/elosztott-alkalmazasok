/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hu.gdf;

/**
 *
 * @author Erős Ákos <wlxgpb@neptun.gdf.hu>
 */
public abstract class Actor {
    protected String name;
    protected int level;

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }
    
        public void setLevel(int level) {
        this.level = level;
    }

    public void levelUp() {
        level++;
    }
    
    @Override
    public String toString() {
        return name + " <" + level + ">";
    }
}

