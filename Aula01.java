/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula01;

import javax.swing.JOptionPane;

/**
 *
 * @DanielJROdrigues
 */
public class Aula01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String nome = JOptionPane.showInputDialog ("Coloque seu nome");
       String sobrenome = JOptionPane.showInputDialog ("Coloque seu sobrenome");
       String nomeCompleto = nome + " " + sobrenome;
       JOptionPane.showMessageDialog (null,"Seu nome completo: \n"+nomeCompleto);
       System.out.println("Seu nome completo: \n"+nomeCompleto);
       
        
        
        
        // TODO code application logic here
    }
    
}
