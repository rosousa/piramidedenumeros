import java.util.Scanner;

public class PiramideDeNumeros {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Digite um número!");

        final int number = userInput.nextInt();

        for(int i = 1; i <= number; i++) {
            final String str = String.valueOf(i);
            System.out.println(str.repeat(i));
        }
    }
}
