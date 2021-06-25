/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficas;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author roberth
 */
public class Grafica extends JFrame {

    public static void main(String[] args) {
        new Grafica();
    }

    public Grafica() {
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    @Override
    public void paint(Graphics g) {
        g.drawOval(40, 40, 30, 5);
        g.setColor(Color.GREEN);

        g.drawLine(0, 400, 400, 0);
        
        g.fillRect(40, 45, 50, 50);
        g.fillArc(50, 5, 100, 33, 75, 40);
        g.setColor(Color.BLUE);
        g.drawRect(50, 0, 100, 100);

    }

}
