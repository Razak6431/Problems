package Practice;

public class Shifting_Letters {
    static int MOD=26;
    public static void main(String[] args) {
        String s="abc";
        int[] shifts={3,5,9};
        int n=s.length();
        int [] sum=new int[n];
        sum[n-1]=shifts[n-1];
        for(int i=n-2;i>=0;i--){
            sum[i]=(sum[i+1]+shifts[i])%MOD;
        }
        char []ch=s.toCharArray();
        for(int i=n-1;i>=0;i--){
            ch[i]=(char)(((ch[i]-'a')+sum[i])%MOD+'a');
        }

        for(int i=0;i<n;i++){
            System.out.println(ch[i]+" ");
        }
    }

}
