package com.calenaur.interactive;

import java.awt.*;

public interface Item {

    void act();

    void update();

    void draw(Graphics g, double width, double height);

    Rectangle getBounds();


}
