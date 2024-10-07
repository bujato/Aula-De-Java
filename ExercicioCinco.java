import java.util.Locale;
import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qtdePecaUm, qtdePecaDois;
        double valorUniPecaUm, valorUniPecaDois, valorUm, valorDois, valorTotal;

        // Valor da Primeria Peça
        qtdePecaUm = sc.nextInt();
        valorUniPecaUm = sc.nextDouble();
        valorUm = qtdePecaUm * valorUniPecaUm;
        System.out.println("--------------------");
        System.out.printf("O valor da primeira peça é: %.2f\n", valorUm);
        System.out.println("--------------------");

        // Valar da segunda Peça
        qtdePecaDois = sc.nextInt();
        valorUniPecaDois = sc.nextDouble();
        valorDois = qtdePecaDois * valorUniPecaDois;
        System.out.println("--------------------");
        System.out.printf("O valor da segunda peça é: %.2f\n", valorDois);

        // Valor total das peças
        valorTotal = valorUm + valorDois;
        System.out.println("-------------------------------");
        System.out.printf("Total a pagar: %.2f\n", valorTotal);
        System.out.println("-------------------------------");
    }
}
