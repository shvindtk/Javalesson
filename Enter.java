import java.util.Scanner;

public class Enter {

    public static void main(String[] args) {
        //ax+b=0
        Scanner sc = new Scanner(System.in);
        System.out.println("ax+b=0");
        System.out.println("Введите a");
        int a = sc.nextInt();
        System.out.println("Введите b");
        int b = sc.nextInt();
        int x=-(b/a);
        int r=b%a;
        System.out.println("x="+x+" остаток "+r);
    }
}
