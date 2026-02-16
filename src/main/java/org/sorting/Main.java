package org.sorting;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        arr = new int[5];

        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }


        //SearchBinary

        binarySearch bs = new binarySearch();
        int x = sc.nextInt();

        int value = bs.binarySearch(arr,0, arr.length - 1, x);

        if(value == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index: " + value + " and Element is: " + arr[value]);
        }

    }
}
