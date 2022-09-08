package ex01l;

import javax.swing.JOptionPane;

/**
 * l)Faça um programa que recebe o ano de nascimento de uma pessoa e o ano atual,
 * e exibe a idade dessa pessoa em anos.
 * @DanielJROdrigues
 */
public class Ex01l {

    public static void main(String[] args) {
       String anoatual = JOptionPane.showInputDialog ("Coloque o ano atual :");
       int anoatual2 = Integer.parseInt(anoatual);
       
       String anonasc = JOptionPane.showInputDialog ("Coloque seu ano de nascimento :");
       int anonasc2 = Integer.parseInt(anonasc);
       
       int idade = anoatual2-anonasc2;
       
       JOptionPane.showMessageDialog (null,"Sua idade: \n"+idade);
       System.out.println("Seu idade é : \n"+idade);
       
        
    }
    
}
