import java.util.Scanner;

public class igPractica2 {
    public static void main (String[] args) {
        int a;
        float b;
        String c;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter an integer: ");
        a = sc.nextInt();
        System.out.println("Please enter float number: ");
        b=sc.nextFloat();
        System.out.println("Please enter a string: ");
        c=sc.next();
        System.out.println("you have entered a = " + a + " b= " + b + " c= " + c);
    }
}