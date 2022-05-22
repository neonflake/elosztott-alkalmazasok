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
