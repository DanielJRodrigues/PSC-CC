package ex02c;

import javax.swing.JOptionPane;

/*
 * @author Daniel J Rodrigues
 c) Faça um programa que recebe dois números inteiros distintos e exibe o maior.
*/

public class Ex02c {

    
    public static void main(String[] args) {
        
        int  num1 , num2;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro :"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite mais um número inteiro :"));

        
        
       if(num1 > num2){
           JOptionPane.showMessageDialog(null,num1+" é o maior!");
       
       } else if(num1 < num2){
           JOptionPane.showMessageDialog(null,num2+" é o maior!");
       }
 
       
        
        
    
        
    }
    
}

    
