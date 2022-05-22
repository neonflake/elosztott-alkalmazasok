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
