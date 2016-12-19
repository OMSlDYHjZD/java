package com.calenaur.interactive;

import java.awt.*;

public class Button implements Item {

    private int x;
    private int y;
    private int width;
    private int height;

    public Button(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public Button(Rectangle rect){
        this.x = rect.x;
        this.y = rect.y;
        this.width = rect.width;
        this.height = rect.height;
    }

    @Override
    public void act() {

    }

    @Override
    public void update() {

    }

    @Override
    public void draw(Graphics g, double width, double height) {
        g.fillRect(x, y, this.width, this.height);
    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }
}
