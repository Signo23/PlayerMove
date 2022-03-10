package it.playermove.model;

import java.util.ArrayList;
import java.util.List;

public class Map {
    private int width;
    private int heigth;
    private List<Block> blocks;
    
    public Map(final int width, final int heigth) {
        this.width = width;
        this.heigth = heigth;
        this.blocks = new ArrayList<>();
    }
    
    public Map() {
        this( 32, 32);
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
