package hu.gdf;

/**
 *
 * @author Erős Ákos <wlxgpb@neptun.gdf.hu>
 */
public class NonPlayerCharacter extends Actor implements Cloneable {
    
    public NonPlayerCharacter(String name) {
        super(name);
    }
    
    @Override
    public NonPlayerCharacter clone() throws CloneNotSupportedException{
        NonPlayerCharacter clone = (NonPlayerCharacter)super.clone();
        clone.setName(getName());
        clone.setLevel(getLevel());
        return clone;
    }
    
    @Override
    public String toString() {
        return super.toString() + " - NPC";
    }
}
