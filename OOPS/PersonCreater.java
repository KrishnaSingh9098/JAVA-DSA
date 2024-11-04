package OOPS;

public class PersonCreater {
    public static void main(String[] args) {
        //Code to craete the person Object
        Person person = new Person("Akansha",52,56,"Red");  // use new for creating an object   new keyword ke baad constructor hai or by default present hai;
        System.out.println("person : "  +person );
        // person.agre=55;
        // person.height=5;
        // person.eyeColor="Red";
        // person.name="JAMBO";

        Person person1 = new Person("Krishna",99,6,"Blaxk");
        System.out.println(person1);
        Person person2 = new Person("Manshi",17,5,"Black");
        System.out.println("p3"+ person2);
        person.eat();
        person.walk();
        
        person.speak();
        person1.speak();
        person2.speak();
    }
}
