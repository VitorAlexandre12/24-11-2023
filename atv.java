package aula10;

import java.util.Scanner;

public class atv {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o login: ");
        String login = sc.nextLine();

        System.out.print("Digite a senha: ");
        String senha = sc.nextLine();

        if (login.equals("usuario") && senha.equals("senha123")) {
            System.out.println("Login e senha válidos. Bem vindo ao sistema.");
        } else {
            System.out.println("Login ou senha inválidos. Acesso negado.");
        }
   } 
}
