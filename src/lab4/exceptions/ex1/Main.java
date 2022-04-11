package lab4.exceptions.ex1;

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        int res = c.calculateResult(2);
        System.out.println("result= " + res);
        int res2 = c.calculateResult(5);
        System.out.println("result= " + res2);
    }
}
