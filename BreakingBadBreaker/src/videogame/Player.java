/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videogame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author charles
 */
public class Player extends Item {
    
    private Game game;
    private int speed;

    public Player(int x, int y, int width, int height, Game game) {
        super(x, y, width, height);
        this.game = game;
        this.speed = 5;
    }

    @Override
    public void tick() {
        
        if (game.getKeyManager().left) {
            setX(getX() - speed);
        }
        
        if (game.getKeyManager().right) {
            setX(getX() + speed);
        }
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(getX(), getY(), getWidth(), getHeight());
    }


}
