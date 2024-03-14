import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InterfazLogin extends JFrame implements ActionListener {
    public JTextField usuarioField;
    public JPasswordField contraseñaField;
    private JButton botonLogin;

    public InterfazLogin() {
        setTitle("Inicio de Sesión");
        setSize(800, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panelPrincipal = new JPanel(null);


        JLabel usuarioLabel = new JLabel("Usuario:");
        usuarioLabel.setBounds(50, 50, 100, 30);
        panelPrincipal.add(usuarioLabel);

        usuarioField = new JTextField();
        usuarioField.setBounds(50, 90, 200, 30);
        panelPrincipal.add(usuarioField);

        JLabel contraseñaLabel = new JLabel("Contraseña:");
        contraseñaLabel.setBounds(50, 130, 100, 30);
        panelPrincipal.add(contraseñaLabel);

        contraseñaField = new JPasswordField();
        contraseñaField.setBounds(50, 170, 200, 30);
        panelPrincipal.add(contraseñaField);


        botonLogin = new JButton("Iniciar Sesión");
        botonLogin.addActionListener(this);
        botonLogin.setBounds(50, 210, 150, 30);
        panelPrincipal.add(botonLogin);


        JLabel imagenLabel = new JLabel();
        ImageIcon imagenIcono = new ImageIcon("foto2.jpg");
        imagenLabel.setIcon(imagenIcono);
        imagenLabel.setBounds(300, 0, 500, 400);
        panelPrincipal.add(imagenLabel);

        add(panelPrincipal);
    }

    public void actionPerformed(ActionEvent e) {
        String usuario = usuarioField.getText();
        String contraseña = new String(contraseñaField.getPassword());

        if (Usuarios.validarUsuario(usuario, contraseña)) {
            inicioAdmin ventanaMensaje = new inicioAdmin("Inicio de sesión exitoso", usuario,this);
            ventanaMensaje.setVisible(true);
            inicioAdmin.saludar(usuario);
            this.dispose();
        } else {
            inicioAdmin ventanaMensaje = new inicioAdmin("Usuario o contraseña incorrectos", "",this);
            ventanaMensaje.setVisible(true);
        }
    }

    public static void main(String[] args) {
        InterfazLogin interfaz = new InterfazLogin();
        interfaz.setVisible(true);
    }
}