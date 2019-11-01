package calculo;

import calculo.unidad1.Panel_Unidad1;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.border.TitledBorder;

/**
 * Panel que administra las actividades por unidades.
 * Esto con el fin de tener una mejor organización con respecto a los temas.
 * @author rodol
 */
public class Panel_Unidades extends JPanel
{
    private final JFrame contenedor;
    private JLabel lblMensaje, lblUnidad1, lblUnidad2, lblUnidad3;
    private JButton btnRegresar, btnUnidad1, btnUnidad2, btnUnidad3;
    
    public Panel_Unidades(JFrame contenedor)
    {
        this.contenedor = contenedor;
        initComponenents();
    }
    
    //Inicializa los componentes de la clase necesarios.
    private void initComponenents()
    {
        this.setBackground(new Color(40, 40, 40));
        this.setLocation(0,0);
        this.setSize(1100,800);
        this.setLayout(null);
        
        this.lblMensaje = new JLabel();
        this.lblMensaje.setSize(1000,80);
        this.lblMensaje.setLocation(40, 40);
        this.lblMensaje.setText("<html>Esta es la sección de unidades. "
                + "Dentro de cada una encontraras los temas relacionados<br>a e"
                + "sta, espero que lo disfrutes. </html>");
        this.lblMensaje.setFont(new Font("Tahoma", Font.PLAIN, 24));
        this.lblMensaje.setForeground(Color.WHITE);
        
        this.btnUnidad1 = new JButton();
        this.btnUnidad1.setSize(190,70);
        this.btnUnidad1.setLocation(55, 300);
        this.btnUnidad1.setBackground(new Color(127,34,162));
        this.btnUnidad1.setText("Unidad 1");
        this.btnUnidad1.setForeground(Color.WHITE);
        this.btnUnidad1.setFont(new Font("Tahoma",Font.PLAIN,24));
        this.btnUnidad1.setBorder(null);
        this.btnUnidad1.addActionListener((ActionEvent e) -> 
        {
             Panel_Unidad1 panel = new Panel_Unidad1(this.contenedor);
             contenedor.remove(Panel_Unidades.this);
             contenedor.add(panel);
             contenedor.revalidate();
             contenedor.repaint();
        });
        
        this.lblUnidad1 = new JLabel();
        this.lblUnidad1.setSize(300, 400);
        this.lblUnidad1.setLocation(30, 150);
        this.lblUnidad1.setBorder(BorderFactory.createTitledBorder(null, "Unidad 1", TitledBorder.CENTER,
                TitledBorder.TOP, new Font("Tahoma", Font.BOLD, 24), Color.WHITE));
        this.lblUnidad1.setForeground(Color.BLACK);
        this.lblUnidad1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        this.lblUnidad1.setVerticalAlignment(JLabel.TOP);
        this.lblUnidad1.setForeground(Color.WHITE);
        this.lblUnidad1.setText("<html>En esta unidad se exploran los temas básicos "
                + "del cálculo vectorial. ¿Qué es un vector?, "
                + "¿Cómo se define?, entre otras cosas más. </html>");
        this.lblUnidad1.add(this.btnUnidad1);
        
        this.btnUnidad2 = new JButton();
        this.btnUnidad2.setSize(190,70);
        this.btnUnidad2.setLocation(55, 300);
        this.btnUnidad2.setBackground(new Color(127,34,162));
        this.btnUnidad2.setText("Unidad 2");
        this.btnUnidad2.setForeground(Color.WHITE);
        this.btnUnidad2.setFont(new Font("Tahoma",Font.PLAIN,24));
        this.btnUnidad2.setBorder(null);
        
        this.lblUnidad2 = new JLabel();
        this.lblUnidad2.setSize(300, 400);
        this.lblUnidad2.setLocation(360, 150);
        this.lblUnidad2.setBorder(BorderFactory.createTitledBorder(null, "Unidad 2", TitledBorder.CENTER,
                TitledBorder.TOP, new Font("Tahoma", Font.BOLD, 24), Color.WHITE));
        this.lblUnidad2.setForeground(Color.BLACK);
        this.lblUnidad2.setFont(new Font("Tahoma", Font.PLAIN, 18));
        this.lblUnidad2.setVerticalAlignment(JLabel.TOP);
        this.lblUnidad2.setForeground(Color.WHITE);
        this.lblUnidad2.setText("<html>Esta unidad se abarcan ciertos temas un poco complejos, "
                + "pero resulta interesante su compresión de una manera gráfica. Entre algunos "
                + "de ellos son vectores, unidades, entre otras cosas. </html>");
       this.lblUnidad2.add(this.btnUnidad2);
       
        this.btnUnidad3 = new JButton();
        this.btnUnidad3.setSize(200,80);
        this.btnUnidad3.setLocation(55, 300);
        this.btnUnidad3.setBackground(new Color(127,34,162));
        this.btnUnidad3.setText("Unidad 3");
        this.btnUnidad3.setForeground(Color.WHITE);
        this.btnUnidad3.setFont(new Font("Tahoma",Font.PLAIN,24));
        this.btnUnidad3.setBorder(null);
        
        this.lblUnidad3 = new JLabel();
        this.lblUnidad3.setSize(300, 400);
        this.lblUnidad3.setLocation(720, 150);
        this.lblUnidad3.setBorder(BorderFactory.createTitledBorder(null, "Unidad 3", TitledBorder.CENTER,
                TitledBorder.TOP, new Font("Tahoma", Font.BOLD, 24), Color.WHITE));
        this.lblUnidad3.setForeground(Color.BLACK);
        this.lblUnidad3.setFont(new Font("Tahoma", Font.PLAIN, 18));
        this.lblUnidad3.setVerticalAlignment(JLabel.TOP);
        this.lblUnidad3.setForeground(Color.WHITE);
        this.lblUnidad3.setText("<html>¿Porque no ver la parte práctica de esto?<br>"
                + "Resulta más divertido cuando puedes interactuar con las matemáticas "
                + "de manera dinámica.</html>");
        this.lblUnidad3.add(this.btnUnidad3);
       
        this.btnRegresar = new JButton();
        this.btnRegresar.setSize(250,100);
        this.btnRegresar.setLocation(this.getWidth()-300, this.getHeight()-150);
        this.btnRegresar.setBackground(new Color(34,73,162));
        this.btnRegresar.setText("Regresar");
        this.btnRegresar.setForeground(Color.WHITE);
        this.btnRegresar.setFont(new Font("Tahoma",Font.PLAIN,24));
        this.btnRegresar.setBorder(null);
        this.btnRegresar.addActionListener((ActionEvent e) -> 
        {
             Panel_Principal panel = new Panel_Principal(contenedor);
             contenedor.remove(Panel_Unidades.this);
             contenedor.add(panel);
             contenedor.revalidate();
             contenedor.repaint();
        });
        
        this.add(this.lblMensaje);
        this.add(this.btnRegresar);
        this.add(this.lblUnidad1);
        this.add(this.lblUnidad2);
        this.add(this.lblUnidad3);
    }
    
}
