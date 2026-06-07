import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchRecursive {

    public static int BinarySearch(int[] array, int left, int right, int value) {
        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;

        if (array[mid] == value) {
            return mid;
        }

        if (array[mid] > value) {
            return BinarySearch(array, left, mid - 1, value);
        }

        return BinarySearch(array, mid + 1, right, value);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Nhap mang:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        System.out.print("Nhap gia tri can tim: ");
        int value = sc.nextInt();


        int result = BinarySearch(arr, 0, n - 1, value);


        if (result != -1) {
            System.out.println("Tim thay tai vi tri: " + result);
        } else {
            System.out.println("Khong tim thay!");
        }

        sc.close();
    }
}