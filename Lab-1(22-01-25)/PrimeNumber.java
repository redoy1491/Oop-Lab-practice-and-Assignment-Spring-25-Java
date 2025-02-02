public class PrimeNumber {
//redoy178

    static void PrimeNumber(int a) {
        int flag = 0;
        for (int i = 2; i < a / 2; i++) {
            if (a % i == 0) {
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println(a + " is a prime number");
        } else {
            System.out.println(a + " is not a prime number");
        }
    }

    public static void main(String[] args) {
        PrimeNumber(12);
    }
}
