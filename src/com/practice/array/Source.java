package com.practice.array;

import java.util.*;

public class Source {

    public static int search(int arr[], int left, int right, int key) {
        int pivot = findPivot(arr, 0 , arr.length-1);
        if(arr[0] > key){
            return searchUtil(arr,pivot, right, key);
        }else{
            return searchUtil(arr,left, pivot-1, key);
        }
        // return -1;
    }
    public static int searchUtil(int[] arr,int start, int end,int key){
                System.out.println(start+" "+end);

        if(start<=end){
            int mid = (start+end)/2;

            if(key==arr[mid]){
             System.out.println(start+"Equal "+end);
                
                return mid;
            }
            if(key > arr[mid]){
             System.out.println(start+" Key Greater"+mid+" "+end);
                
                return findPivot(arr, mid+1, end);
            }else{
             System.out.println(start+"Key lesser "+mid+" "+end);
                
                return findPivot(arr, start, mid-1);
            }
        }
                     System.out.println("HEEEEE");

        return -1;
    }
    public static int findPivot(int[] arr,int start, int end){
        if(start<end){
            int mid = (start+end)/2;
            if(arr[0] < arr[mid]){
                return findPivot(arr, mid+1, end);
            }else{
                return findPivot(arr, start, mid);
            }
        }
        return start;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int arr[] = {14,15,16,17,18,11,12,13};
//        for(int i = 0 ; i < n ; i++){
//            arr[i] = sc.nextInt();
//        }
        int key = 6;
        int i = search(arr, 0, arr.length - 1, key);
        if (i != -1) {
            System.out.println(i);
        } else {
            System.out.println("-1");
        }
    }
}
