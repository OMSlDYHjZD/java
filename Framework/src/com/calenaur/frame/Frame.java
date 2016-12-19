package com.calenaur.frame;

import com.calenaur.controller.Mouse;

import javax.swing.*;

public class Frame extends JFrame {

    private JFrame frame;

    public Frame(Draw draw, Mouse mouse){
        frame = new JFrame();
        frame.setTitle("Chat");
        frame.setSize(800, 800);
        frame.addMouseListener(mouse);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setContentPane(draw);
        frame.setVisible(true);
    }

    public JFrame getFrame(){
        return frame;
    }

}
