package lab1;

public class FizzBuzz {
    public static void main(String args[]) {
        int ok = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                ok = 1;
                System.out.print("Fizz");
            }
            if (i % 5 == 0) {
                ok = 1;
                System.out.print("Buzz");
            }
            if (i % 7 == 0) {
                ok = 1;
                System.out.print("Rizz");
            }
            if (i % 11 == 0) {
                ok = 1;
                System.out.print("Jazz");
            }
            if (ok == 0)
                System.out.print(i);
            ok = 0;
            if(i<100)
                System.out.print(", ");
        }
    }
}