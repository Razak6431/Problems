package com.kunal.Leetcode_Practice;

public class Jump_Game_7 {
    public static void main(String[] args) {
        String s = "011010";
        int minJump = 2;
        int maxJump = 3;

        boolean[] dp = new boolean[s.length()];
        char[] ch=s.toCharArray();
        dp[0]=ch[0]=='0';
        System.out.println(check(s,minJump,maxJump,dp,ch));
    }

    public static boolean check(String s, int min, int max, boolean[] dp,char [] ch) {
   int rechable=0;

        int n=s.length();
        for(int i=1;i<n;i++){
          if(i>=min){
              if(dp[i-min]){
                  rechable+=1;
              }else{
                  rechable+=0;
              }
          }

          if(i>max){
              if(dp[i]){
                  rechable-=1;
              }else{
                  rechable-=0;
              }
          }

          dp[i]=rechable>0 && ch[i]=='0';
        }
        return dp[n-1];
    }
}
