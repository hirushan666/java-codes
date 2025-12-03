package Test2;

import java.util.*;


public class Inputfromuser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i<arr.length; i++){
            System.out.println("Enter element " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The elements in the array are: ");
        System.out.println(Arrays.toString(arr));


    }

}
