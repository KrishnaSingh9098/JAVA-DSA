package Methods;

public class ExampleOne {

    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void printHello(String name) {
        System.out.println("HELLO " + name);
    }

    public static void main(String[] args) {
        printHello("KRISHNA PRATAP SINGH");
        System.out.println(add(5, 4)); 
    }
}
