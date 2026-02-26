package com.kunal.Leetcode_Practice;
import java.util.*;
public class IntersectionOfArrays {
    public static void main(String[] args) {
        int nums1[]={4,9,5};
        int nums2[]={9,4,9,8,4};
        int a[]=intersect(nums1,nums2);
        System.out.println(Arrays.toString(a));

    }
    public static int[] intersect(int nums1[],int nums2[]){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        HashSet<Integer> ans=new HashSet<>();
        ArrayList<Integer>ab=new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
               ab.add(nums2[i]);
            }
        }
        int a[]=new int[ab.size()];
//        ArrayList<Integer> list=new ArrayList<>(ans);
//        for(int i=0;i<list.size();i++){
//            a[i]=list.get(i);
//
//        }
        for(int i=0;i<ab.size();i++){
            a[i]=ab.get(i);
        }
       return a;

    }
}

