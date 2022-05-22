package hu.gdf;

import java.io.Serializable;

/**
 *
 * @author Erős Ákos <wlxgpb@neptun.gdf.hu>
 */
public abstract class Actor implements Comparable<Actor>, Serializable {
    protected String name;
    protected int level;

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }
    
        public void setLevel(int level) {
        this.level = level;
    }

    public void levelUp() {
        level++;
    }
    
    @Override
    public String toString() {
        return name + " <" + level + ">";
    }
    
    @Override
    public int compareTo(Actor other) {
       return name.compareTo(other.getName());
    }
}

