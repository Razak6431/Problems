package com.kunal.Leetcode_Practice;

public class KokoEatingBananas {
    public static void main(String[] args) {
        int piles[]={3,6,7,11};
        int hours=8;
        System.out.println(calculate(piles,hours));

    }
    public static int calculate(int arr[],int hours){
        int start=1;
        int ans=0;
        int end=max(arr);
        int total_hrs;
        while(start<=end){
            int mid=start+(end-start)/2;
            total_hrs=func(arr,mid);
            if(total_hrs<=hours){
                ans=mid;
             end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return ans;
    }
    public static int max(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int func(int arr[],int i){
        int totalhr=0;
        for(int j=0;j<arr.length;j++){
           totalhr+=(int) Math.ceil((double)arr[j] / i);
        }
        return totalhr;
    }
}
