package ex01e;

import javax.swing.JOptionPane;
/**
 * @DanielJRodrigues
 * e)Faça um programa que exibe a área de um retângulo a partir da base e da
 * altura fornecidas pelo usuário.
 */
public class Ex01e {

    public static void main(String[] args) {
        
        double base , altura , area;
        
        base = Double.parseDouble(JOptionPane.showInputDialog("Informe a base do retâgulo:"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura do retângulo:"));
        
        area = base*altura;
        
        JOptionPane.showMessageDialog(null,"A área do retângulo: \n"+area);
        System.out.println("A área do retângulo: \n"+area);
    }
    
}
