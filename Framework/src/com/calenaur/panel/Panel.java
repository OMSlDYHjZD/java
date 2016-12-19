package com.calenaur.panel;

import java.awt.*;

public interface Panel {

    void click(int x, int y);

    void update();

    void draw(Graphics g, double width, double height);

}
