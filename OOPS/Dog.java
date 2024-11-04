package OOPS;

class Dog {
    // Attribute
    private String name;

    // Constructor
    public Dog(String name) {
        this.name = name;
    }

    // Method
    public String bark() {
        return name + " says woof!";
    }

    public static void main(String[] args) {
        // Creating an object of the Dog class
        Dog myDog = new Dog("Buddy");
        System.out.println(myDog.bark());  // Output: Buddy says woof!
    }
}

