package hu.gdf;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 *
 * @author Erős Ákos <wlxgpb@neptun.gdf.hu>
 */
public class GameData {
    
    public GameData() {
        
    }
    
    public void writeActorsToDisk(List<Actor> actors) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("game.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(actors);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException exception) {
            System.out.println(exception);
            System.out.println("Save game error!");
        }
    }
    
    public List<Actor> readActorsFromDisk() {
        List<Actor> actors = null;
        if (new File("game.dat").exists()) {
            try {
            FileInputStream fileInputStream = new FileInputStream("game.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            actors = (List<Actor>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
            } catch (IOException | ClassNotFoundException exception) {
                System.out.println("Load game error!");
            }  
        }
        return actors;
    }
    
    public void deleteActorsFromDisk() {
        File file = new File("game.dat");
        if (file.exists()) {
            try {
                file.delete();
            } catch (Exception IOException) {
                System.out.println("Reset game error!");
            }
        }
    }
}
