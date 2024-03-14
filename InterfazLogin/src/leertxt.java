import javax.swing.JOptionPane;
import java.io.*;

public class leertxt {

    public static String leer(String nombreArchivo) {
        String linea="";
        try {
            FileReader fileReader = new FileReader(nombreArchivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String temp;
            while ((temp = bufferedReader.readLine()) != null) {
                linea += temp + ";";
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error en lectura");
        }
        return linea;
    }
}