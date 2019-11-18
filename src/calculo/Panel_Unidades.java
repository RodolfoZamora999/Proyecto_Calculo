package calculo;

import calculo.unidad1.Panel_Unidad1;
import calculo.unidad3.Panel_Unidad3;
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
    private JLabel lblMensaje, lblUnidad1, lblUnidad2, lblUnidad3, lblUnidad4, lblUnidad5;
    private JButton btnRegresar, btnUnidad1, btnUnidad2, btnUnidad3, btnUnidad4, btnUnidad5, btnAtras, btnAdelante;
    
    public Panel_Unidades(JFrame contenedor)
    {
        this.contenedor = contenedor;
        initComponenents();
    }
    
    /**
     * Inicialización de los componentes necesarios para la clase.
     */
    private void initComponenents()
    {
        //Propiedades del panel.
        this.setBackground(new Color(40, 40, 40));
        this.setLocation(0,0);
        this.setSize(1100,800);
        this.setLayout(null);
        this.setDoubleBuffered(true);
        
        //Label con las intrucciones.
        this.lblMensaje = new JLabel();
        this.lblMensaje.setSize(1000,80);
        this.lblMensaje.setLocation(40, 40);
        this.lblMensaje.setText("<html>Esta es la sección de unidades. "
                + "Dentro de cada una encontraras los temas relacionados<br>a e"
                + "sta, espero que lo disfrutes. </html>");
        this.lblMensaje.setFont(new Font("Tahoma", Font.PLAIN, 24));
        this.lblMensaje.setForeground(Color.WHITE);
        
        //Botón de la unidad 1.
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
        
        //Label de la unidad 1.
        this.lblUnidad1 = new JLabel();
        this.lblUnidad1.setSize(300, 400);
        this.lblUnidad1.setLocation(30, 150);
        this.lblUnidad1.setBorder(BorderFactory.createTitledBorder(null, "Unidad 1", TitledBorder.CENTER,
                TitledBorder.TOP, new Font("Tahoma", Font.BOLD, 24), Color.WHITE));
        this.lblUnidad1.setForeground(Color.BLACK);
        this.lblUnidad1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        this.lblUnidad1.setVerticalAlignment(JLabel.TOP);
        this.lblUnidad1.setForeground(Color.WHITE);
        this.lblUnidad1.setText("<html><br><center><b>What! ¿Qué es un vector?</b><br><br>"
                + "¿Qué es? ¿Cómo se hace? ¿Con que se come?\n"
                +" No te preocupes, en esta unidad lo descubrimos juntos.</center></html>");
        this.lblUnidad1.add(this.btnUnidad1);
        
        //Botón de la unidad 2.
        this.btnUnidad2 = new JButton();
        this.btnUnidad2.setSize(190,70);
        this.btnUnidad2.setLocation(55, 300);
        this.btnUnidad2.setBackground(new Color(127,34,162));
        this.btnUnidad2.setText("Unidad 2");
        this.btnUnidad2.setForeground(Color.WHITE);
        this.btnUnidad2.setFont(new Font("Tahoma",Font.PLAIN,24));
        this.btnUnidad2.setBorder(null);
        
        //Label de la unidad 2.
        this.lblUnidad2 = new JLabel();
        this.lblUnidad2.setSize(300, 400);
        this.lblUnidad2.setLocation(360, 150);
        this.lblUnidad2.setBorder(BorderFactory.createTitledBorder(null, "Unidad 2", TitledBorder.CENTER,
                TitledBorder.TOP, new Font("Tahoma", Font.BOLD, 24), Color.WHITE));
        this.lblUnidad2.setForeground(Color.BLACK);
        this.lblUnidad2.setFont(new Font("Tahoma", Font.PLAIN, 18));
        this.lblUnidad2.setVerticalAlignment(JLabel.TOP);
        this.lblUnidad2.setForeground(Color.WHITE);
        this.lblUnidad2.setText("<html><center><br><b>Algunas cosas extra...</b><br><br> "
                + "En esta unidad se profundiza un poco más sobre los vectores,"
                + " algunas operaciones disponibles entre otras cosas.</center></html>");
        this.lblUnidad2.add(this.btnUnidad2);
       
        //Botón de la unidad 3.
        this.btnUnidad3 = new JButton();
        this.btnUnidad3.setSize(200,80);
        this.btnUnidad3.setLocation(55, 300);
        this.btnUnidad3.setBackground(new Color(127,34,162));
        this.btnUnidad3.setText("Unidad 3");
        this.btnUnidad3.setForeground(Color.WHITE);
        this.btnUnidad3.setFont(new Font("Tahoma",Font.PLAIN,24));
        this.btnUnidad3.setBorder(null);
        this.btnUnidad3.addActionListener((ActionEvent e) ->
        {
             Panel_Unidad3 panel = new Panel_Unidad3(this.contenedor);
             contenedor.remove(Panel_Unidades.this);
             contenedor.add(panel);
             contenedor.revalidate();
             contenedor.repaint();
        });
        
        //Label de la unidad 3.
        this.lblUnidad3 = new JLabel();
        this.lblUnidad3.setSize(300, 400);
        this.lblUnidad3.setLocation(720, 150);
        this.lblUnidad3.setBorder(BorderFactory.createTitledBorder(null, "Unidad 3", TitledBorder.CENTER,
                TitledBorder.TOP, new Font("Tahoma", Font.BOLD, 24), Color.WHITE));
        this.lblUnidad3.setForeground(Color.BLACK);
        this.lblUnidad3.setFont(new Font("Tahoma", Font.PLAIN, 18));
        this.lblUnidad3.setVerticalAlignment(JLabel.TOP);
        this.lblUnidad3.setForeground(Color.WHITE);
        this.lblUnidad3.setText("<html><br><center><b>¿Por qué no ver la parte práctica de esto?</b><br><br>"
                + "Resultado divertido interactuar con las matemáticas,"
                + " ¡Estas no solo son resolver ejercicios sin sentido!</center></html>");
        this.lblUnidad3.add(this.btnUnidad3);
        
        //Botón de la unidad 4.
        this.btnUnidad4 = new JButton();
        this.btnUnidad4.setSize(200,80);
        this.btnUnidad4.setLocation(55, 300);
        this.btnUnidad4.setBackground(new Color(127,34,162));
        this.btnUnidad4.setText("Unidad 4");
        this.btnUnidad4.setForeground(Color.WHITE);
        this.btnUnidad4.setFont(new Font("Tahoma",Font.PLAIN,24));
        this.btnUnidad4.setBorder(null);
        
        //Label de la unidad 4.
        this.lblUnidad4 = new JLabel();
        this.lblUnidad4.setSize(300, 400);
        this.lblUnidad4.setLocation(1080, 150);
        this.lblUnidad4.setBorder(BorderFactory.createTitledBorder(null, "Unidad 4", TitledBorder.CENTER,
                TitledBorder.TOP, new Font("Tahoma", Font.BOLD, 24), Color.WHITE));
        this.lblUnidad4.setForeground(Color.BLACK);
        this.lblUnidad4.setFont(new Font("Tahoma", Font.PLAIN, 18));
        this.lblUnidad4.setVerticalAlignment(JLabel.TOP);
        this.lblUnidad4.setForeground(Color.WHITE);
        this.lblUnidad4.setText("<html><br><center><b>Derivas...¡Bah!</b></center><br>"
                + "<center>¿Qué se una derivada? Esta sección lo descubriremos"
                + " de una manera un poco más dinámica</center></html>");
        this.lblUnidad4.add(this.btnUnidad4);
        
        //Botón de la unidad 5.
        this.btnUnidad5 = new JButton();
        this.btnUnidad5.setSize(200,80);
        this.btnUnidad5.setLocation(55, 300);
        this.btnUnidad5.setBackground(new Color(127,34,162));
        this.btnUnidad5.setText("Unidad 5");
        this.btnUnidad5.setForeground(Color.WHITE);
        this.btnUnidad5.setFont(new Font("Tahoma",Font.PLAIN,24));
        this.btnUnidad5.setBorder(null);
        
        //Label de la unidad 5.
        this.lblUnidad5 = new JLabel();
        this.lblUnidad5.setSize(300, 400);
        this.lblUnidad5.setLocation(1440, 150);
        this.lblUnidad5.setBorder(BorderFactory.createTitledBorder(null, "Unidad 5", TitledBorder.CENTER,
                TitledBorder.TOP, new Font("Tahoma", Font.BOLD, 24), Color.WHITE));
        this.lblUnidad5.setForeground(Color.BLACK);
        this.lblUnidad5.setFont(new Font("Tahoma", Font.PLAIN, 18));
        this.lblUnidad5.setVerticalAlignment(JLabel.TOP);
        this.lblUnidad5.setForeground(Color.WHITE);
        this.lblUnidad5.setText("<html><br><center><b>Pendiente</b><br><br>"
                + "Esta unidad se encuentra actualmente en "
                + "construcción. Más adelante se verán avances.</center></html>");
        this.lblUnidad5.add(this.btnUnidad5);
        
        //Bóton para regresar al panel principal.
        this.btnRegresar = new JButton();
        this.btnRegresar.setSize(125, 50);
        this.btnRegresar.setLocation(this.getWidth()-150, this.getHeight()-100);
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
        
        //Botón para recorrer (atrás) las unidades.
        this.btnAtras = new JButton();
        this.btnAtras.setSize(100,50);
        this.btnAtras.setLocation(50, this.getHeight()-150);
        this.btnAtras.setBackground(new Color(34,73,162));
        this.btnAtras.setText("Back");
        this.btnAtras.setForeground(Color.WHITE);
        this.btnAtras.setFont(new Font("Tahoma",Font.PLAIN,24));
        this.btnAtras.setBorder(null);
        this.btnAtras.addActionListener((ActionEvent e) -> 
        {
            Thread thread = new Thread(()->
            {
                try
                {
                    for (int i = 0; i < 175; i++)
                    {
                        this.lblUnidad1.setLocation(this.lblUnidad1.getLocation().x + 2, this.lblUnidad1.getLocation().y);
                        this.lblUnidad2.setLocation(this.lblUnidad2.getLocation().x + 2, this.lblUnidad2.getLocation().y);
                        this.lblUnidad3.setLocation(this.lblUnidad3.getLocation().x + 2, this.lblUnidad3.getLocation().y);
                        this.lblUnidad4.setLocation(this.lblUnidad4.getLocation().x + 2, this.lblUnidad4.getLocation().y);
                        this.lblUnidad5.setLocation(this.lblUnidad5.getLocation().x + 2, this.lblUnidad5.getLocation().y);
                       
                        //Nota: Esto se tiene que corregir.
                        Thread.sleep(1);
                    }     
                }
                catch (InterruptedException ex)
                {
                    System.out.println("Houston, tenemos un problema.");
                    System.err.println(ex.toString());
                }
            });
            
            thread.start();
        });
        
        //Botón para recorrer (adelante) las unidades.
        this.btnAdelante = new JButton();
        this.btnAdelante.setSize(100,50);
        this.btnAdelante.setLocation(160, this.getHeight()-150);
        this.btnAdelante.setBackground(new Color(34,73,162));
        this.btnAdelante.setText("Next");
        this.btnAdelante.setForeground(Color.WHITE);
        this.btnAdelante.setFont(new Font("Tahoma",Font.PLAIN,24));
        this.btnAdelante.setBorder(null);
        this.btnAdelante.addActionListener((ActionEvent e) -> 
        {
            Thread thread = new Thread(()->
            {
                try
                {
                    for (int i = 0; i < 175; i++)
                    {
                        this.lblUnidad1.setLocation(this.lblUnidad1.getLocation().x - 2, this.lblUnidad1.getLocation().y);
                        this.lblUnidad2.setLocation(this.lblUnidad2.getLocation().x - 2, this.lblUnidad2.getLocation().y);
                        this.lblUnidad3.setLocation(this.lblUnidad3.getLocation().x - 2, this.lblUnidad3.getLocation().y);
                        this.lblUnidad4.setLocation(this.lblUnidad4.getLocation().x - 2, this.lblUnidad4.getLocation().y);
                        this.lblUnidad5.setLocation(this.lblUnidad5.getLocation().x - 2, this.lblUnidad5.getLocation().y);
                        
                        //Nota: Esto se tiene que corregir.
                        Thread.sleep(1);   
                    }
                }
                catch (InterruptedException ex)
                {
                    System.out.println("Houston, tenemos un problema.");
                    System.err.println(ex.toString());
                }
            });
            
            thread.start();
        });
        
        //Integración de los componentes al panel.
        this.add(this.lblMensaje);
        this.add(this.btnRegresar);
        this.add(this.lblUnidad1);
        this.add(this.lblUnidad2);
        this.add(this.lblUnidad3);
        this.add(this.lblUnidad4);
        this.add(this.lblUnidad5);
        this.add(this.btnAtras);
        this.add(this.btnAdelante);
    }   
}
