import java.util.Scanner;

public class Demo {

    public static void main(String...args){
        System.out.println("Hello World");
        int a=Integer.parseInt(args[0]);
        int b= Integer.parseInt(args[1]);
        System.out.println("Result="+ (a+b));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(n+m);
    }

}
