import java.util.Scanner;

public class lgorithmComplexityTest {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        String inputString = sc.nextLine();
        int[] frequentChar = new int[256];
        for (int i = 0; i < inputString.length(); i++) {           //{2}
            /* Tìm ví trí tương ứng của ký tự trong bảng ASCII */
            int ascii = inputString.charAt(i);               //{3}
            /* Tăng giá trị tần suất */
            frequentChar[ascii] += 1;                              //{4}
        }
        int max = 0;
        char maxChar = ' ';
        for (int j = 0; j< 255; j++) {
            if (frequentChar[j] > max) {
                max = frequentChar[j];
                maxChar = (char) j;
            }
        }
        System.out.println("The most frequent character is " + maxChar + " and its frequency is " + max);
    }
}
