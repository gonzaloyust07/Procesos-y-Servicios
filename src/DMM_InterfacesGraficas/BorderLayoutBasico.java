package DMM_InterfacesGraficas;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutBasico extends JFrame {

    //Definir los paneles que van a ir en esta ventana
    //Por el momento voy a definir unos paneles vacios
    //y luego colocare en ellos unas etiquetas indicando el nombre

    //Añadir una imagen como icono:
    //JButton boton1 = new JButton(new ImageIcon(getClass().getResource));

    static JPanel panelNorte = new JPanel();
    JButton boton1 = new JButton("Boton 1");
    JButton boton2 = new JButton("Boton 2");
    JButton boton3 = new JButton("Boton 3");
    static JPanel panelCentro = new JPanel();
    static JLabel lblCentro = new JLabel("Centro");
    static JPanel panelSur = new JPanel();
    static JLabel lblSur = new JLabel("Sur");
    static JPanel panelEste = new JPanel();
    static JLabel lblEste = new JLabel("Este");
    static JPanel panelOeste = new JPanel();
    static JLabel lblOeste = new JLabel("Oeste");

    Font fuente = new Font("Arial", Font.BOLD, 45);

        //Creamos un constructor
        public BorderLayoutBasico(){
            //Normalmente por limpieza de codigo, se crea un metodo que inicia los componentes
            initUI(); //Iniciar componentes, initGUI, ...
        }

    public void initUI(){
        //Voy a añadir la fuente a estas etiquetas

        lblCentro.setFont(fuente);
        lblSur.setForeground(Color.CYAN);

        //Voy a añadir las etiquetas directamente a los paneles correspondientes
        //Al panel de norte le estoy agregando botones
        //Pero los voy a poner alineados a la izquierda y un poquito mas de espacio entre ellos
        FlowLayout filaLayout = new FlowLayout(FlowLayout.LEFT, 10, 10);
        panelNorte.setLayout(filaLayout);//al panel del norte le aplicamos dicho layout fila
        panelNorte.add(boton1);
        panelNorte.add(boton2);
        panelNorte.add(boton3);


        panelCentro.add(lblCentro);
        panelCentro.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
        panelSur.add(lblSur);
        panelEste.add(lblEste);
        panelOeste.add(lblOeste);

        //Lo unico que me queda seria agregar dichospaneles a la zona que yo quiero de esta ventana
        this.add(panelNorte, BorderLayout.NORTH);
        this.add(panelCentro, BorderLayout.CENTER);
        this.add(panelSur, BorderLayout.SOUTH);
        this.add(panelEste, BorderLayout.EAST);
        this.add(panelOeste, BorderLayout.WEST);
    }

    public static void main(String[] args){
        BorderLayoutBasico ventana = new BorderLayoutBasico();
        ventana.setState(JFrame.MAXIMIZED_BOTH); //Con esto no es necesario ponerle un tamaño ya que lo maximizapor defecto

        ventana.setTitle("Mi primer proyecto de ventanas");
        ventana.setVisible(true);

    }

}
