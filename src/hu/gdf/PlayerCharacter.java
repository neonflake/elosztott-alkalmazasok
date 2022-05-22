/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hu.gdf;

/**
 *
 * @author Erős Ákos <wlxgpb@neptun.gdf.hu>
 */
public abstract class PlayerCharacter extends Actor {
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
}
