/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hu.gdf;

/**
 *
 * @author Erős Ákos <wlxgpb@neptun.gdf.hu>
 */
public class Player extends Character {
    protected int points;

    public Player(String name) {
        this(name, 1);
    }
    
    public Player(String name, int level) {
        this.name = name;
        if (level < 1) {
           System.out.println("Tapasztalati szint minimum 1!");
           level = 1;
        }
        this.level = level;
    }
}
