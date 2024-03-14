import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.*;

public class inicioAdmin extends JFrame {
    private JButton botonRegresar;
    private JLabel labelMensaje;
    private InterfazLogin interfazLogin;

    public inicioAdmin(String mensaje, String nombreUsuario, InterfazLogin interfazLogin) {
        super("Mensaje");
        setSize(400, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        this.interfazLogin = interfazLogin;

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        labelMensaje = new JLabel(mensaje, SwingConstants.CENTER);
        panel.add(labelMensaje, BorderLayout.CENTER);

        if (!nombreUsuario.isEmpty()) {
            JLabel labelBienvenida = new JLabel("Bienvenido Admin " + nombreUsuario, SwingConstants.CENTER);
            panel.add(labelBienvenida, BorderLayout.NORTH);
        }

        botonRegresar = new JButton("Regresar");
        botonRegresar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                interfazLogin.usuarioField.setText("");
                interfazLogin.contraseñaField.setText("");

                dispose();
                if (interfazLogin != null) {
                    interfazLogin.setVisible(true);
                }
            }
        });
        panel.add(botonRegresar, BorderLayout.SOUTH);

        add(panel);
    }

    static void saludar(String usuario) {
        String ingreso = LocalDate.now() + "-" + LocalTime.now() + "-" + usuario;
        escribirTxt.escribir(ingreso);
    }
}