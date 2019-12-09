package calculo.unidad1;

import calculo.Panel_Unidades;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.*;

/**
 *Esta clase hereda de JPanel.
 * Su objetivo es ser el panel de la unidad 1 
 * @author rodol
 */
public class Panel_Unidad1 extends JPanel
{
    private final JFrame contenedor;
    private JLabel lblMensaje, lblInstruccion, lblValor, lblLeyenda;
    private JSlider sliderI, sliderJ, sliderK;
    private JButton btnRegresar;
    private Graficacion graficacion;
    
    public Panel_Unidad1(JFrame contenedor)
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
        this.lblMensaje.setLocation(20,0);
        this.lblMensaje.setText("<html><b>¿Qué es un vector?</b><br>"
                + "Un vector en el espacio es cualquier segmento"
                + " orientado que tiene su origen en un punto y "
                + "su extremo en el otro. Una de las formas de "
                + "representarlo es en un espacio tridimensional, "
                + "el cual se representa como i, j y k"
                + "</html>");
        this.lblMensaje.setFont(new Font("Tahoma", Font.PLAIN, 20));
        this.lblMensaje.setForeground(Color.WHITE);
        
        //Label con instrucciones de uso de esta actividad.
        this.lblInstruccion = new JLabel();
        this.lblInstruccion.setSize(400, 90);
        this.lblInstruccion.setLocation(650, 150);
        this.lblInstruccion.setText("<html>Puedes interactuar con el vector. "
                + "Usa los 'sliders' para ir cambiando los valores "
                + "de este y observa la magia  </html>");
        this.lblInstruccion.setFont(new Font("Tahoma", Font.PLAIN, 18));
        this.lblInstruccion.setForeground(Color.WHITE);
        
        //Clase que permite la creación de un espacio para graficar.
        this.graficacion = new Graficacion(600, 600);
        this.graficacion.setLocation(10,150);
        
        //Label que indica el valor de la posición (x, y, z) del vector.
        this.lblValor = new JLabel();
        this.lblValor.setSize(350, 100);
        this.lblValor.setLocation(700, 530);
        this.lblValor.setText("<html><b>Posición actual:</b><br>"
                + "<b>i:</b>0<br>"
                + " <b>j:</b>0<br>"
                + "<b>k:</b>0</html>");
        this.lblValor.setFont(new Font("Arial", Font.PLAIN, 24));
        this.lblValor.setForeground(Color.WHITE);
        
        //Controles para poder interactuar con el espacio de graficación.
        this.sliderJ = new JSlider();
        this.sliderJ.setLocation(700,380);
        this.sliderJ.setSize(300,50);
        this.sliderJ.setMaximum(15);
        this.sliderJ.setMinimum(-15);
        this.sliderJ.setValue(0);
        this.sliderJ.setOpaque(false);
        this.sliderJ.setPaintLabels(true);
        this.sliderJ.setPaintTicks(true);
        this.sliderJ.setPaintTrack(true);
        this.sliderJ.setMajorTickSpacing(30); 
        this.sliderJ.setMinorTickSpacing(1); 
        this.sliderJ.setForeground(Color.WHITE);
        this.sliderJ.addChangeListener((e) ->
        {
            this.graficacion.updateCoordinates(this.sliderJ.getValue(), this.sliderK.getValue(), 
                    this.sliderI.getValue());
            
            this.lblValor.setText("<html><b>Posición actual:</b><br>"
                + "<b>i:</b>"+this.sliderI.getValue()+"<br>"
                + " <b>j:</b>"+this.sliderJ.getValue()+"<br>"
                + "<b>k:</b>"+this.sliderK.getValue()+"</html>");
        });
        
        this.sliderK = new JSlider();
        this.sliderK.setLocation(700,460);
        this.sliderK.setSize(300,50);
        this.sliderK.setMaximum(15);
        this.sliderK.setMinimum(-15);
        this.sliderK.setValue(0);
        this.sliderK.setOpaque(false);
        this.sliderK.setPaintLabels(true);
        this.sliderK.setPaintTicks(true);
        this.sliderK.setPaintTrack(true); 
        this.sliderK.setMajorTickSpacing(30); 
        this.sliderK.setMinorTickSpacing(1); 
        this.sliderK.setForeground(Color.WHITE);
        this.sliderK.addChangeListener((e) ->
        {
            this.graficacion.updateCoordinates(this.sliderJ.getValue(), this.sliderK.getValue(), 
                    this.sliderI.getValue());
            
            this.lblValor.setText("<html><b>Posición actual:</b><br>"
                + "<b>i:</b>"+this.sliderI.getValue()+"<br>"
                + " <b>j:</b>"+this.sliderJ.getValue()+"<br>"
                + "<b>k:</b>"+this.sliderK.getValue()+"</html>");
        });
        
        this.sliderI = new JSlider();
        this.sliderI.setLocation(700,300);
        this.sliderI.setSize(300,50);
        this.sliderI.setMaximum(15);
        this.sliderI.setMinimum(-15);
        this.sliderI.setValue(0);
        this.sliderI.setOpaque(false);
        this.sliderI.setPaintLabels(true);
        this.sliderI.setPaintTicks(true);
        this.sliderI.setPaintTrack(true); 
        this.sliderI.setMajorTickSpacing(30); 
        this.sliderI.setMinorTickSpacing(1); 
        this.sliderI.setForeground(Color.WHITE);
        this.sliderI.addChangeListener((e) ->
        {
            this.graficacion.updateCoordinates(this.sliderJ.getValue(), this.sliderK.getValue(),
                    this.sliderI.getValue());
                        
            this.lblValor.setText("<html><b>Posición actual:</b><br>"
                + "<b>i:</b>"+this.sliderI.getValue()+"<br>"
                + " <b>j:</b>"+this.sliderJ.getValue()+"<br>"
                + "<b>k:</b>"+this.sliderK.getValue()+"</html>");
        });
        
        
        //JLabel que muestra la leyenda de las coordenadas
        this.lblLeyenda = new JLabel();
        this.lblLeyenda.setSize(50, 210);
        this.lblLeyenda.setLocation(650, 280);
        this.lblLeyenda.setText("<html><b>i</b><br><br><b>j</b><br><br><b>k</b></html>");
        this.lblLeyenda.setFont(new Font("Tahoma", Font.PLAIN, 36));
        this.lblLeyenda.setForeground(Color.WHITE);
        
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
             contenedor.remove(Panel_Unidad1.this);
             contenedor.add(panel);
             contenedor.revalidate();
             contenedor.repaint();
        });

        //Integración de los componentes al panel.
        this.add(this.lblMensaje);
        this.add(this.lblInstruccion);
        this.add(this.graficacion);
        this.add(sliderJ);
        this.add(this.sliderK);
        this.add(this.sliderI);
        this.add(this.lblValor);
        this.add(this.lblLeyenda);
        this.add(this.btnRegresar);
    }
}
