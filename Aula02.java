package aula02;

import javax.swing.JOptionPane;

/*
 @DanielJROdrigues
 */
public class Aula02 {

    
    public static void main(String[] args) {
       String cotDollar = JOptionPane.showInputDialog ("Digite a cotaçãodo dólar: ");      
       String valDolar = JOptionPane.showInputDialog ("digite o valor em dolares: ");
       float cotDollar2 = Float.parseFloat(cotDollar);
       /*Eu sei que provavelmete deve ter umamaneiramelhor de fazer isso */
       int valDolar2 = Integer.parseInt(valDolar);
       float valReal = cotDollar2*valDolar2;
       JOptionPane.showMessageDialog (null,"O valor em reais será de: \n"+valReal);
       System.out.println("O valor em reais sera de: \n"+valReal);
       
    }
    
}
