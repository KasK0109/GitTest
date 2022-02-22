package gittest;

public class Main {
    public static void main(String[] args) {


        Person p1 = new Person("Hans", 30);
        Person p2 = new Person("Ulla", 31);

        System.out.println("Navn: " + p1.getName() + " Alder: " + p1.getAge());
        System.out.println("Navn: " + p2.getName() + " Alder: " + p2.getAge());

        //commit1 fra Jesper
    }
}
