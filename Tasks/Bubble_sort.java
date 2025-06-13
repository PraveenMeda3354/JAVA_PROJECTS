import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr = {3,5,6,4,2,1};
        System.out.println(Arrays.toString(bubblesort(arr)));
    }
    public static int[] bubblesort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;
    }
}
