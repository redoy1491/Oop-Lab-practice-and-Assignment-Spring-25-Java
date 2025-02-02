public class SumAvgArray {
    //redoy178
    static int sum_of_array(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 25, 30};
        int sum = sum_of_array(arr);
        System.out.println("Sum of array : " + sum);
        System.out.println("Avg of array : " + (sum / arr.length));

    }
}
