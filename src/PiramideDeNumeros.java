import java.util.Scanner;

public class PiramideDeNumeros {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Digite um número!");

        int number = userInput.nextInt();

        for(int i = 1; i <= number; i++) {
            for(int k = 1; k <= i; k++) {
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }
}
