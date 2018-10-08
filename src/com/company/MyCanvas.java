package com.company;

import java.awt.image.BufferedImage;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class MyCanvas {
    JLabel view;
    BufferedImage surface;
    Random random = new Random();

    public MyCanvas() {
        surface = new BufferedImage(600, 400, BufferedImage.TYPE_INT_RGB);
        view = new JLabel(new ImageIcon(surface));
        Graphics g = surface.getGraphics();
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, 600, 400);
        g.setColor(Color.BLACK);
        // Keep this until I figured out if it's painted on load or not.
        //g.drawLine(10, 20, 350, 380);
        g.dispose();

        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                addNewElement();
            }
        };
        Timer timer = new Timer(0, listener);
        timer.start();
    }

    public int getCube() {
        int useCube = random.nextInt(6);
        if (useCube == 0) {
            useCube++;
        }
        return useCube;
    }

    public int getMoving(int current,int top){
        return (top-current)/2+current;
    }

    int pointAx = 200;
    int pointAy = 300;

    int pointBx = 100;
    int pointBy = 100;

    int pointCx = 300;
    int pointCy = 100;

    int startPointX = 120;
    int startPointY = 150;

    int currentPositionX = startPointX;
    int currentPositionY = startPointY;






    public void addNewElement() {
        Graphics g = surface.getGraphics();

        switch (getCube()){
            case(1):
                currentPositionX=getMoving(currentPositionX,pointAx);
                currentPositionY=getMoving(currentPositionY,pointAy);
                break;
            case(2):
                currentPositionX=getMoving(currentPositionX,pointAx);
                currentPositionY=getMoving(currentPositionY,pointAy);
                break;
            case(3):
                currentPositionX=getMoving(currentPositionX,pointBx);
                currentPositionY=getMoving(currentPositionY,pointBy);
                break;
            case(4):
                currentPositionX=getMoving(currentPositionX,pointBx);
                currentPositionY=getMoving(currentPositionY,pointBy);
                break;
            case(5):
                currentPositionX=getMoving(currentPositionX,pointCx);
                currentPositionY=getMoving(currentPositionY,pointCy);
                break;
            case(6):
                currentPositionX=getMoving(currentPositionX,pointCx);
                currentPositionY=getMoving(currentPositionY,pointCy);
                break;
        }


        drawNode(currentPositionX, currentPositionY, g);
        g.dispose();
        view.repaint();
    }
//    public void addNewElement() {
//        boolean drawArc = random.nextBoolean();
//        int x = random.nextInt(60);
//        int y = random.nextInt(40);
//        Graphics g = surface.getGraphics();
//        if (drawArc) {
//            g.setColor(Color.BLUE);
//            int xx = random.nextInt(60);
//            int yy = random.nextInt(40);
//            //drawArc(x,y,xx,yy,g);
//        } else {
//            drawNode(x, y, g);
//        }
//        g.dispose();
//        view.repaint();
//    }


//    public void drawNode(int x, int y, Graphics g) {
//        // Treat each location as a 10x10 block. If position 1,1 then go to (5,5) - If position 3,5 then go to (25, 45) eg: (x*10)-5, (y*10)-5
//        int xLoc = (x * 10) - 5;
//        int yLoc = (y * 10) - 5;
//        g.setColor(Color.white);
//        g.fillOval(xLoc, yLoc, 8, 8);
//        g.drawOval(xLoc, yLoc, 8, 8);
//    }

    public void drawNode(int x, int y, Graphics g) {
//        x=random.nextInt(100);
//        y=random.nextInt(100);
        g.setColor(Color.white);
        g.fillOval(x, y, 1, 1);
        g.drawOval(x, y, 1, 1);
    }

//        public void drawArc(int x, int y, int xx, int yy, Graphics g)
//        {
//            int xLoc = (x*10) - 5;
//            int yLoc = (y*10) - 5;
//            int xxLoc = (xx*10) - 5;
//            int yyLoc = (yy*10) - 5;
//            g.drawLine(xLoc, yLoc, xxLoc, yyLoc);
//        }
}
