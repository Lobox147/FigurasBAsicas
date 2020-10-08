/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unidad2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author esaul
 */
public class Figuras extends JPanel{
    
    private JFrame ventana;
        
    private Container contenedor;
    
    public Figuras(){
        ventana = new JFrame("Dibujando figuras basicas");
        
        ventana.setSize(800,600);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        
        contenedor = ventana.getContentPane();
        ventana.setSize(800,600);
        contenedor.add(this, BorderLayout.CENTER);
        
        
       
        
    }
     @Override
        protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.setColor(Color.red);
        g.drawLine(100, 50, 200, 50);
        g.drawLine(200, 50, 200, 100);
        g.drawLine(100, 50, 200, 50);
        g.drawLine(100, 100, 200, 100);
        
        g.setColor(Color.GRAY);
        g.drawLine(100, 50, 150, 20);
        g.drawLine(200, 50, 150, 20);
        
        g.setColor(Color.blue);
        g.drawLine(200, 50, 100,50);
        g.fillRect(280,110,100,50);   
        
        g.setColor(Color.black);
        g.drawRoundRect(450, 50, 100, 50, 50, 50);
        g.fillRoundRect(450, 110, 100, 50, 20, 20);
        
        //Circulo
        g.setColor(Color.yellow);
        g.drawOval(100, 200, 90, 60);
        g.fillOval(100, 290, 50, 50);
        
        //Ovalo
        g.setColor(Color.green);
        g.drawOval(280, 200, 80, 40);
        g.fillOval(WIDTH, WIDTH, WIDTH, HEIGHT);
        
        g.setColor(Color.pink);
        g.drawLine(450, 300, 550, 100);
        g.drawLine(450,300,500,250);
        g.drawLine(550, 300, 500, 250);
        
       //Dibujo de cadenas de texto
       g.setColor(Color.black);
       g.drawString("ejemplo de trazo de fig basicas", 200, 400);
       
       
       //Trazo de arcos Tarea:
       //funcion drawArc
       //Figura uno solo contorno
       //Figura 2 Relleno
       
       g.setColor(Color.ORANGE);
       g.drawArc(500, 400, 120, 120, 45, 270);
       g.fillArc(400, 400,120,120, 45, 270);
        
    }
    
}
