import javax.swing.JOptionPane;
import java.io.*;

public class escribirTxt {

    public static void escribir(String ingreso) {
        String nombreArchivo = "ingresos.log";
        try {
            FileWriter fileWriter = new FileWriter(nombreArchivo, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(ingreso);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error en escritura");
        }
    }
}