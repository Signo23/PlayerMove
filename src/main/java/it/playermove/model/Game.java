package it.playermove.model;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private final Player ply;
    private final List<Map> maps;
    private final List<GameObject> backpack;
    
    public Game(final Player player, final List<Map> maps) {
        this.ply = player;
        this.maps = maps;
        this.backpack = new ArrayList<>();
    }

    /**
     * @return the ply
     */
    public Player getPly() {
        return ply;
    }

    /**
     * @return the maps
     */
    public List<Map> getMaps() {
        return maps;
    }

    /**
     * @return the backpack
     */
    public List<GameObject> getBackpack() {
        return backpack;
    }
    
    
    
}
