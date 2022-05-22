/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hu.gdf;

import java.util.Scanner;

/**
 *
 * @author Erős Ákos <wlxgpb@neptun.gdf.hu>
 */
public class ConsoleReader {
      
    public static String readInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
