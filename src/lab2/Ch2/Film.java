package lab2.Ch2;

public class Film {
    private int anAparitie;
    private String nume;
    private Actor[] actors;

    public Film(int anApartitie, String nume, Actor[] actors){
        this.anAparitie = anApartitie;
        this.nume = nume;
        this.actors=actors;
    }

    public Actor[] getActors() {
        return actors;
    }

    public String getNume() {
        return nume;
    }
}
