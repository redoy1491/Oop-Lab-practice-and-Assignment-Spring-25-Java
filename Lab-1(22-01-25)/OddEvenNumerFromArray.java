
public class OddEvenNumerFromArray {
//redoy178

    static void OddNumber(int[] arr) {
        System.out.print("Odd Numbers Are : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    static void EvenNumer(int[] arr) {
        System.out.print("Even Numbers Are : ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 25, 30};
        OddNumber(arr);
        EvenNumer(arr);
    }
}
