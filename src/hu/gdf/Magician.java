/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hu.gdf;

/**
 *
 * @author Erős Ákos <wlxgpb@neptun.gdf.hu>
 */
public class Magician extends PlayerCharacter{
    
    public Magician(String name) {
        super(name);
    }
    
    public Magician(String name, int level) {
        super(name, level);
    }
    
    @Override
    public String toString() {
        return super.toString() + " - Magician";
    }
}
