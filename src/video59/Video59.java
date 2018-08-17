/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package video59;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author gleez
 */
public class Video59 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MarcoConDibujos mimarco = new MarcoConDibujos(); 
        mimarco.setVisible(true); 
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        
    }
    
}

class MarcoConDibujos extends JFrame{
    
    public MarcoConDibujos(){
        setTitle("prueba de Dibujo"); 
        
        setSize(300,300); 
        
        LaminaConFiguras milamina = new LaminaConFiguras(); 
        add(milamina); 
    }
}

class LaminaConFiguras extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawRect(50,50,150,150); //dibujo
        //g.drawRect(20,20,100,100); 
    }
}