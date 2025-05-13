import java.util.Scanner;

/*Problem Statement:
You are given an array
        A
A of size
        N
N and an element
X
X. Your task is to find whether the array
A
A contains the element
X
X or not.

        Approach:
We iterate through the array and check whether any element in the array is equal to
X
X.
If we find
        X
X in the array, we can stop the search and output “YES”.
If we complete the iteration without finding
        X
X, we output “NO”.*/

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int N = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the element to be searched");
        int X = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter the array elements:");
        int[] A = new int[N];
        for(int i=0;i<N;i++) {
            A[i] = sc.nextInt();
        }

        boolean found = false;

        for(int element:A) {
            if(element == X) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
