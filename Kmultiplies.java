// Given a number num and a value k. Print k multiplies of num

// Constraints: k>0
// Input 1: num =12, k = 5
// Output 1: 12,24,36,48,60

// Input 2: num = 3, k =8
// Output 2: 3,6,9,12,15,18,21,24

import java.util.Scanner;

public class Kmultiplies{
    static void printMultiplies(int n, int k){
        //base case
        if(k==1){
            System.out.println(n);
            return;
        }

        //recursive work
        printMultiplies(n, k-1);

        //self work
        System.out.println(n * k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        printMultiplies(n, k);
    }
}