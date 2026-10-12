import java.util.Scanner;

public class CalculadoraCompleta {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = teclado.nextDouble();

        System.out.println("Digite o segundo número: ");
        double num2 = teclado.nextDouble();

        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicao = num1 * num2;
        double divisao = 0;

        // Verifica se não vai dividir por zero
        if (num2 != 0) {
            divisao = num1 / num2;
        }
        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Soma:           " + num1 + " + " + num2 + " = " + soma);
        System.out.println("Subtração:          " + num1 + " - " + num2 + " = " + subtracao);
        System.out.println("Multiplicação:   " + num1 + " x " + num2 + " = " + multiplicao);

        if (num2 == 0) {
            System.out.println("Divisão:     Não é possivel por zero!");
        } else {
            System.out.println("Divisão:     " + num1 + " / " + num2 + " = " + divisao);
        }
        teclado.close();

    }

}
