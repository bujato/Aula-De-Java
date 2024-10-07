import java.util.Locale;
import java.util.Scanner;

public class QuartoExercicio {
    public static void main(String[] args){
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
            double numero, hora, valorHora, salario; 

        numero = sc.nextDouble();
        hora = sc.nextDouble();
        valorHora = sc.nextDouble();
        salario = hora * valorHora;

        System.out.println("NUMBER: " + numero);
        System.out.printf("Com %s horas trabalhadas, e com elas custando: %s", hora, valorHora);
        System.out.println();
        System.out.printf("SALARY: %.2f", salario);

        sc.close();
    }
}
