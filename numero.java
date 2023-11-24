package aula10;

import java.util.Scanner;

public class numero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String texto = sc.nextLine();

        if (texto.matches(".*\\d.*")) {
            System.out.println("O texto contém pelo menos um número.");
        } else {
            System.out.println("O texto não contém números.");
        }
    }
}
