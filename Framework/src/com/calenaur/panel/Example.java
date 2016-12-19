package com.calenaur.panel;

import com.calenaur.interactive.Item;
import com.calenaur.interactive.Button;

import java.awt.*;

public class Example implements Panel {

    private Item item;

    public Example(){
        item = new Button(100, 100, 200, 200);
    }

    @Override
    public void click(int x, int y) {
        System.out.println(x);
        System.out.println(y);
    }

    @Override
    public void update() {
    }

    @Override
    public void draw(Graphics g, double width, double height) {
        if(item != null){
            item.draw(g, width, height);
        }
    }
}
