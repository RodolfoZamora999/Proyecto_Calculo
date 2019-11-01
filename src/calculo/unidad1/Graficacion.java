package calculo.unidad1;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.BorderFactory;

/**
 * Esta clase esta destinada para la graficación de un plano tridimensional.
 * Permite ubicar puntos e interactuar en tiempo de ejecución con esta.
 * @author rodol
 */
public class Graficacion extends javax.swing.JPanel
{ 
    private int X;
    private int Y;
    private int Z;
    
    public Graficacion(int width, int height)
    {
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        
        initComponents(width, height);
    }
   
    //Inicializa las propiedades principales de la clase.
    private void initComponents(int width, int heigh)
    {
        this.setSize(width, heigh);
        this.setBackground(Color.WHITE);
        this.setLayout(null);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK, HEIGHT));      
    }

    @Override
    public void paint(Graphics g)
    {
        super.paint(g); 
        
        //Obtención del objeto para graficar
        Graphics2D graphics2D = (Graphics2D)g;
        graphics2D.setStroke(new BasicStroke(5));
        graphics2D.setColor(Color.BLACK);

        //Creación de las lineas que dividen el marco
        graphics2D.drawLine(0, this.getHeight()/2, this.getWidth(), this.getHeight()/2);
        graphics2D.drawLine(this.getWidth()/2, 0, this.getWidth()/2, this.getHeight());
        graphics2D.drawLine(0, this.getHeight(), this.getWidth(), 0);
        
        //Creación de la cuadricula
         graphics2D.setStroke(new BasicStroke(1));
         
        for(int i = 0; i < this.getWidth()/20; i++)
        {
            graphics2D.drawLine(0, i*20, this.getWidth(), i*20);
            graphics2D.drawLine(i*20, 0, i*20, this.getHeight());
        }
        
        //Lineas que arman un espacio tridimensional al rededor del punto.
        //De esta manera se tiene mejor ubicado.
        graphics2D.setStroke(new BasicStroke(5));
        
        //Lineas en la recta X.
        graphics2D.setColor(Color.RED);
        graphics2D.drawLine(this.getWidth()/2, this.getHeight()/2, (this.getWidth()/2) + (this.X + this.Z), this.getHeight()/2);
        graphics2D.drawLine((this.getWidth()/2) - this.Z  ,(this.getHeight()/2) + this.Z, (this.getWidth()/2) + this.X , (this.getHeight()/2) + this.Z);
        graphics2D.drawLine((this.getWidth()/2) - this.Z, (this.getHeight()/2) + this.Y, (this.getWidth()/2) + this.X, (this.getHeight()/2) + this.Y);
        graphics2D.drawLine((this.getWidth()/2), (this.getHeight()/2) + (this.Y - this.Z), (this.getWidth()/2) + (this.X + this.Z), (this.getHeight()/2) + (this.Y - this.Z));
         
        //Lineas en la recta Y.
        graphics2D.setColor(Color.BLUE);
        graphics2D.drawLine(this.getWidth()/2, this.getHeight()/2, (this.getWidth()/2), (this.getHeight()/2) + (this.Y - this.Z));
        graphics2D.drawLine((this.getWidth()/2) + this.X , (this.getHeight()/2) + this.Z, (this.getWidth()/2) + this.X, (this.getHeight()/2) + this.Y);
        graphics2D.drawLine((this.getWidth()/2) - this.Z  ,(this.getHeight()/2) + this.Z, (this.getWidth()/2) - this.Z, (this.getHeight()/2) + this.Y);
        graphics2D.drawLine((this.getWidth()/2) + (this.X + this.Z), this.getHeight()/2, (this.getWidth()/2) + (this.X + this.Z), (this.getHeight()/2) + (this.Y - this.Z));
        
        //Lineas en la recta Z.
        graphics2D.setColor(Color.GREEN);
        graphics2D.drawLine(this.getWidth()/2, this.getHeight()/2, (this.getWidth()/2) - this.Z  ,(this.getHeight()/2) + this.Z);
        graphics2D.drawLine((this.getWidth()/2) + (this.X + this.Z), this.getHeight()/2,(this.getWidth()/2) + this.X ,(this.getHeight()/2) + this.Z);
        graphics2D.drawLine((this.getWidth()/2) - this.Z, (this.getHeight()/2) + this.Y, (this.getWidth()/2), (this.getHeight()/2) + (this.Y - this.Z));
        graphics2D.drawLine((this.getWidth()/2) + this.X, (this.getHeight()/2) + this.Y, (this.getWidth()/2) + (this.X + this.Z), (this.getHeight()/2) + (this.Y - this.Z));
        
        //Creación y ubicación del punto en el plano.
        graphics2D.setColor(Color.BLUE);
        graphics2D.fillOval( ((this.getWidth()-20)/2) + this.X, ((this.getHeight()-20)/2) + this.Y, 20, 20);
    }  
    
    /**
     * Método que sirve para actualizar las coordendas de la posición del vector.
     * @param x valor del eje en X
     * @param y valor del eje en Y
     * @param z valor del eje en Z
     */
    public void updateCoordinates(int x, int y, int z)
    {
        x = x*20;
        y = y*20;
        z = z*20;
        
        x = x-z;
        y = -y+z;
        
        this.X = x;
        this.Y = y;
        this.Z = z;
        
        repaint();
    }
}
