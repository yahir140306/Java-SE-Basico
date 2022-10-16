import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;
public class JuanchisTriangulo {
    public static void main(String[] args) {
            JOptionPane.showMessageDialog(null, " Bienvenido :)", "Hecho Por: Yahir , Zury , Evelyn", JOptionPane.INFORMATION_MESSAGE);
            for (;;){
                String a = JOptionPane.showInputDialog( null, " Que Deseas hacer: " + "\n 1.- Sacar La Hipotenusa. " +
            "\n 2.- Sacar El Cateto. " , "Solo Ingrese 1 o 2 Por Favor :)");
            int opcion = Integer.parseInt(a);
            switch (opcion) {
                case 1:
                    String cA = JOptionPane.showInputDialog( "Introduce un cateto: ");
                    String cB =  JOptionPane.showInputDialog("Introduce otro cateto: ");
                    double catetoA = Integer.parseInt(cA);
                    double catetoB = Integer.parseInt(cB);
/********************************************************Formula Para Sacar La Hipotenusa********************************************************/
                    double H = Math.sqrt( Math.pow(catetoA, 2) + Math.pow(catetoB, 2));
/***********************************************************************************************************************************************/
                    JOptionPane.showMessageDialog(null, " La Hipotenusa es: " + H ," Yahir, Zury , Evelyn" ,JOptionPane.PLAIN_MESSAGE);
                break;
                case 2:
                    String h = JOptionPane.showInputDialog( "Introduce la hipotenusa: ");
                    String cX = JOptionPane.showInputDialog( "Introduce el cateto: ");
                    double hipotenusa = Integer.parseInt(h);
                    double CatetoX = Integer.parseInt(cX);
/*******************************************************Formula Para Sacar Un Cateto*************************************************************/
                    double CatetoY = Math.sqrt( Math.pow(hipotenusa,2) + Math.pow(CatetoX, 2));
/************************************************************************************************************************************************/
                    JOptionPane.showMessageDialog(null, " El cateto es: " + CatetoY, " Juanchis , Evelyn , Zury", JOptionPane.PLAIN_MESSAGE);
                break;
                default:
                    JOptionPane.showMessageDialog( null, "Error Intentalo De Nuevo Por Favor.");
            }
        }
    }
}
