import java.util.Scanner;

/**
 * input
 */
public class input {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        System.out.println("enter another number");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Answer:"+sum);
    }

    public static int nextInt() {
        return 0;
    }
}