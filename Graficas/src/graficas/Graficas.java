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
public class Graficas extends JFrame {

    /**
     * @param args the command line arguments
     */
    public Graficas() {
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        // TODO code application logic here
        new Graficas();
    }

    @Override
    public void paint(Graphics g) {

        g.drawOval(40, 40, 60, 60);
        g.setColor(Color.green);
        g.drawRect(80, 30, 200, 200);
        g.setColor(Color.BLUE);
        g.fillArc(80, 30, 200, 200, 250, 180);
        g.drawLine(0, 0, 400, 400);
        g.setColor(Color.RED);
        //g.drawLine(0, 400, 400, 0);
//        g.setColor(Color.GREEN);
//        g.fillRect(40, 45, 30, 30);
//        g.fillArc(50, 5, 100, 33, 75, 40);
//        g.fillArc(250, 215, 100, 50, 0, 130);
//        g.setColor(Color.BLUE);
//        g.drawRect(50, 0, 100, 100);
//        g.setColor(Color.WHITE);
//        g.drawLine(0, 200, 400, 200);

    }
}
