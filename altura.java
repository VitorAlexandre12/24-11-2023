package aula10;

import java.util.Scanner;

public class altura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a altura do pacote: ");
        double altura = sc.nextDouble();

        System.out.print("Digite a largura do pacote: ");
        double largura = sc.nextDouble();

        System.out.print("Digite o comprimento do pacote: ");
        double comprimento = sc.nextDouble();

        double alturaMaxima = 10.0; 

        if (altura <= alturaMaxima) {
            System.out.println("Pacote aceito. Altura dentro do limite permitido.");
        } else {
            System.out.println("Pacote rejeitado. Altura excede o limite permitido.");
        }
    } 
}
