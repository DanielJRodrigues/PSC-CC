package ex01b;

import javax.swing.JOptionPane;

/**
 b)Faça um programa que recebe as notas P1, P2 e P3 e exibe a média considerando
 * que a nota P1 tem peso 3, a nota P2 tem peso 3 e a nota P3 tem peso 4..
 * @DanielJROdrigues
 */
public class Ex01b {

    public static void main(String[] args) {
       
        String p1 = JOptionPane.showInputDialog ("Nota P1 :");
       float p12 = Float.parseFloat(p1);
       
       String p2 = JOptionPane.showInputDialog ("Nota P2 :");
       float p22 = Float.parseFloat(p2);
       
       String p3 = JOptionPane.showInputDialog ("Nota P3 : ");
       float p32 = Float.parseFloat(p3);
       
       float media = ((p12*3)+(p22*3)+(p32*4))/10;
       
       
       JOptionPane.showMessageDialog (null,"Sua média: \n"+media);
       System.out.println("Seu média é : \n"+media);
       
        
    }
    
}
