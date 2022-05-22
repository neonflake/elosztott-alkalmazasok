/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hu.gdf;

/**
 *
 * @author Erős Ákos <wlxgpb@neptun.gdf.hu>
 */
public class Fighter extends PlayerCharacter{
    
    public Fighter(String name) {
        super(name);
    }
    
    public Fighter(String name, int level) {
        super(name, level);
    }
    
    @Override
    public String toString() {
        return super.toString() + " - Fighter";
    }
}
