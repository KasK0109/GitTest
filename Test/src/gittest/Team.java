package gittest;

import java.util.ArrayList;

public class Team
{
    private String navn;

    public Team(String navn)
    {
        this.navn = navn;
    }

    @Override
    public String toString()
    {
        return "Team{" +
                "navn='" + navn + '\'' +
                '}';
    }

    /* aggregering -> 0..* Student*/
    private final ArrayList<Person> persons = new ArrayList<>();

    private void addPerson(Person person)
    {
        persons.add(person);
    }
}
