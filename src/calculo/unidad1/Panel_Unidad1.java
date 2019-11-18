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
    private JSlider sliderX, sliderY, sliderZ;
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
                + "el cual está conformado por 3 ejes, siendo X "
                + "(ancho), Y (altura) y Z (profundidad). "
                + "A continuación, se muestra un ejemplo interactivo."
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
                + "<b>X:</b>0<br>"
                + " <b>Y:</b>0<br>"
                + "<b>Z:</b>0</html>");
        this.lblValor.setFont(new Font("Arial", Font.PLAIN, 24));
        this.lblValor.setForeground(Color.WHITE);
        
        //Controles para poder interactuar con el espacio de graficación.
        this.sliderX = new JSlider();
        this.sliderX.setLocation(700,300);
        this.sliderX.setSize(300,50);
        this.sliderX.setMaximum(15);
        this.sliderX.setMinimum(-15);
        this.sliderX.setValue(0);
        this.sliderX.setOpaque(false);
        this.sliderX.setPaintLabels(true);
        this.sliderX.setPaintTicks(true);
        this.sliderX.setPaintTrack(true);
        this.sliderX.setMajorTickSpacing(30); 
        this.sliderX.setMinorTickSpacing(1); 
        this.sliderX.setForeground(Color.WHITE);
        this.sliderX.addChangeListener((e) ->
        {
            this.graficacion.updateCoordinates(this.sliderX.getValue(), this.sliderY.getValue(), 
                    this.sliderZ.getValue());
            
            this.lblValor.setText("<html><b>Posición actual:</b><br>"
                + "<b>X:</b>"+this.sliderX.getValue()+"<br>"
                + " <b>Y:</b>"+this.sliderY.getValue()+"<br>"
                + "<b>Z:</b>"+this.sliderZ.getValue()+"</html>");
        });
        
        this.sliderY = new JSlider();
        this.sliderY.setLocation(700,380);
        this.sliderY.setSize(300,50);
        this.sliderY.setMaximum(15);
        this.sliderY.setMinimum(-15);
        this.sliderY.setValue(0);
        this.sliderY.setOpaque(false);
        this.sliderY.setPaintLabels(true);
        this.sliderY.setPaintTicks(true);
        this.sliderY.setPaintTrack(true); 
        this.sliderY.setMajorTickSpacing(30); 
        this.sliderY.setMinorTickSpacing(1); 
        this.sliderY.setForeground(Color.WHITE);
        this.sliderY.addChangeListener((e) ->
        {
            this.graficacion.updateCoordinates(this.sliderX.getValue(), this.sliderY.getValue(), 
                    this.sliderZ.getValue());
            
            this.lblValor.setText("<html><b>Posición actual:</b><br>"
                + "<b>X:</b>"+this.sliderX.getValue()+"<br>"
                + " <b>Y:</b>"+this.sliderY.getValue()+"<br>"
                + "<b>Z:</b>"+this.sliderZ.getValue()+"</html>");
        });
        
        this.sliderZ = new JSlider();
        this.sliderZ.setLocation(700,460);
        this.sliderZ.setSize(300,50);
        this.sliderZ.setMaximum(15);
        this.sliderZ.setMinimum(-15);
        this.sliderZ.setValue(0);
        this.sliderZ.setOpaque(false);
        this.sliderZ.setPaintLabels(true);
        this.sliderZ.setPaintTicks(true);
        this.sliderZ.setPaintTrack(true); 
        this.sliderZ.setMajorTickSpacing(30); 
        this.sliderZ.setMinorTickSpacing(1); 
        this.sliderZ.setForeground(Color.WHITE);
        this.sliderZ.addChangeListener((e) ->
        {
            this.graficacion.updateCoordinates(this.sliderX.getValue(), this.sliderY.getValue(),
                    this.sliderZ.getValue());
                        
            this.lblValor.setText("<html><b>Posición actual:</b><br>"
                + "<b>X:</b>"+this.sliderX.getValue()+"<br>"
                + " <b>Y:</b>"+this.sliderY.getValue()+"<br>"
                + "<b>Z:</b>"+this.sliderZ.getValue()+"</html>");
        });
        
        
        //JLabel que muestra la leyenda de las coordenadas
        this.lblLeyenda = new JLabel();
        this.lblLeyenda.setSize(50, 210);
        this.lblLeyenda.setLocation(650, 280);
        this.lblLeyenda.setText("<html><b>X</b><br><br><b>Y</b><br><br><b>Z</b></html>");
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
        this.add(sliderX);
        this.add(this.sliderY);
        this.add(this.sliderZ);
        this.add(this.lblValor);
        this.add(this.lblLeyenda);
        this.add(this.btnRegresar);
    }
}
