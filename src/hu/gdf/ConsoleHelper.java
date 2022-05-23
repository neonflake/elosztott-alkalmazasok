package hu.gdf;

import java.util.Scanner;

/**
 *
 * @author Erős Ákos <wlxgpb@neptun.gdf.hu>
 */
public class ConsoleHelper {
      
    public static String readFromConsole() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    
    public static void writeToConsole(StringBuilder text) {
        writeToConsole(text.toString());
    }
    
    public static void writeToConsole(String text) {
        System.out.println(text);
    }
}
