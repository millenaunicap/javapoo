package javapoo;

import java.util.Scanner;

public class Q1{


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

     
        System.out.println("Bem-vindo, " + nome);

        
        scanner.close();
    }
}
