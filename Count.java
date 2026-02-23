package com.kunal.Leetcode_Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Count {
    public static void main(String[] args) {
        String s="abab";
        //String []str=new String[2*s.length()+3];
        ArrayList<String> substring=new ArrayList<>();
        int n=s.length();
        int ind=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                substring.add(s.substring(i,j));
            }
        }
        System.out.println(substring);
        for(int i=n;i>=n/2;i--){
            check(substring);
        }
    }
    public static void check(ArrayList sub){
        int count=0;


    }
}
