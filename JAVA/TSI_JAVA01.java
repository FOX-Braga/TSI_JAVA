package JAVA;
 import java.util.Scanner;
 
 public class TSI_JAVA01 {
    public static void main(String[] args) {
        int banho,banho_total,agua_gasta, agua_total;
        float valor_ganho,valor_gasto,valor_agua,valor_banho, lucro;
        Scanner sc = new Scanner(System.in);
        valor_agua = 0.21f;   
        System.out.println("quantos litros de agua voce possui");
        agua_total = sc.nextInt();
        banho = 2000;
        banho_total = agua_total / banho;
        agua_gasta = banho * banho_total;
        valor_gasto = agua_gasta * valor_agua;
        valor_banho = banho_total / valor_agua;
        valor_ganho = banho_total * 25.00f;
        lucro = valor_banho - valor_ganho;
        System.out.println("o valor total de banhos e  " + banho_total);
        System.out.println("o valor total de agua gasta e  " + agua_gasta);
        System.out.println("o valor total de gasto com banho  e  " + valor_banho);
        System.out.println("o valor total de ganho e   " + valor_ganho);
        System.out.println("o valor total de lucro e  " + lucro);

        
    } 
 }