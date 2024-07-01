

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main{

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MarcoConDibujos3 mimarco= new MarcoConDibujos3();
        mimarco.setVisible(true);
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
class MarcoConDibujos3 extends JFrame{
    public MarcoConDibujos3 () {
        setTitle("Prueba con dibujos");
        setSize(400,400);
        setLocation(400,400);

        LaminaConFiguras3 milamina = new LaminaConFiguras3();
        add(milamina);
//        setContentPane(milamina);
    }
}
class LaminaConFiguras3 extends JPanel{

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Prueba color", 100, 100);
        Graphics2D grafico = (Graphics2D) g;
        Color colorBackGround= new Color(34,34,34,34);
        grafico.setPaint(colorBackGround);
    }
}
//Graphics2D tiene el metodo setPaint(color);
/*
 * Color la clase tiene 4 colores principales los cuales se puede jugar blue, red, green, yellow
 * Tambien tenemos metodos para enviar estos colores por ejemplo en JPanel tenemos los metodos setBackground y setForeground(color) los hereda de JComponent
 *
 */
