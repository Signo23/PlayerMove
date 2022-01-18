package it.playermove.model;

import it.playermove.common.Point;

public class Player {
    
    private final Point pos;
    private final String iDCharacter;
    
    public Player(final String iD) {
        this.iDCharacter = iD;
        this.pos = new Point();
    }

    /**
     * @return the pos
     */
    public Point getPos() {
        return this.pos;
    }

    /**
     * @return the iDCharacter
     */
    public String getIDCharacter() {
        return this.iDCharacter;
    }
    
    
    
    

}
