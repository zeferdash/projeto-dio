import java.util.Scanner;

public class Nome_Idade {
/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Nome: ");
            String nome = sc.next();
            if(nome.equals("0")) break;
            
            System.out.println("Idade: ");
            int idade = sc.nextInt();
            
        }
    }
}
