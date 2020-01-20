import java.util.Arrays;

class Solution {
    public static int[] plusOne(int[] digits) {
        StringBuffer a=new StringBuffer();
        for(int i=0;i<digits.length;i++){
            a.append(digits[i]);
        }
        String b=a.toString();
        int c=Integer.valueOf(b);
        int d=c+1;
        String e=String.valueOf(d);
        char[] f=e.toCharArray();
        int[] g=new int[f.length];
        for(int j=0;j<f.length;j++){
            g[j]=Integer.parseInt(String.valueOf(f[j]));
        }
        return g;
    }

    public static void main(String[] args) {
        int[] d={9};
        System.out.println(Arrays.toString(plusOne(d)));
    }
}