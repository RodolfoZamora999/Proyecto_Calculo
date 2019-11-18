
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Prueba
{
    public static void main(String[] args) throws InterruptedException
    {
       Espacio espacio = new Espacio();
       espacio.setVisible(true);
    }
}

class Espacio extends JFrame
{
    public Espacio()
    {
        super();
        initComponents();
    }
    
    private void initComponents()
    {
        //Propiedades del JFrame
        this.setSize(1000,1000);
        this.setLocation(300, 20);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Espacio");
        this.setLayout(null);
        
        
        //Panel
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setLocation(0,0);
        panel.setSize(1000,1000);
        panel.setLayout(null);
        this.add(panel);
        
        
        
        
        //Creación del componente
        JLabel component = new JLabel();
        component.setBackground(Color.BLUE);
        component.setOpaque(true);
        component.setSize(40,40);
        component.setLocation(50, 900);
        panel.add(component);
        
        
       
        
        
        double v0 = 200;
        double angulo = 90;
        double h = 3;
        double g = 32;
        
        
        Simulacion simulacion = new Simulacion(component, v0, angulo, h, g);
        System.out.println(simulacion.calcularAlturaMax());
        
        
        JLabel linea = new JLabel();
        linea.setSize(1000,5);
        linea.setLocation(0, component.getLocation().y - (int)simulacion.calcularAlturaMax());
        linea.setBackground(Color.red);
        linea.setOpaque(true);
        panel.add(linea);
        
        
        JButton boton = new JButton("Iniciar");
        boton.setLocation(10,10);
        boton.setSize(100,50);
        boton.addActionListener((ActionEvent e) -> 
        {
                Thread thread = new Thread(()->
                {
                    try 
                    {
                      simulacion.iniciarSimulacion();
                        
                    } catch (InterruptedException ex)
                    {
                        Logger.getLogger(Espacio.class.getName()).log(Level.SEVERE, null, ex);
                    }
                });
                
                thread.start();
        });
        
        panel.add(boton);
          
    }
}
