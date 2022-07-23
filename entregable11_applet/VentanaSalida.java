package entregable11_applet;
import javax.swing.JFrame;
import java.awt.Color;
public class VentanaSalida {
    public static void main(String[]args){
        
        Entregable11_Applet entregable11_applet = new Entregable11_Applet();
        JFrame apli = new JFrame("Ventana de Dibujo");
        apli.setVisible(true);
        apli.setSize(500,500);
        apli.setLocationRelativeTo(null);
        apli.setBackground(Color.WHITE);
        apli.add(entregable11_applet);
        apli.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
    

