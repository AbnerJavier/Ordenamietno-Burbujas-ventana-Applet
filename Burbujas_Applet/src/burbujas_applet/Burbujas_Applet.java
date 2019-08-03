package Burbujas_Applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Burbujas_Applet extends Applet {
    public void init()
    {
        
    }
    public void paint(Graphics g)
    {
        int c = 10;
        int n, aux;
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese tamaño del arreglo"));
        int array[] = new int [n];
        boolean swapped = false;
        
        int probar = 0;
        int cont1 = 0;
        for(int j=0;j<array.length;j++)
        {
            cont1 += 25;
            g.setColor(Color.black);
            array[j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dato "+(j+1)));
            g.drawString(String.valueOf(array[j]), cont1, 140);
            g.setColor(Color.red);
            g.fillRect(cont1, 140-30, c, -array[j]*5);
                probar = cont1;
        }
        int cont = 0;
        int temp = probar + 35;
        do
        {
            swapped = false;
            for(int i=1;i<array.length;i++)
            {
                if(array[i] < array[i-1])
                {
                    aux = array[i-1];
                    array[i-1] = array[i];         //2 1
                    array[i] = aux;
                    swapped = true;
                    
                }
            }
        }while(swapped);
        
        for(int k=0;k<array.length;k++)
        {
            cont = cont+25;
            g.fillRect(cont+temp, 140-30, c, -array[k]*5);
            g.drawString(String.valueOf(array[k]), cont+temp, 140);
            try {
                Thread.sleep(1150);
            } catch (InterruptedException ex) {
                Logger.getLogger(Burbujas_Applet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
