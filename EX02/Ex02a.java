package ex02a;

import javax.swing.JOptionPane;

/*
 * @author Daniel J Rodrigues
 * a) Faça um programa que recebe duas notas, exibe a média aritmética das notas
 * e uma mensagem indicando se o aluno foi aprovado ou reprovado. A média para 
 * aprovação deve ser maior que seis.
 */

public class Ex02a {

    
    public static void main(String[] args) {
        
        double nota1 , nota2 , media;
        
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1ª nota:"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2ª nota:"));
        
        media = (nota1+nota2)/2;
        
        if (media >= 6){
            JOptionPane.showMessageDialog(null,"Sua nota final foi "+media+" \nVocê está aprovado.");
        } else if (media < 6){
            JOptionPane.showMessageDialog(null,"Sua nota final foi "+media+" \nVocê está reprovado.");
            
    }
        

               
    }
    
}
