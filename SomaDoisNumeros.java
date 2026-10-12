import java.util.Scanner;

public class SomaDoisNumeros {
    public static void main(String[] args) {
        Scanner teclado = new  Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = teclado.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = teclado.nextDouble();

        double soma =  num1 + num2;
        
        System.out.println("A soma de " + num1 + " + " + num2 + " é = " + soma);

        teclado.close();


        



    }

}
