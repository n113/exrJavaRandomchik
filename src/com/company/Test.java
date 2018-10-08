package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Test extends JFrame {
    Random rand = new Random();

    public void paint(Graphics g) {
        super.paint(g);
        //g.drawLine(0, 0, 100, 100);
//        g.drawOval(100,100,5,5);
        int x = rand.nextInt(200);
        int y = rand.nextInt(200);
        g.fillOval(x, y, 10, 10);

    }

    public Test() {
        super("Test");
        JFrame.setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(800, 600);
        setVisible(true);
    }




}