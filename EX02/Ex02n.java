package ex02n;

import javax.swing.JOptionPane;

/*
 * @author Daniel J Rodrigues
n) Faça um programa que recebe a idade de um nadador e exibe a categoria que ele pertence. Sendo o critério:
• Infantil (0 a 10 anos);
• Junior (11 a 14 anos);
• Adolescente (15 a 20 anos);
• Jovem (21 a 35 anos) e
• Máster (> 35 anos).
*/

public class Ex02n {

    
    public static void main(String[] args) {
        
        int  idade;
        
        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:"));
        
        
       if(idade <= 10){
           JOptionPane.showMessageDialog(null,"Sua categoria é Infantil"); 
       
       } else if(idade <= 14) {
            JOptionPane.showMessageDialog(null,"Sua categoria é Junior ");
       } else if (idade <= 20) {
           JOptionPane.showMessageDialog(null,"Sua categoria é Adolescente");
       }else if (idade <= 35) {
           JOptionPane.showMessageDialog(null,"Sua categoria é Jovem");
       }else if (idade > 35) {
           JOptionPane.showMessageDialog(null,"Sua categotia é Máster");
       }
       
 
       
        
    }
    
}

    
