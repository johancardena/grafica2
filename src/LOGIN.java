import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LOGIN extends JFrame{

    private JTextField usuarioField;
    private JPasswordField passwordField;
    private JButton ingresar;
    private JLabel Usuario;
    private JLabel Contraseña;
    private JPanel panel1;
    private JLabel mensaje;

    public LOGIN() {
            ingresar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    validarCredenciales();
                }
            });
            setVisible(true);}

        private void validarCredenciales() {
            String usuario = usuarioField.getText().trim();
            String contraseña = new String(passwordField.getPassword()).trim();

            if (usuario.isEmpty() || contraseña.isEmpty()) {
                mensaje.setText("Por favor, complete todos los campos.");
                mensaje.setForeground(Color.RED);
            } else if (usuario.equals("admin") && contraseña.equals("1234")) {
                mensaje.setText("Inicio de sesión exitoso.");
                mensaje.setForeground(Color.GREEN);

            } else {
                mensaje.setText("Usuario o contraseña incorrectos.");
                mensaje.setForeground(Color.RED);
            }
        }

        public static void main(String[] args) {
            JFrame frame=new JFrame("BIENVENIDO");
            frame.setContentPane(new LOGIN().panel1);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800,600);
            frame.setPreferredSize(new Dimension(800,600));
            frame.pack();
            frame.setVisible(true);
        }
    }














