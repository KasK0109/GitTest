package gittest;

import java.util.ArrayList;

public class Team
{
    private String teamnavn;

    public Team(String navn)
    {
        this.teamnavn = navn;
    }

    @Override
    public String toString()
    {
        return "Team{" +
                "navn='" + teamnavn + '\'' +
                '}';
    }

    /* aggregering -> 0..* Student*/
    private final ArrayList<Person> persons = new ArrayList<>();

    private void addPerson(Person person)
    {
        persons.add(person);
    }
}
