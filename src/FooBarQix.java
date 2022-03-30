public class FooBarQix {
    static int verif_cifra(int i){
        if (i==3) {
            System.out.print("Foo");
            return 1;
        }
        else if (i==5){
            System.out.print("Bar");
            return 1;
        }
        else if (i==7){
            System.out.print("Qix");
            return 1;
        }
        return 0;
    }
    static int verif_existenta_cifra(int i){
        if (i==3)
            return 1;
        else if (i==5)
            return 1;
        else if (i==7)
            return 1;
        return 0;
    }
    static int divizib_nr(int n){
        int ok=0;
        if (n % 3 == 0){
            System.out.print("Foo");
            ok=1;
        }
        if (n % 5 == 0){
            System.out.print("Bar");
            ok=1;
        }
        if (n % 7 == 0) {
            System.out.print("Qix");
            ok=1;
        }
        return ok;
    }
    static void compute(int n)
    {
        int ok=divizib_nr(n);
        int ct=0;
        for(int copie=n; copie>0; copie=copie/10)
            ct++;
        int[] vect_cifre = new int [ct];
        int copie=n;
        for(int i=0; i<ct; i++){
            vect_cifre[ct-i-1]=copie%10;
            copie=copie/10;
        }
        int ct_verif=0;
        for(int i=0; i<ct; i++){
            int verif=verif_cifra(vect_cifre[i]);
            if(verif==1)
                ct_verif++;
        }
        if(ct_verif==0 && ok==0)
            System.out.print(n);
    }
    static void compute2(int n)
    {
        int ok=divizib_nr(n);
        int ct=0;
        for(int copie=n; copie>0; copie=copie/10)
            ct++;
        int[] vect_cifre = new int [ct];
        int copie=n;
        for(int i=0; i<ct; i++){
            vect_cifre[ct-i-1]=copie%10;
            copie=copie/10;
        }
        int ct_verif=0;
        int ct_zero=0;
        for(int i=0; i<ct; i++){
            if(verif_existenta_cifra(vect_cifre[i])==1)
                ct_verif++;
            if(vect_cifre[i]==0)
                ct_zero++;
        }
        if(ct_zero>0 && ct_verif==0 && ok==0){
            for(int i=0; i<ct; i++){
                if(vect_cifre[i]==0)
                    System.out.print("*");
                else
                    System.out.print(vect_cifre[i]);
            }
        }
        else if(ct_zero==0 && ct_verif==0 && ok==0){
            System.out.print(n);
        }
        else if(ok>0){
            for(int i=0; i<ct; i++){
                int verif=verif_cifra(vect_cifre[i]);
                if(verif==0)
                    System.out.print("*");
            }
        }

    }
    public static void main(String args[]) {
        for (int i = 1; i <= 53; i++) {
//        int i=101;
            System.out.print(i + " => ");
//            compute(i);
            compute2(i);
            System.out.print(System.lineSeparator());
        }
    }
}
