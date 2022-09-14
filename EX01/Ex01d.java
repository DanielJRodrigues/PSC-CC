package ex01d;

import javax.swing.JOptionPane;
/**
 *
 * @DanielJRodrigues
 * d)Faça um programa que lê o salário base de alguém e exibe o novo salário,
 * considerando 5% de gratificação(mais dinheiro) e 7% de impostos
 * (menos dinheiro)sobre o salário base. Também exiba a gratificação e o imposto.
 */
public class Ex01d {


    public static void main(String[] args) {
        // TODO code application logic here
    
    double salBase , grat , imposto , salGrat , salNovo;
    
    salBase = Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário atual :"));
    
    grat = 0.05*salBase;
    salGrat = salBase+grat;
    imposto = 0.07*salGrat;
    salNovo = salGrat-imposto;
    
    JOptionPane.showMessageDialog (null,"Seu novo salário será: "+salGrat);
    JOptionPane.showMessageDialog (null,"Sua gratificação foi de: "+grat + "\n O imposto será: "+imposto);
    //JOptionPane.showMessageDialog (null,"O imposto será: \n "+imposto);
    
    


    
    
    
    
    
    
    
    
    
    }
    
    
}
