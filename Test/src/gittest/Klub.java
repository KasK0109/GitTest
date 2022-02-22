package gittest;

import java.util.ArrayList;

public class Klub {

    private String navn;

    private final ArrayList<Person> medlemmer = new ArrayList<>();

    Klub(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    public ArrayList<Person> getMedlemmer() {
        return new ArrayList<>(medlemmer);
    }

    public void addMedlem(Person person) {
        medlemmer.add(person);
    }

    public void removeMedlem(Person person) {
        medlemmer.remove(person);
    }
}
