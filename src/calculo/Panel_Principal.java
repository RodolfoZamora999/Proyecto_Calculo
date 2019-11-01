package calculo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.*;

/**
 *Panel principal del programa, este sera la bienvenida
 * @author rodol
 */
public class Panel_Principal extends JPanel
{
    private final JFrame contenedor;
    private JLabel lblTitulo;
    private JButton btnInicio;
    private JButton btnAyuda;
    private JButton btnConfiguracion;
    
    public Panel_Principal(JFrame contenedor)
    {
        this.contenedor = contenedor;
        initComponents();
    }
    
    //Inicializa los componentes de la clase necesarios.
    private void initComponents()
    {
        this.setBackground(new Color(40,40,40));
        this.setLocation(0,0);
        this.setSize(1100,800);
        this.setLayout(null);
        
        this.lblTitulo = new JLabel();
        this.lblTitulo.setSize(900,50);
        this.lblTitulo.setLocation((this.getWidth()-this.lblTitulo.getWidth())/2, 40);
        this.lblTitulo.setText("Este es mi proyecto de cálculo. Es el inicio");
        this.lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 36));
        this.lblTitulo.setForeground(Color.WHITE);
        
        this.btnInicio = new JButton();
        this.btnInicio.setSize(300,100);
        this.btnInicio.setLocation((this.getWidth()-this.btnInicio.getWidth())/2, this.getHeight()-200);
        this.btnInicio.setBackground(new Color(34,73,162));
        this.btnInicio.setText("Iniciar");
        this.btnInicio.setForeground(Color.WHITE);
        this.btnInicio.setFont(new Font("Tahoma",Font.PLAIN,24));
        this.btnInicio.setBorder(null);
        this.btnInicio.addActionListener((ActionEvent e) -> 
        {
             Panel_Unidades panel = new Panel_Unidades(contenedor);
             contenedor.remove(Panel_Principal.this);
             contenedor.add(panel);
             contenedor.revalidate();
             contenedor.repaint();
        });
                
        this.btnAyuda = new JButton();
        this.btnAyuda.setSize(100,100);
        this.btnAyuda.setLocation(100, this.getHeight()-200);
        this.btnAyuda.setBackground(new Color(34,73,162));
        this.btnAyuda.setText("Help");
        this.btnAyuda.setForeground(Color.WHITE);
        this.btnAyuda.setFont(new Font("Tahoma",Font.PLAIN,24));
        this.btnAyuda.setBorder(null);
        
        this.btnConfiguracion = new JButton();
        this.btnConfiguracion.setSize(100,100);
        this.btnConfiguracion.setLocation(this.getWidth()-200, this.getHeight()-200);
        this.btnConfiguracion.setBackground(new Color(34,73,162));
        this.btnConfiguracion.setText("Settings");
        this.btnConfiguracion.setForeground(Color.WHITE);
        this.btnConfiguracion.setFont(new Font("Tahoma",Font.PLAIN,24));
        this.btnConfiguracion.setBorder(null);
        
        this.add(this.lblTitulo); 
        this.add(this.btnInicio);
        this.add(this.btnAyuda);
        this.add(this.btnConfiguracion);
    }
    
            
}
