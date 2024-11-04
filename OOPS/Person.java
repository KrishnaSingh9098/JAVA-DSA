package OOPS;

public class Person {
    String name;
    int agre;
    int height;
    String eyeColor;

    public Person(String name, int age, int height, String eyeColor) { // DEfault HARDCODED THINGS /// yha per dynamic
                                                                       // constructor set kar skte hai
        this.name = name;
        this.agre = agre; // TIhis keyRepresents Instance
        this.height = height;
        this.eyeColor = eyeColor;
    }

    public void speak() {
        System.out.println("Speaking my Deatail's My Name is  : " + name + " My Age is :" + agre + " My Height is "
                + height + "  My Eye Color Was" + eyeColor);
    }

    public void eat() {
        System.out.println("I am Eating");
    }

    public void walk() {
        System.out.println("I am Walking");
    }
}
