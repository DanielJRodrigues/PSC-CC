package ex02g;

import javax.swing.JOptionPane;

/*
 * @author Daniel J Rodrigues
 g) Faça um programa que mostre um menu com as opções "adição", "subtração",
"multiplicação" e "divisão", recebe dois valores reais, a operação escolhida
pelo usuário e exibe o resultado da operação sobre os valores.
*/

public class Ex02g {

    
    public static void main(String[] args) {
        
        double  num1 , num2 , resultado;
        
        String operacao = JOptionPane.showInputDialog("Escolha a operação aritimética \n adição \n subtração \n multiplicação \n divisão ");
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite inteiro :"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro número :"));
        
        
       if(operacao.equals("adição")){
           resultado = num1 + num2;
           JOptionPane.showMessageDialog(null,"Resultado : "+resultado);
       
       } else if (operacao.equals("subtração")){
           resultado = num1 - num2;
           JOptionPane.showMessageDialog(null,"Resultado : "+resultado);
       }else if (operacao.equals("multiplicação")){
           resultado = num1 * num2;
           JOptionPane.showMessageDialog(null,"Resultado : "+resultado);
       }else if (operacao.equals("divisão")){
           resultado = num1 / num2;
           JOptionPane.showMessageDialog(null,"Resultado : "+resultado);
       }
        
    }
    
}

    

