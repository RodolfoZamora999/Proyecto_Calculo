package calculo.unidad3;

import calculo.Panel_Unidades;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.*;

/**
 *Esta clase hereda de JPanel.
 * Su objetivo es ser el panel de la unidad 2 
 * @author rodol
 */
public class Panel_Unidad3 extends JPanel
{
    private final JFrame contenedor;
    private JLabel lblMensaje, lblV0, lblAngulo, lblG, lblH, component;
    private JTextField txtV0, txtAngulo, txtG, txtH;
    private JButton btnRegresar, btnAnimar;
    private EspacioSimulado espacioSimulado;
    private Simulacion simulacion;
    
    public Panel_Unidad3(JFrame contenedor) 
    {
        super();
        this.contenedor = contenedor;
        initComponents();
    }
    
    /**
     * Inicializa los componentes necesarios para la clase.
     */
    private void initComponents()
    {
        //Propiedades del panel.
        this.setBackground(new Color(40, 40, 40));
        this.setLocation(0,0);
        this.setSize(1100,800);
        this.setLayout(null);
        
        //Label con una breve descripción de la actividad.
        this.lblMensaje = new JLabel();
        this.lblMensaje.setSize(1050,150);
        this.lblMensaje.setLocation(20,-30);
        this.lblMensaje.setText("<html><b>Simulación de un cohete</b><br>"
                +"En esta sección se desarrollara la simulación de la trayectoria de un cohete."
                + "Espero que esto funcione.... "
                + "</html>");
        this.lblMensaje.setFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 20));
        this.lblMensaje.setForeground(Color.WHITE);
        
        //Creación del espacio simulado.
        this.espacioSimulado = new EspacioSimulado();
        this.espacioSimulado.setSize(1050, 600);
        this.espacioSimulado.setLocation(10, 80);
        this.espacioSimulado.addMouseMotionListener(new MouseMotionAdapter() 
        {
            @Override
            public void mouseDragged(MouseEvent e)
            {
                super.mouseDragged(e);
                component.setLocation(e.getPoint().x, component.getLocation().y);
            }
        });
        
        //Label para la velocidad inicial
        this.lblV0 = new JLabel();
        this.lblV0.setSize(60, 30);
        this.lblV0.setLocation(5, 700);
        this.lblV0.setText("Velocidad:");
        this.lblV0.setFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 12));
        this.lblV0.setForeground(Color.WHITE);
        
        //TextBox para la velocidad inicial
        this.txtV0 = new JTextField();
        this.txtV0.setSize(50, 30);
        this.txtV0.setLocation(70, 700);
        
        //Label para el ángulo.
        this.lblAngulo = new JLabel();
        this.lblAngulo.setSize(60, 30);
        this.lblAngulo.setLocation(130, 700);
        this.lblAngulo.setText("Ángulo:");
        this.lblAngulo.setFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 12));
        this.lblAngulo.setForeground(Color.WHITE);
        
        //TextBox para el ángulo.
        this.txtAngulo = new JTextField();
        this.txtAngulo.setSize(50, 30);
        this.txtAngulo.setLocation(185, 700);
        
        //Label para la gravedad.
        this.lblG = new JLabel();
        this.lblG.setSize(60, 30);
        this.lblG.setLocation(245, 700);
        this.lblG.setText("Gravedad:");
        this.lblG.setFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 12));
        this.lblG.setForeground(Color.WHITE);
        
        //TextBox para la gravedad.
        this.txtG = new JTextField();
        this.txtG.setSize(50, 30);
        this.txtG.setLocation(310, 700);
        
        //Label para la altura.
        this.lblH = new JLabel();
        this.lblH.setSize(60, 30);
        this.lblH.setLocation(380, 700);
        this.lblH.setText("Altura:");
        this.lblH.setFont(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 12));
        this.lblH.setForeground(Color.WHITE);
        
        //TextBox para la altura.
        this.txtH = new JTextField();
        this.txtH.setSize(50, 30);
        this.txtH.setLocation(425, 700);
        
        //Componente que se animara
        this.component = new JLabel();
        this.component.setBackground(Color.BLUE);
        this.component.setSize(20, 20);
        this.component.setLocation(10, (this.espacioSimulado.getSize().height - this.component.getHeight()));
        this.component.setOpaque(true);
        this.espacioSimulado.add(this.component);
        
        //Botón para iniciar con la animación
        this.btnAnimar = new JButton();
        this.btnAnimar.setSize(60, 30);
        this.btnAnimar.setLocation(490, 700);
        this.btnAnimar.setText("Animar");
        this.btnAnimar.setForeground(Color.WHITE);
        this.btnAnimar.setFont(new Font("Tahoma",Font.PLAIN, 12));
        this.btnAnimar.setBorder(null);
        this.btnAnimar.setBackground(new Color(0, 180, 0));
        this.btnAnimar.addActionListener((ActionEvent e) -> 
        {
            Thread thread = new Thread(()->
            {
                try 
                {
                    //Objeto que se encargara de la animación
                    this.simulacion = new Simulacion(this.espacioSimulado, this.component,
                            Double.parseDouble(this.txtV0.getText()), Double.parseDouble(this.txtAngulo.getText()),
                            Double.parseDouble(this.txtH.getText()), Double.parseDouble(this.txtG.getText()));
                    
                    this.simulacion.iniciarSimulacion();
                    
                } catch (InterruptedException | NumberFormatException ex)
                {
                    System.out.println("Houston, tenemos un problema");
                    System.err.println(ex.toString());
                }
            });
            
            thread.start();
        });
        
        //Botón que tienen como acción regresar al panel anterior.
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
             Panel_Unidades panel = new Panel_Unidades(contenedor);
             contenedor.remove(Panel_Unidad3.this);
             contenedor.add(panel);
             contenedor.revalidate();
             contenedor.repaint();
        });
        
        //Integración de de los componentes al panel.
        this.add(this.lblMensaje);
        this.add(this.espacioSimulado);
        this.add(this.lblV0);
        this.add(this.txtV0);
        this.add(this.lblAngulo);
        this.add(this.txtAngulo);
        this.add(this.lblG);
        this.add(this.txtG);
        this.add(this.lblH);
        this.add(this.txtH);
        this.add(this.btnAnimar);
        this.add(this.btnRegresar);
    }
    
}
