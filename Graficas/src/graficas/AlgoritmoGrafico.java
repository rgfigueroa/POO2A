package graficas;

import java.awt.*;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author roberth
 */
public class AlgoritmoGrafico extends JFrame {

    public static void main(String[] args) {
        new AlgoritmoGrafico();
    }

    public AlgoritmoGrafico() {
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    @Override
    public void paint(Graphics g) {
        g.drawOval(80, 30, 200, 200);
        g.drawRect(80, 30, 200, 200);
        g.setColor(Color.GREEN);
        g.fillOval(80, 30, 200, 200);
        g.setColor(Color.RED);
        g.fillArc(100, 100, 200, 200, 250, 220);
        g.setColor(Color.ORANGE);

        for (int i = 0; i < 240; i += 80) {
            g.fillArc(0 + i, 0 + i, 200, 200, 250, 180);
        }

    }
}
