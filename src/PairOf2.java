import java.util.Scanner;

public class PairOf2 {
    public static void main(String[] args) {
        int[] v1;
        Scanner s_name = new Scanner(System.in);
        int n = s_name.nextInt();
        v1 = new int[n];
        int[] v2;
        v2 = new int[n];
        for(int i=0; i<n; i++){
            v1[i]=s_name.nextInt();
            v2[i]=1;
        }
        int ct=0;
        for(int i=0; i<n-1; i++)
            for(int j=i+1; j<n; j++)
                if(v1[i]+v1[j] == 0 && v2[j] != -1 && v2[i] != -1) {
                    ct++;
                    v2[j] = -1;
                    break;
                }
        System.out.println(ct);
    }
}