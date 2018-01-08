import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        in.close();

        sol.printArrRev(arr, n);
    }
    
    public void printArrRev(int[] a, int n) {
        int[] b = new int[n];
        int count = n - 1;
        
        for(int i=0; i<n; i++) {
            if(count >= 0) {
                b[i] = a[count]; 
            }
            count--;
        }
        
        for(int i=0; i<n; i++) {
            System.out.print(b[i] +" ");
        }
    }
}