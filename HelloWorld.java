import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca un número");
        int first = s.nextInt();
        System.out.println("Introduzca otro número para sumarlos");
        int second = s.nextInt();
        int totalSum = first + second;
        System.out.println("La suma de ambos números es: " + totalSum);

    }
}
