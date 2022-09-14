package ex02p;

import javax.swing.JOptionPane;

/*
 * @author Daniel J Rodrigues
p) Uma empresa decide presentear seus funcionários com um bônus de Natal. O valor é definido como segue:
• 20% do salário para os funcionários homens com mais de quinze anos de casa;
• 25% do salário para as funcionárias mulheres com mais de dez anos de casa;
• R$ 200,00 para os demais que não se encaixaram nas categorias anteriores.
Elabore um programa que recebe o sexo, o tempo de casa e o salário de um funcionário e exibe o valor total que o funcionário receberá no Natal (salário + bônus).
 */

public class Ex02p {

    
    public static void main(String[] args) {
        
        double salario , bonus;
        int tempoCasa;
        
        String sexo = JOptionPane.showInputDialog("Informe seu sexo");
        tempoCasa = Integer.parseInt(JOptionPane.showInputDialog("Informe seu tempo de casa:"));
        salario = Double.parseDouble(JOptionPane.showInputDialog("Informe seu salário"));
        
        //Expressão booleana 
        if (tempoCasa >= 15 && sexo.equals("masculino")){
            bonus = (0.20*salario)+salario;
        JOptionPane.showMessageDialog(null,"No natal você receberá R$ "+bonus);
        
        }else if (tempoCasa >= 15 && sexo.equals("feminino")){
            bonus = (0.25*salario)+salario;
            JOptionPane.showMessageDialog(null,"No natal você receberá R$ "+bonus);
        
        }else{
            bonus  = salario+200.00;
            JOptionPane.showMessageDialog(null,"No natal você receberá R$ "+bonus);
        }
        
        
        
        
        }
        
    
    
        

               
    }
    

