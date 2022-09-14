package ex02e;

import javax.swing.JOptionPane;

/*
 * @author Daniel J Rodrigues
 e) Faça um programa que recebe um número inteiro e exibe uma mensagem indicando
se ele é par ou ímpar (use o operador % para obter o resto de uma divisão
inteira).
*/

public class Ex02e {

    
    public static void main(String[] args) {
        
        int  num;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        
        
       if(num % 2 == 0){
           JOptionPane.showMessageDialog(null,"O número é par ! "); 
       
       } else {
            JOptionPane.showMessageDialog(null,"O número é ímpar ! ");
       }
 
       
        
        
    
        
    }
    
}

    