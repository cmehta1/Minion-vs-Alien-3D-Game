package com.CMPE202.Team31Project;

/**
 * This is a very basic enemy that can be hit and unhit. I might want to add
 * a field for health and point value but I don't want to change the whole game
 * jsut yet.
 */
abstract class Enemy {
    private boolean isHit;
  
    public Enemy() {
        this.isHit = false;
    }
    
    public boolean isHit() {return isHit;}
    
    public void hit() {isHit = true;}
    
    public void unhit() {isHit = false;}
}
