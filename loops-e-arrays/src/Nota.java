import java.util.Scanner;

public class Nota {
/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nota;

        System.out.println("Digite uma nota: ");
        nota = sc.nextInt();

        while(nota < 0 || nota > 10){
            System.out.println("Nota inválida, digite novamente: ");
            nota = sc.nextInt();
        }
        
    }
}
