package org.itstep;

import java.util.ArrayList;
import java.util.List;

public class WiseCounting {

    public static void main(String[] args) {
        Emperor emperor = new Emperor("Acbar");
        List<Courtier> courtiers = new ArrayList<>();
        courtiers.add(new Courtier("first courtier"));
        courtiers.add(new Courtier("second courtier"));
        courtiers.add(new Courtier("treti courtier"));
        Verbal verbal = new Verbal("Verbal");
        emperor.asks(0);
        /*for (int i=0; i<courtiers.size(); i++){
            courtiers.get(i).thinks();
        }*/
        /*for (Courtier courtier:courtiers){
            courtier.thinks();
            }*/
        courtiers.forEach(Courtier::thinks);
        verbal.enters();
        verbal.esks();
        emperor.asks(0);
        verbal.replase();
        emperor.asks(1);
        verbal.says();
    }
}
    class Persons{
        private final String name;

        Persons(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
class Emperor extends Persons{
    private final ArrayList<String> questions = new ArrayList<>();

    Emperor(String name) {
        super(name);
        questions.add("\"How many crows are there in this city?\"");
        questions.add("\"How can you be so sure?\"");
    }
    public void asks(int number){
        String s = questions.get(number);
        System.out.println(getName()+" asks: "+s);
    }
    public void looks(){
        System.out.println(getName()+" glanced at his courtiers");
    }
}
class Courtier extends Persons{

    Courtier(String name) {
        super(name);
    }
    public void thinks(){
        System.out.println("Head of the "+getName()+" began to hang low in search of an answer");
    }
}
class Verbal extends Persons{

    Verbal(String name) {
        super(name);
    }
    public void enters(){
        System.out.println(getName()+" enters the courtyard");
    }
    public void esks(){
        System.out.println(getName()+" asks: \"May I know the question so that I can try for an answer?\"");
    }
    public void replase(){
        System.out.println(getName()+" replies: \"There are fifty thousand five hundred and eighty nine crows, my lord\"");
    }
    public void says(){
        System.out.println(getName()+" says: \"Make you men count, My lord. \n"+
                "If you find more crows it means some have come to visit their relatives here.\n"+
                "If you find less number of crows it means some have gone to visit their relatives elsewhere\"");
    }
}