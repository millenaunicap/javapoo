package javapoo;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite sua idade: ");
        String idadeTexto = scanner.nextLine();

           
            int idade = Integer.parseInt(idadeTexto);

          
            System.out.println("Idade em número inteiro: " + idade);
      
            scanner.close();
        }
    }
