package ex01c;

import javax.swing.JOptionPane;

/**
 * c)Faça um programa que lê o salário atual de alguém e exibe o novo salário
 * que é o atual com 25%de aumento.
 * @DanielJROdrigues
 */
public class Ex01c {

    public static void main(String[] args) {
       String sal = JOptionPane.showInputDialog ("Coloque o seu salário atual :");
       float salint = Float.parseFloat(sal);
       
       double aumento = 0.25*salint;
       
       double salatual = salint+aumento;
       
       JOptionPane.showMessageDialog (null,"você irá receber: \n"+salatual);
       System.out.println("Você irá receber : \n"+salatual);   
    }
    
}
