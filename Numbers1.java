public class Numbers1 {
    public static void main(String args[]) {
        int temp;
        boolean isPrime = true;

        for (int a = 3; a <= 1000; a++) {

            for (int i = 2; i <= a / 2; a++) {
                temp = a % i;
                if (temp == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime==true) {
                System.out.println(a + " - простое число");
            }
        }
    }
}
