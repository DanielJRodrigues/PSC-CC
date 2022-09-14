package ex02b;

import javax.swing.JOptionPane;

/*
 * @author Daniel J Rodrigues
 b) Tendo como entrada a altura e o sexo de uma pessoa, construa um programa
que exibe o peso ideal para ela, em quilos. Use as seguintes fórmulas
(adote ℎ como a altura e em metros):
• Homens: 72,7 × ℎ − 58
• Mulheres: 62,1 × ℎ − 44,7
*/

public class Ex02b {

    
    public static void main(String[] args) {
        
        double h , pesoIdeal; //pesoIdealF;
        
        h = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura:"));
        String sexo = JOptionPane.showInputDialog("Informe seu sexo biólogico:");
        
        if (sexo.equals("masculino")){
            pesoIdeal = 72.7*h-58;
            JOptionPane.showMessageDialog(null,"Seu peso ideal é "+pesoIdeal);
        }else if (sexo.equals("feminino")){
            pesoIdeal = 62.1*h-44.7;
            JOptionPane.showMessageDialog(null,"Seu peso ideal é "+pesoIdeal);
        }
        
      
        
        
        
      
            
    
        

               
    }
    
}

