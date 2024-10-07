import java.util.Locale;
import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // variaveis
        double A, B, C;
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        // Tratamento das variaveis
        double triangulo, circulo, trapezio, quadrado, retangulo, pi=3.14159;
        triangulo = A * C / 2;
        circulo = pi * C * C;
        trapezio = (A + B) * C / 2;
        quadrado = B * B;
        retangulo = A * B;
        
        System.out.printf("Triângulo: %.3f\n", triangulo);
        System.out.printf("Círculo: %.3f\n", circulo);
        System.out.printf("Trapézio: %.3f\n", trapezio);
        System.out.printf("Quadrado: %.3f\n", quadrado);
        System.out.printf("Retângulo: %.3f\n", retangulo);
    }
}
