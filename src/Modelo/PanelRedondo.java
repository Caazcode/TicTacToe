/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author adrianaguilar
 */
package Modelo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JPanel;

public class PanelRedondo extends JPanel{
    private double arcoAncho = 50;
    private double arcoAltura = 50;
    private Color colorBorde = new Color(165,40,174);

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        Graphics2D g2 = (Graphics2D)g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        RoundRectangle2D.Double formaRedondeada = new RoundRectangle2D.Double(
                0,0,this.getWidth()-1 ,this.getHeight()-1 ,arcoAncho,arcoAltura
        );
        
        g2.setColor(this.getBackground());
        g2.fill(formaRedondeada);
        g2.setColor(colorBorde);
        g2.draw(formaRedondeada);
        g2.dispose();
    }
    
    
}