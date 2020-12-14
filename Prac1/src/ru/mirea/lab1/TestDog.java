package ru.mirea.lab1;

public class TestDog {
    public static void main(String[] args) {
        //Dog
        Dog d1 = new Dog("Mike", 2);
        Dog d2 = new Dog("Helen", 7);
        Dog d3 = new Dog("Bob");
        d3.setAge(1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();

        System.out.println();

        //Ball
        Ball b1 = new Ball("Basketball", "orange", 10);
        Ball b2 = new Ball("Golf","white", 1);
        Ball b3 = new Ball();
        b3.setTypeOfSport("Tennis");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        System.out.println();

        //Book
        Book book1 = new Book("Sherlock", "Artur", 500);
        Book book2 = new Book("Game", "Martin", 1000);
        Book book3 = new Book();
        book3.setAuthor("Pushkin");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}
