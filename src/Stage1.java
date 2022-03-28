public class Stage1 {
    public static void main(String args[])
    {
        for(int i=1; i<=100; i++){
                //stage 1
            if (i%3==0 && i%5==0)
                System.out.println("FizzBuzz");
            else if(i%3==0)
                System.out.println("Fizz");
            else if(i%5==0)
                System.out.println("Buzz");
            else
                System.out.print(i + System.lineSeparator());
                //stage 2
//            if(i%7==0)
//                System.out.print("Rizz, ");
//            else
//                System.out.print(1+", ");

        }
    }

}
