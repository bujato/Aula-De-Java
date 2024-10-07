
import java.util.Scanner;
public class ExercicioTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A,B,C,D, dif;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        dif = A*B - C*D;

        System.out.printf("A diferença entre os números: %s, %s, %s e %s é igual a %s", A, B, C, D, dif);

        sc.close();
    }
}
