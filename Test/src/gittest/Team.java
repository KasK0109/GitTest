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

    //--------------------------------------------------------------
    /* aggregering -> 0..* Student*/
    //private final ArrayList<Person> persons = new ArrayList<>();

    private void addPerson(Person person)
    {
        persons.add(person);
    }

    //--------------------------------------------------------------
    public double averageAge()
    {
        double totalAge = 0;
        for (Person p : persons)
        {
            totalAge += p.getAge();
        }
        return totalAge / persons.size();
    }
}
