package lab2.Ch1;

public class Main {
    public static void main(String[] args) {
        System.out.println("some");

        Fighter fighter1 = new Fighter(100,20,"Kitana");
        Fighter fighter2 = new Fighter(100,10,"Sakura");
        BoxingMatch bm = new BoxingMatch(fighter1, fighter2);

        Fighter winner = bm.fight();
        System.out.println("Winner= " + winner.getName());
    }
}
