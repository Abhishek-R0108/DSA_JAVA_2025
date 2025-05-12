import java.util.Scanner;

// Given an array of integers nums, return the value of the largest element in the array
public class LargestElement {
    public static void main(String[] args) {

        /*Input: nums = [3, 3, 6, 1]
        Output: 6
        Explanation: The largest element in array is 6*/

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
            sc.nextLine();
        }

        int large = 0;

        for (int i=0; i< arr.length; i++) {
            if(arr[i]>large){
                large = arr[i];
            }
        }
        System.out.println("The largest element is:" +large);
    }
}
