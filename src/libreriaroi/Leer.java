package libreriaroi;

import javax.swing.JOptionPane;

/**
 * @author Roi Martínez
 */ 

public class Leer {
    public static float inFloat(String mensaje) {
        return Float.parseFloat(JOptionPane.showInputDialog(mensaje));
    }
    public static int inInteger(String mensaje) {
        return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
    }
    public static double inDouble(String mensaje) {
        return Double.parseDouble(JOptionPane.showInputDialog(mensaje));
    }
    public static short inShort(String mensaje) {
        return Short.parseShort(JOptionPane.showInputDialog(mensaje));
    }
    public static long inLong(String mensaje) {
        return Long.parseLong(JOptionPane.showInputDialog(mensaje));
    }
    public static String inString(String mensaje) {
        return JOptionPane.showInputDialog(mensaje);
    }
}
