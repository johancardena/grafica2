import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LOGIN extends JFrame{

    private JTextField usuarioField;
    private JPanel panel1;
    private JPasswordField passwordField;
    private JButton ingresar;
    private JLabel Usuario;
    private JLabel Contraseña;
    private JLabel mensaje;

    public LOGIN() {

        setTitle("Pantalla de Login");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // Sin layout para posiciones personalizadas

        // Crear componentes
        JLabel usuarioLabel = new JLabel("Usuario:");
        usuarioField = new JTextField();
        JLabel passwordLabel = new JLabel("Contraseña:");
        passwordField = new JPasswordField();
        JButton validar = new JButton("Ingresar");
        mensaje = new JLabel("", SwingConstants.CENTER);

        // Establecer posiciones y tamaños
        usuarioLabel.setBounds(50, 50, 100, 30);
        usuarioField.setBounds(150, 50, 180, 30);
        passwordLabel.setBounds(50, 100, 100, 30);
        passwordField.setBounds(150, 100, 180, 30);
        validar.setBounds(150, 150, 100, 30);
        mensaje.setBounds(50, 200, 300, 30);

        // Cambiar colores
        usuarioLabel.setForeground(Color.BLUE);
        passwordLabel.setForeground(Color.BLUE);
        usuarioField.setBackground(Color.CYAN);
        passwordField.setBackground(Color.LIGHT_GRAY);
        validar.setBackground(Color.GREEN);
        validar.setForeground(Color.WHITE);
        mensaje.setForeground(Color.RED);

        // Agregar funcionalidad al botón
        validar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = usuarioField.getText();
                String password = new String(passwordField.getPassword());

                if (usuario.equals("APELLIDO") && password.equals("APELLIDO123")) {
                    mensaje.setText("Acceso correcto");
                    mensaje.setForeground(Color.GREEN);
                } else {
                    mensaje.setText("Usuario o contraseña incorrectos");
                    mensaje.setForeground(Color.RED);
                }
            }
        });

        add(usuarioLabel);
        add(usuarioField);
        add(passwordLabel);
        add(passwordField);
        add(validar);
        add(mensaje);

        setVisible(true);
    }


}


