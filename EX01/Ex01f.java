package ex01f;


import javax.swing.JOptionPane;

/**
 * @DanielJRodrigues
 * f)Faça um programa que exibe a área de um triângulo a partir da base e da
 * altura fornecidas pelo usuário.
 */
public class Ex01f {

   
    public static void main(String[] args) {
        
         double base , altura , area;
        
        base = Double.parseDouble(JOptionPane.showInputDialog("Informe a base do triângulo:"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura do triângulo:"));
        
        area = (base*altura)/2;
        
        JOptionPane.showMessageDialog(null,"A área do triângulo: \n"+area);
        System.out.println("A área do triângulo: \n"+area);
        
    }
    
}
