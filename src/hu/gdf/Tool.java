package hu.gdf;

import java.io.Serializable;

/**
 *
 * @author Erős Ákos <wlxgpb@neptun.gdf.hu>
 */
public class Tool implements Serializable {

    private final String name;
    
    public Tool(String name) {
        this.name = name;
    }
    
    public String use() {
        return (" uses the " + name);
    }
    
    public String getName() {
        return name;
    }  
}
