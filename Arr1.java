import java.util.Random;
public class Arr1 {
    public static void main(String[] args) {
      int b=0;
       int c=10;

        int a[]=new int[6];

        //заполнение массива
        for(int i=0;i<a.length; i++){
            int random = b + (int) (Math.random() * c);
                    a[i] = random;
            System.out.println(random);
        }
        int max = a[0];
        int min = a[0];
        //максимум
        for(int i = 0; i < a.length; i++) {
            if(a[i] > max) {
                max = a[i];}
            //минимум
            if(a[i] < min){
                min = a[i];}
        }
        System.out.println("Максимальное число: " + max);
        System.out.println("Минимальное число: " + min);
    }
}

