
package ex01c;

import javax.swing.JOptionPane;

/**
 * @DanielJRodrigues
 * c)Faça um programa que lê o salário atual de alguém e exibe o novo salário
 * que é o atual com 25%de aumento.
 */

public class Ex01c {

   
    public static void main(String[] args) {
        double salAtual , salNovo;
        
        salAtual = Double.parseDouble(JOptionPane.showInputDialog("Qual é o seu sálario atual?"));
        
        salNovo = (0.25*salAtual)+salAtual;
        
        JOptionPane.showMessageDialog(null,"Seu novo sálario será de : \n"+salNovo);
        System.out.println("Seu média é : \n"+salNovo);
    
    }
    
}
