package com.kunal.Leetcode_Practice;

import java.util.Arrays;

public class Maximum_Number_Of_Removable_Characters {
    public static void main(String[] args) {
        String s="abcacb";
        String p="ab";
        int [] removable={3,1,0};
        System.out.println(bs(s,p,removable));

    }

    public static int bs(String s,String p,int[] removable){
        int l=0;
        int r=removable.length;

        while(l<r){
            int mid=(l+r+1)/2;
            if(ok(s,p,removable,mid)){
                l=mid;
            }else{
                r=mid-1;
            }
        }
        return l;
    }

    public static boolean ok(String s,String p,int[] removable,int mid){
        int [] mark=new int[s.length()];
        Arrays.fill(mark,0);
        for(int i=0;i<mid;i++){
            mark[removable[i]]=1;
        }
        int j=0;
        for(int i=0;i<s.length();i++){
            if(mark[i]==1)continue;

            if(j<p.length() && s.charAt(i)==p.charAt(j)){
                j++;
            }
            if(j==p.length())return true;

        }
        return j==p.length();
    }
}
