
package actividadrepasoa_1sep2022;

import javax.swing.JOptionPane;


public class ActividadRepasoA_1Sep2022 {

    
    public static void main(String[] args) {
        
    }
    
    public static void potencia () {
        double a, b, c;
        
        for (int i = 0; i < 10; i++) {
          
            a = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite numero"));
            b = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite numero"));
            c = Math.pow(a, b);
            System.out.println("La potencia = "+c);
            JOptionPane.showMessageDialog(null, "La potencia = "+c);
            
            if (c > 100) {
                System.out.println("Potencia > 100");
                JOptionPane.showMessageDialog(null, "Potencia > 100");
            } else {
                if (c < 100) {
                    System.out.println("Potencia < 100");
                    JOptionPane.showMessageDialog(null, "Potencia < 100");
                } else {
                    System.out.println("Potencia = 100");
                    JOptionPane.showMessageDialog(null, "Potencia = 100");
                }
            }
        
        }
    }
    
}
