package Cuentador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    private JMenuBar barramenu;
    private JCheckBoxMenuItem check;
    private JMenu menu,sm,menu2;
    private JMenuItem m1,sm1,m2;
    private JPanel panel;
    private JButton boton1;
    private JLabel etiqueta1,etiqueta2,etiqueta3,etiqueta4,etiqueta5,etiqueta6,etiqueta7,etiqueta8,etiqueta9,etiqueta10,etiqueta11,etiqueta12;
    private int contador=1;
    public Ventana(){
        setSize(550,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Cuentaclicks desmotivador");
        setResizable(false);
        iniciarComponentes();

    }
    private void mostrarPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }
    private void iniciarComponentes(){
        mostrarPanel();
        mostrarEtiqueta();
        mostrarBoton();
        mostrarMenuBar();
    }

    private void mostrarMenuBar(){
        barramenu = new JMenuBar();
        barramenu.setBounds(0,0,550,20);
        menu2 = new JMenu("Opciones");
        menu = new JMenu("Menú");
        sm = new JMenu("Reset");
        sm1 = new JMenuItem("Resetea");
        sm.add(sm1);
        m1 = new JMenuItem("Acerca de");
        m2 = new JMenuItem("Salir");
        check = new JCheckBoxMenuItem("Modo desmotivante");
        menu2.add(check);
        menu.add(m1);
        menu.add(sm);
        menu.add(m2);

        ActionListener mostrar = e -> {
            etiqueta2.setText("");
            etiqueta3.setText("");
            etiqueta4.setText("");
            etiqueta5.setText("");
            etiqueta6.setText("");
            etiqueta7.setText("");
            etiqueta8.setText("");
            etiqueta9.setText("");
            etiqueta10.setText("");
            etiqueta11.setText("");
            etiqueta12.setText("");
        };
        check.addActionListener(mostrar);

        ActionListener reset = e -> {
            contador = 1;
            etiqueta1.setText("Haz click en el botón!");
            etiqueta2.setText("");
            etiqueta3.setText("");
            etiqueta4.setText("");
            etiqueta5.setText("");
            etiqueta6.setText("");
            etiqueta7.setText("");
            etiqueta8.setText("");
            etiqueta9.setText("");
            etiqueta10.setText("");
            etiqueta11.setText("");
            etiqueta12.setText("");
        };
        sm1.addActionListener(reset);

        ActionListener salir = e -> System.exit(0);
        m2.addActionListener(salir);

        ActionListener acercade = e -> JOptionPane.showMessageDialog(null,"Putozeros, 2022, todos los derechos reservados.\nNo me copies, hijoputa");
        m1.addActionListener(acercade);
        barramenu.add(menu);
        barramenu.add(menu2);
        panel.add(barramenu);

    }
    private void mostrarEtiqueta(){
        etiqueta1 = new JLabel();
        etiqueta1.setText("Haz click en el botón!");
        etiqueta1.setBounds(0,30,550,30);
        etiqueta1.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta1.setFont(new Font("Arial", Font.BOLD,30));
        panel.add(etiqueta1);


        etiqueta2 = new JLabel();
        etiqueta2.setText(" ");
        etiqueta2.setBounds(0,80,550,30);
        etiqueta2.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta2.setFont(new Font("Arial",Font.BOLD,30));
        panel.add(etiqueta2);

        etiqueta3 = new JLabel();
        etiqueta3.setText(" ");
        etiqueta3.setBounds(0,120,550,30);
        etiqueta3.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta3.setFont(new Font("Arial",Font.BOLD,30));
        panel.add(etiqueta3);

        etiqueta4 = new JLabel();
        etiqueta4.setText(" ");
        etiqueta4.setBounds(0,160,550,30);
        etiqueta4.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta4.setFont(new Font("Arial",Font.BOLD,30));
        panel.add(etiqueta4);

        etiqueta5 = new JLabel();
        etiqueta5.setText(" ");
        etiqueta5.setBounds(0,200,550,30);
        etiqueta5.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta5.setFont(new Font("Arial",Font.BOLD,30));
        panel.add(etiqueta5);

        etiqueta6 = new JLabel();
        etiqueta6.setText(" ");
        etiqueta6.setBounds(0,240,550,30);
        etiqueta6.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta6.setFont(new Font("Arial",Font.BOLD,30));
        panel.add(etiqueta6);

        etiqueta7 = new JLabel();
        etiqueta7.setText("");
        etiqueta7.setBounds(0,360,550,30);
        etiqueta7.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta7.setFont(new Font("Arial",Font.BOLD,30));
        panel.add(etiqueta7);

        etiqueta8 = new JLabel();
        etiqueta8.setText("");
        etiqueta8.setBounds(0,400,550,30);
        etiqueta8.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta8.setFont(new Font("Arial",Font.BOLD,30));
        panel.add(etiqueta8);

        etiqueta9 = new JLabel();
        etiqueta9.setText("");
        etiqueta9.setBounds(0,10,500,200);
        etiqueta9.setFont(new Font("Arial",Font.PLAIN,20));
        etiqueta9.setForeground(Color.RED);
        panel.add(etiqueta9);

        etiqueta10 = new JLabel();
        etiqueta10.setText("");
        etiqueta10.setBounds(0,260,500,30);
        etiqueta10.setHorizontalAlignment(SwingConstants.RIGHT);
        etiqueta10.setFont(new Font("Arial",Font.PLAIN,20));
        etiqueta10.setForeground(Color.RED);
        panel.add(etiqueta10);

        etiqueta11 = new JLabel();
        etiqueta11.setText("");
        etiqueta11.setBounds(0,140,500,30);
        etiqueta11.setHorizontalAlignment(SwingConstants.RIGHT);
        etiqueta11.setFont(new Font("Arial",Font.PLAIN,20));
        etiqueta11.setForeground(Color.RED);
        panel.add(etiqueta11);

        etiqueta12 = new JLabel();
        etiqueta12.setText("");
        etiqueta12.setBounds(0,380,500,30);
        etiqueta12.setHorizontalAlignment(SwingConstants.LEFT);
        etiqueta12.setFont(new Font("Arial",Font.PLAIN,20));
        etiqueta12.setForeground(Color.RED);
        panel.add(etiqueta12);
    }
    private void mostrarBoton(){
        boton1 = new JButton();
        boton1.setText("Pulsa aquí!");
        boton1.setBounds(160,300,200,50);
        boton1.setFont(new Font("Arial", Font.BOLD,25));
        panel.add(boton1);
        noInsultes();
    }

    private void noInsultes(){
        ActionListener eventoAccion = e -> {
            if(contador==1){
                etiqueta1.setText("Botón pulsado 1 vez.");
            }
            if(contador>=2){
                etiqueta1.setText("Botón pulsado "+contador+" veces.");
            }
            if(check.getState()){
                if(contador>=5){
                    etiqueta2.setText("Te aburres.");
                }
                if(contador>=15){
                    etiqueta3.setText("Te aburres mucho.");
                }
                if(contador>=25){
                    etiqueta4.setText("Te aburres demasiado.");
                }
                if(contador>=35){
                    etiqueta5.setText("Buscate un trabajo...");
                }
                if(contador>=45){
                    etiqueta6.setText("Vete ya, coño!");
                }
                if(contador>=55){
                    etiqueta7.setText("Estás tirando tu vida");
                }
                if(contador>=65){
                    etiqueta8.setText("No sirves para nada más?");
                }
                if(contador>=75){
                    etiqueta9.setText("Que desperdicio de oxigeno eres.");
                }
                if(contador>=85){
                    etiqueta10.setText("Que decepción debes ser para tus padres.");
                }
                if(contador>=95){
                    etiqueta11.setText("Sobras en este mundo.");
                }
                if(contador>=105){
                    etiqueta12.setText("Pobre e infeliz infraser.");
                }
            }
            contador++;
        };
        boton1.addActionListener(eventoAccion);
    }
    public static void main(String[] args) {
        Ventana v1 = new Ventana();
        v1.setVisible(true);
    }
}