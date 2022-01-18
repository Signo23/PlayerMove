package it.playermove.model;

import it.playermove.common.Point;

public class Block {
    private final Point pos;
    
    public Block(final Point position) {
        this.pos = position;
    }

    /**
     * @return the pos
     */
    public Point getPos() {
        return pos;
    }
    
}
