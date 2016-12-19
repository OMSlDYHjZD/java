package com.calenaur.controller;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import com.calenaur.panel.Panel;

public class Mouse implements MouseListener{

    private Panel panel;

    public Mouse(){

    }

    public Mouse(Panel panel){
        this.panel = panel;
    }

    public void setPanel(Panel panel){
        this.panel = panel;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        panel.click(e.getX(), e.getY());
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
