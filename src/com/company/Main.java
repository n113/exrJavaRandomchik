package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public class Main {

    public static void main(String[] args) {
//        final BufferedImage image = new BufferedImage ( 1000, 1000, BufferedImage.TYPE_INT_ARGB );
//        final Graphics2D graphics2D = image.createGraphics ();
//        graphics2D.setPaint ( Color.WHITE );
//        graphics2D.fillRect ( 0,0,1000,1000 );
//        graphics2D.setPaint ( Color.BLACK );
//        graphics2D.drawOval ( 0, 0, 1000, 1000 );
//        graphics2D.dispose ();
//
//        ImageIO.write ( image, "png", new File( "C:\\image.png" ) );

        MyCanvas canvas = new MyCanvas();
        JFrame frame = new JFrame();
        int vertexes = 0;
        // Change this next part later to be dynamic.
        vertexes = 10;
        int canvasSize = vertexes * vertexes;
        frame.setSize(canvasSize, canvasSize);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(canvas.view);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }
}
