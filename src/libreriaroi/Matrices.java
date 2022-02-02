package libreriaroi;

/**
 * @author Roi Martínez
 */

import java.util.Arrays;
import javax.swing.*;

public class Matrices {
    
    public static void crearArray(float[] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el "+(i+1)+" nº que desee meter en el array: "));
        }
    }
    
    public static void mostrarArray(float[] matriz) {
        String msg = "";
        for (int i = 0; i < matriz.length; i++) {
            msg = msg+matriz[i]+" / ";
        }
        JOptionPane.showMessageDialog(null, msg);
    }
    
    public static float buscarElemento(float[] matriz) {
        float elm = Float.parseFloat(JOptionPane.showInputDialog("¿Que elemento desea buscar?"));
        int posicion = -1;
        
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i] == elm) {
                posicion = i;
            }
        }
        return posicion;
    }
    
    public static void ordenarArray(float[] matriz) {
        /*
        float copia;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int e=i+1; e < matriz.length; e++) {
                if (matriz[i] > matriz[e]) {
                    copia = matriz[i];
                    matriz[i] = matriz[e];
                    matriz[e] = copia;
                }
            }
        }
        */
        Arrays.sort(matriz);
    }
    
    public static float[] borrarElemento(float[] matriz) {
        float elemento = Integer.parseInt(JOptionPane.showInputDialog("¿Qué elemento desea borrar?"));
        float [] copia = new float[matriz.length-1];
        boolean encontrado = false;
        
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i] == elemento) {
                float [] rangoFinal = Arrays.copyOfRange(matriz, i+1, matriz.length);
                for (int e = 0; e < i; e++) {
                    copia[e] = matriz[e];
                }
                int cont = 0;
                for (int u = i; u < copia.length; u++) {
                    copia[u] = rangoFinal[cont];
                    cont++;
                }
                encontrado = true;
                break;
            }
        }
        if (encontrado == false) {
            System.out.println( "El elemento no se encuentra en la matriz");
            return matriz;
        } else {
            return copia;
        }
    }
    
    public static float[] añadirElemento(float[] matriz) {
        float elemento = Float.parseFloat(JOptionPane.showInputDialog("Introduzca el elemento que desea añadir"));
        float [] copia = new float[matriz.length+1];
        for (int i = 0; i < matriz.length; i++) {
            copia[i] = matriz[i];
        }
        copia[copia.length-1] = elemento;
        /*
        matriz = Arrays.copyOf(matriz, matriz.length+1);
        matriz[matriz.length-1] = elemento;
        */
        
        return copia;
    }
    
    public static void arrayAleatoriosFloat (float[] matriz, int min, int max) {
        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = Math.round(min+Math.random()*max);
        }
    }
    public static void arrayAleatoriosInt (int[] matriz, int min, int max) {
        for (int i = 0; i < matriz.length; i++) {
            matriz[i] = (int) Math.round(min+Math.random()*max);
        }
    }
}
