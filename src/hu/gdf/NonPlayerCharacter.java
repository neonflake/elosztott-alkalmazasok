/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hu.gdf;

/**
 *
 * @author Erős Ákos <wlxgpb@neptun.gdf.hu>
 */
public class NonPlayerCharacter extends Actor {
    
    public NonPlayerCharacter(String name) {
        this.name = name;
        this.level = 1;
    }
    
    @Override
    public String toString() {
        return super.toString() + " - NPC";
    }
}
