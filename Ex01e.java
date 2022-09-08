package ex01e;

import javax.swing.JOptionPane;

/*
 @DanielJROdrigues
 */
public class Ex01e {

    
    public static void main(String[] args) {
       
        String b = JOptionPane.showInputDialog ("Digite a base do retângulo: "); 
        float b2 = Float.parseFloat(b);
        
        String h = JOptionPane.showInputDialog ("digite a altura do retângulo: ");
        float h2 = Float.parseFloat(h);
        
        float area = b2*h2;
      
       JOptionPane.showMessageDialog (null,"Área do retângulo: \n"+area);
       System.out.println("Área do retãngulo é: \n"+area);
       
    }
    
}