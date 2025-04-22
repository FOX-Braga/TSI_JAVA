package JAVA;
import java.util.Scanner;

public class att { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anoNascimento, idade;

        System.out.println("Qual é o seu ano de nascimento:");
        anoNascimento = sc.nextInt();

        idade = 2025 - anoNascimento;

        if ((idade >= 16 && idade < 18) || (idade >= 70)) {
            System.out.println("Seu voto não é obrigatório");
        } else if (idade >= 18 && idade < 70) {
            System.out.println("Seu voto é obrigatório");
        } else {
            System.out.println("Você ainda não pode votar");
        }

        sc.close(); // Fecha o Scanner
    }
}
