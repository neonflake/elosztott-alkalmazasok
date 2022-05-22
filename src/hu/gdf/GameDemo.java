/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hu.gdf;

/**
 *
 * @author Erős Ákos <wlxgpb@neptun.gdf.hu>
 */
public class GameDemo {
    
    public GameDemo() {
        Actor player1 = new Fighter("Goury");
        Actor player2 = new Magician("Lina", 3);
        Actor npc = new NonPlayerCharacter("Bartender");
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(npc);
    }
}
