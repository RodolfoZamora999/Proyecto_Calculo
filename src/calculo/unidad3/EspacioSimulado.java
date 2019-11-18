package calculo.unidad3;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.*;

/**
 * Clase destinada para la simulación de un cohete
 * @author rodol
 */
public class EspacioSimulado extends JPanel
{
    public EspacioSimulado()
    {
        super();
        initComponents();
    }
    
    /**
     * Inicializa los componentes necesarios para la clase.
     */
    private void initComponents()
    {
        //Propiedades del objeto
        this.setBackground(Color.WHITE);
        this.setLayout(null);
        
    }

    /**
     * Método para el dibujado del componente.
     * @param g 
     */
    @Override
    public void paint(Graphics g) 
    {
        super.paint(g); 
        
        Graphics2D graphics = (Graphics2D)g;
        graphics.setStroke(new BasicStroke(1));
        
        //Creación de la cuadrícula del espacio.
        for (int i = 0; i < this.getSize().width; i+= 50)
            graphics.drawLine(i, 0, i, this.getSize().height); 
        
        for (int i = 0; i < this.getSize().height; i+= 50)
            graphics.drawLine(0, i, this.getSize().width, i); 

        graphics.setStroke(new BasicStroke(5));
        graphics.setColor(new Color(0, 0, 255, 150));
        
    }
    
}
