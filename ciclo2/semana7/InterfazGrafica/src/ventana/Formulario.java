package ventana;
import java.awt.event.*;
import javax.swing.*;
public class Formulario extends JFrame implements ActionListener {
    // Crearlo directamente con programacion o usando el Gui de java
    private JTextField texto1;
    private JLabel label1;
    private JButton boton1;
    // Constructor
    public Formulario() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        label1 = new JLabel("Mensaje: ");
        label1.setBounds(10, 60, 100, 60);
        add(label1);
        
        texto1 = new JTextField();
        texto1.setBounds(80, 16, 190, 20);
        add(texto1);
        
        boton1 = new JButton("Mostrar");
        boton1.setBounds(10, 60, 100, 30);
        add(boton1);
        boton1.addActionListener(this);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton1) {
            String cadena = texto1.getText();
            JOptionPane.showMessageDialog(null, cadena);
        }
        
    }
    public static void main(String[] args) {
        Formulario formulario = new Formulario();
        formulario.setBounds(0,0,300,150);
        formulario.setVisible(true);
        formulario.setLocationRelativeTo(null);
    }
}
    
