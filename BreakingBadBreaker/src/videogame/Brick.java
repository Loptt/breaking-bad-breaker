/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videogame;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author charles
 */
public class Brick extends Item {
    
    private Game game;
    private boolean broken;
    
    public Brick(int x, int y, int width, int height, Game game) {
        super(x, y, width, height);
        this.game = game;
        broken = false;
    }
    
    public boolean isBroken(){
        return broken;
    }
    
    public void setBroken(boolean broken){
        this.broken = broken;
    }
    
    @Override
    public void tick() {
    }
    
    @Override
    public void render(Graphics g) {
        if(!broken){
            g.setColor(Color.pink);
            g.fillRect(x, y, width, height);
        }
    }
    
}
