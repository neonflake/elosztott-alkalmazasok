package hu.gdf;

import java.io.Serializable;

/**
 *
 * @author Erős Ákos <wlxgpb@neptun.gdf.hu>
 */
public abstract class Actor implements Comparable<Actor>, Serializable {

    private String name;
    private int level;

    public Actor (String name) {
        this(name, 1);
    }
    
    public Actor (String name, int level) {
        this.name = name;
        this.level = level >= 1 ? level : 1;
    }
    
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

    public void increaseLevel() {
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

