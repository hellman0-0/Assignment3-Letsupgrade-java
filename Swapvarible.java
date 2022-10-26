import java.util.Scanner;

public class Swapvarible {

    public static void main(String args[]) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter First Number:");
    int a=sc.nextInt();
    System.out.println("Enter Second Number");
    int b=sc.nextInt();
    System.out.println("Value stored in var a initially:");
    System.out.println(a);
    System.out.println("Value stored in var b initially:");
    System.out.println(b);
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("Value stored in var a after swap:");
    System.out.println(a);
    System.out.println("Value stored in var b after swap:");
    System.out.println(b);
    sc.close();
    }
}
