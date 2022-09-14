package ex01i;

import javax.swing.JOptionPane;
/**
 * @DanielJROdrigues
 * i)Faça um programa que, a partir da idade e o ano atual, calcule e exiba a
 * idade que a pessoa teria na virada do próximo século
 */
public class Ex01i {

    
    public static void main(String[] args) {
        
        int idade , ano ,  idade2100;
        
        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:"));
        ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano atual:"));
        
        idade2100 = (2100-ano)+idade;
        
        JOptionPane.showMessageDialog(null,"Você terá "+idade2100+" anos em 2100");
        System.out.println("Você terá: "+idade2100+" anos em 2100");
    }
    
    
}
