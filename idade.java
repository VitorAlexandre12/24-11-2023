package aula10;

import java.util.Scanner;

public class idade {
    public static void main(String[] args) {
        int idade;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a sua idade: ");
        idade = sc.nextInt();

        if (idade < 18) {
            System.out.println("Você tem " + idade + " anos e Você é menor de idade.");
        } else{ 
            System.out.println("Você tem " + idade + " anos e Você é maioor de idade.");
        }

       

    }
}
