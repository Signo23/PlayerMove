package it.playermove.model;

import java.util.ArrayList;
import java.util.List;

public class Map {
    private Player player;
    private int width;
    private int heigth;
    private List<Block> blocks;
    
    public Map(final Player player, final int width, final int heigth) {
        this.player = player;
        this.width = width;
        this.heigth = heigth;
        this.blocks = new ArrayList<>();
    }
    
    public Map(final Player player) {
        this(player, 32, 32);
    }

    /**
     * @return the player
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @return the heigth
     */
    public int getHeigth() {
        return heigth;
    }

    /**
     * @return the blocks
     */
    public List<Block> getBlocks() {
        return blocks;
    }

    /**
     * 
     * @param block to add in the map
     */
    public void addBlock(final Block block) {
        this.blocks.add(block);
    }
    
    
}
