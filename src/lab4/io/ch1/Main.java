package lab4.io.ch1;

public class Main {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook("src/lsb4/io/ch1/input.txt");
        System.out.println(pb.getContactByName("Abbey"));
    }
}
