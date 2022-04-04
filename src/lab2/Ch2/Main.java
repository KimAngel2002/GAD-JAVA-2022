package lab2.Ch2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public String[] afisareStudio(Studio studios[]) {
        ArrayList<String> result = new ArrayList<>();
        for(int i=0; i< studios.length; i++){
            if (studios[i].getFilme().length > 2) {
                result.add(studios[i].getNume());
            }
        }
        return result.toArray(new String[0]);
    }

    public String[] afisareStudioActors(Studio studios[]){
        ArrayList<String> result = new ArrayList<>();
        for(Studio s : studios){
            for(Film f : s.getFilme())
                for(Actor a : f.getActors()){
                    if(a.getNume().equals("actor cu 2 oscaruri"))
                        result.add(s.getNume());
                }
        }
        return result.toArray(new String[0]);
    }

    public static String[] afisareNumeFilme(Film films[]){
        ArrayList<String> result = new ArrayList<>();
        for(Film f : films)
            for(Actor a : f.getActors()){
                if(a.getVarsta() > 50)
                    result.add(f.getNume());
            }
        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Premiu oscar1990 = new Premiu("oscar", 1990);
        Premiu oscar2000 = new Premiu("oscar", 2000);
        Premiu oscar2010 = new Premiu("oscar", 2010);
        Premiu oscar2018 = new Premiu("oscar", 2018);

        Actor actorOscar1990 = new Actor("actor cu 2 oscaruri", 35, new Premiu[]{oscar1990,oscar2000});
        Actor actorOscar2010 = new Actor("actor cu oscar din 2000",55, new Premiu[]{oscar2010});
        Actor actorOscar2018 = new Actor("actor cu oscar din 2018", 23, new Premiu[]{oscar2018});
        Actor actorFaraPremii01 = new Actor("actor fara oscar 01",33, new Premiu[]{});
        Actor actorFaraPremii02 = new Actor("actor fara oscar 02",60, new Premiu[]{});
        Actor actorFaraPremii03 = new Actor("actor fara oscar 02",20, new Premiu[]{});

        Film film1 = new Film(1990, "film cu actori de oscar", new Actor[]{});
        Film film2 = new Film(2010, "film cu actori fara premii2", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film3 = new Film(2010, "film cu actori fara Premii03", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film4 = new Film(2018, "film cu actori de oscar", new Actor[]{actorOscar2010, actorOscar2018,actorFaraPremii02});
        Film film5 = new Film(2019, "film cu actori fara premii5", new Actor[]{actorFaraPremii02, actorFaraPremii03});

        Studio studio1 = new Studio("MGM", new Film[]{film1, film2});
        Studio studio2 = new Studio("Disney", new Film[]{film3,film4,film5});

        Studio[] studioDatabase = new Studio[]{studio1, studio2};

//        String[] numeee = afisareNumeFilme(studioDatabase[1].getFilme());
//        for(String z : numeee){
//            System.out.println(z);
//        }
    }
}