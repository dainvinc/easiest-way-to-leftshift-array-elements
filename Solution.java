import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  
  public void printEvenChars(String s1) {
    char[] c = new char[s1.length()];
    for(int i=0; i<s1.length(); i++) {
        c[i] = s1.charAt(i);
        if(i%2 == 0) {
          System.out.print(c[i]);
        }
      }
  }
  
  public void printOddChars(String s2) {
    char[] c = new char[s2.length()];
    for(int i=0; i<s2.length(); i++) {
      c[i] = s2.charAt(i);
      if(i%2 != 0) {
        System.out.print(c[i]);
      }
    }
  }

  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. 
    Your class should be named Solution. */
    Solution sol = new Solution();
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    String[] s = new String[n];
    scan.nextLine();
    for(int i=0; i<n; i++) {
      s[i] = scan.nextLine();
    }
    
    for(int i=0; i<n; i++) {
      sol.printEvenChars(s[i]);
      System.out.print(" ");
      sol.printOddChars(s[i]);
      System.out.println();
    }
    
  }
}