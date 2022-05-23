package hu.gdf;

/**
 *
 * @author Erős Ákos <wlxgpb@neptun.gdf.hu>
 */
public class Mage extends PlayerCharacter{
    
    public Mage(String name) {
        super(name);
    }
    
    public Mage(String name, int level) {
        super(name, level);
    }
    
    @Override
    public String toString() {
        return super.toString() + " - Mage";
    }
}
