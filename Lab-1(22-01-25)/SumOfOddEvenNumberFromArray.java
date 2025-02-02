public class SumOfOddEvenNumberFromArray {
    //redoy178

    static void SumOddNumber(int[] arr) {
        int sum = 0;
        System.out.print("Odd Numbers Are : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
                sum += arr[i];
            }
        }
        System.out.println("\nSum Of Odd Numbers : " + sum);
    }

    static void SumEvenNumer(int[] arr) {
        int sum = 0;
        System.out.print("Even Numbers Are : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
                sum += arr[i];
            }
        }
        System.out.println("\nSum Of Even Numbers : " + sum);
    }

    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 25, 30};
        SumOddNumber(arr);
        SumEvenNumer(arr);
    }
}
