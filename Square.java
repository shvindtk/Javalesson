import java.util.Scanner;

public class Square {

    public static void main(String[] args) {

        //ax^2+b+c=0
        Scanner sc = new Scanner(System.in);
        System.out.println("a^2+b+c=0");

        System.out.println("Введите a");
        int a = sc.nextInt();

        System.out.println("Введите b");
        int b = sc.nextInt();

        System.out.println("Введите c");
        int c = sc.nextInt();

        int d=b*b-4*a*c;
        if(d>0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("x1="+x1+", x2="+x2);
        }
        else {
            if(d==0) {
                double x3=-b/(2*a);
                System.out.println("x1=x2="+x3);
            }
            else {
                System.out.println("Нет решения");
            }
        }

        }
    }

