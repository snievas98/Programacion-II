import java.util.Scanner;

public class DivisionEntera {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a (int): ");
        int a = sc.nextInt();
        System.out.print("b (int): ");
        int b = sc.nextInt();

        System.out.println("a / b (int) = " + (a / b)); // división entera
        sc.close();
    }
}