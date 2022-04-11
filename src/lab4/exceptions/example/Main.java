package lab4.exceptions.example;

import java.io.IOException;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class Main {
    public static void excetionMethod(int i) throws IOException, SQLDataException {
        if( i==0 )
            throw new IOException();
    }

    public static int test(){
        try{
            System.out.println(-1);
            excetionMethod(1);
            System.out.println(0);
        }catch(IOException | SQLDataException e){
            System.out.println(1);
//            return 1;
        }finally {
            System.out.println(2);
//            return 2;
        }
        System.out.println("after finnaly");
        return 2;
    }

    public static void main(String[] args) {
        System.out.println("result=" + test());
    }
}
