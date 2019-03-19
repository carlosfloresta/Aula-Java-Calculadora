
package calculadora;

import javax.swing.JOptionPane;


public class Resposta {
    
    
    public static void resposta(double resul, String calculo, String simbolo, double v1,double v2){
        
        JOptionPane.showMessageDialog(null," A " + calculo + " de " + v1 + simbolo + v2 + " = " + resul);
        
    }
    
}
