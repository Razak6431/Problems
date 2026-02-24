package com.kunal.Leetcode_Practice;

import java.util.Arrays;

public class BinarySearchIn2D {
    public static void main(String[] args) {
        int arr[][]={
                {3,4,7,9},
                {12,13,16,18},
                {20,21,23,29}
        };
        int target=23;
       int ans[]=bs(arr,target);
       System.out.println(Arrays.toString(ans));

    }
    public static int[] bs(int [][] arr,int target){
        int n=arr.length;
        int m=arr[0].length;
        int low=0;
        int high=m*n-1;

        while(low<=high){
            int mid=low+(high-low)/2;
            int row=mid/n;int col=mid%n;

            if(arr[row][col]==target){
                return new int[]{row,col};
            }else if(arr[row][col]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return new int[]{-1,-1};

    }
}
