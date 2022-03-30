public class FooBarQix {
    static void compute(int n)
    {
        if(n<10){
            if (n==3)
                System.out.print("Foo");
            else if (n==5)
                System.out.print("Bar");
            else if (n==7)
                System.out.print("Qix");
            return ;
        }
        else{
            compute(n/10);
            if ((n%10)==3)
                System.out.print("Foo");
            else if ((n%10) ==5)
                System.out.print("Bar");
            else if ((n%10)==7)
                System.out.print("Qix");
        }
    }
    static void compute2(int n)
    {
        if(n<10){
            if(n==0)
                System.out.print("*");
            else if (n==3)
                System.out.print("Foo");
            else if (n==5)
                System.out.print("Bar");
            else if (n==7)
                System.out.print("Qix");
            return ;
        }
        else{
            compute(n/10);
            if((n%10)==0)
                System.out.print("*");
            else if ((n%10)==3)
                System.out.print("Foo");
            else if ((n%10) ==5)
                System.out.print("Bar");
            else if ((n%10) ==7)
                System.out.print("Qix");

        }
    }
    public static void main(String args[]) {
        int ok = 0;
       int i=101;
//        for (int i = 1; i <= 53; i++) {
            System.out.print(i + " => ");
             if (i % 3 == 0)
                System.out.print("Foo");
            else if (i % 5 == 0)
                System.out.print("Bar");
            else if (i % 7 == 0)
                System.out.print("Qix");
            else
                 System.out.print(i + " ");
            if(i>=10){
//                compute(i);
                compute2(i);
            }
            System.out.print(System.lineSeparator());
//        }
    }
}
