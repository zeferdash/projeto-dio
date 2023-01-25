import java.util.Scanner;

public class Maior_E_Media {
/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        for(int i = 0; i < 5; i++){
            System.out.println("Digite um número: ");
            numero = sc.nextInt();

            soma += numero;

            if(numero > maior) maior = numero;
        }

        System.out.println("O maior número é: " + maior);
        System.out.println("A média dos números é: " + (soma/5));
    }
}