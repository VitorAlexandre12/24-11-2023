package aula10;

import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        int n1, n2, soma;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        n1 = sc.nextInt();
        System.out.println("Digite outro numero para somar: ");
        n2 = sc.nextInt();
        soma = n1 + n2;
        System.out.println("A soma dos números é: " + soma);
    }
}
