
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rodol
 */
public class PincturaPruebas extends JFrame
{
    public PincturaPruebas()
    {
        initComponets();
    }
    
    private void initComponets()
    {
        this.setTitle("Picasso");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1280, 720);
        this.setLocation(200, 100);
        this.getContentPane().setBackground(new Color(40, 40, 40));
        this.setLayout(null);
        
        Fondo fondo = new Fondo();
        fondo.setSize(1050, 600);
        fondo.setLocation(100, 10);
        this.add(fondo);
    }
    
    
    private class Fondo extends JPanel
    {
        public Fondo()
        {
            this.setBackground(Color.WHITE);
        }

        @Override
        public void paint(Graphics g) 
        {
            super.paint(g);
            
            Graphics2D graphics = (Graphics2D)g;
            
            //Creación del cielo
            graphics.setColor(new Color(232, 68, 2));
            graphics.fillRect(0, 0, 1050, 550);
            
            //Creación de estrellas
            Random random = new Random();
            graphics.setColor(new Color(255, 255, 255));
            for(int i = 0; i < 60; i++)
                graphics.fillOval(random.nextInt(1050), random.nextInt(550), 3, 3);

            //Creación del suelo del sol
            graphics.setColor(new Color(255, 40, 10));
            graphics.fillRect(0, 550, 1050, 50);
            
        }
   
    }
    
    
    
    public static void main(String... args)
    {
        PincturaPruebas pruebas = new PincturaPruebas();
        pruebas.setVisible(true);
    }
}
