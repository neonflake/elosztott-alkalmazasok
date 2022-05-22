/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hu.gdf;

/**
 *
 * @author Erős Ákos <wlxgpb@neptun.gdf.hu>
 */
public abstract class Character {
    protected String name;
    protected int level;

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public void levelUp() {
        level++;
    }
}

