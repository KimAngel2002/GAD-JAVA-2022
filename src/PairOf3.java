import java.util.Scanner;

public class PairOf3 {
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
        for(int i=0; i<n-2; i++)
            for(int j=i+1; j<n-1; j++)
                for(int k=j+1; k<n; k++){
                    if(v1[i]+v1[j]+v1[k] == 0 && v2[j] != -1 && v2[i] != -1 && v2[k] != -1) {
                        ct++;
                        v2[j] = -1;
                        v2[i] = -1;
                        v2[k] = -1;
                        break;
                    }
                }
        System.out.println(ct);
    }
}
