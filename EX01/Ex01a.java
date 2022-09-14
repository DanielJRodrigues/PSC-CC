package ex01a;

import javax.swing.JOptionPane;


/**
 * @author Daniel J Rodrigues
 * a)Faça um programa que recebe três números reais e exibe a multiplicação
 * desses números.
 */
public class Ex01a {
    public static void main(String[] args) {
        
        double  num1 , num2 , num3 , resultado;
        
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1º número :"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2º número :"));
        num3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 3º número :"));
        
        resultado = num1*num2*num3;
        
       JOptionPane.showMessageDialog(null,"Resultado :\n"+resultado);
       System.out.println("Resultado :\n"+resultado);
    }
    
}
