package it.playermove.common;


public class Point {

    private int yPos;
    private int xPos;
    
    public Point(final int x, final int y) {
        this.xPos = x;
        this.yPos = y;
    }
    
    public Point() {
        this(0, 0);
    }
    
    public void goUp() {
        this.yPos--;
    }
    
    public void goDown() {
        this.yPos++;
    }
    
    public void goLeft() {
        this.xPos--;
    }
    
    public void goRight() {
        this.xPos++;
    }

    /**
     * @return the yPos
     */
    public int getyPos() {
        return yPos;
    }

    /**
     * @return the xPos
     */
    public int getxPos() {
        return xPos;
    }
    
    
}
