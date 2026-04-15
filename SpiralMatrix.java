package Practice;

import java.util.ArrayList;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] mat={
                {1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}
        };
        System.out.println(ans(mat));

    }
    public static ArrayList<Integer> ans(int[][]mat){
        int n=mat.length;
        int m=mat[0].length;
        ArrayList<Integer> list=new ArrayList<>();
        int count=0;
        int left=0, right=m-1,top=0,bottom=n-1;

        while(count<m*n){
            for(int i=left;i<=right;i++){
                list.add(mat[top][i]);
                count++;
            }
            for(int i=top+1;i<=bottom;i++){
                list.add(mat[i][right]);
                count++;
            }
            if(top!=bottom){
                for(int i=right-1;i>=left;i--){
                    list.add(mat[bottom][i]);
                    count++;
                }
            }
            if(left!=right){
                for(int i=bottom-1;i>=top+1;i--){
                    list.add(mat[i][left]);
                    count++;
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return list;
    }
}
