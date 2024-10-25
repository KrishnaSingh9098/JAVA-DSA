public class UnaryOperators {
    public static void main(String[] args) {
        // Declare a variable
        int number = 10;

        // Unary plus
        int positive = +number;
        System.out.println("Unary Plus: " + positive); // Output: 10

        // Unary minus
        int negative = -number;
        System.out.println("Unary Minus: " + negative); // Output: -10

        // Increment operator (prefix)
        int prefixIncrement = ++number;
        System.out.println("Prefix Increment: " + prefixIncrement); // Output: 11
        System.out.println("Current value of number: " + number); // Output: 11

        // Decrement operator (prefix)
        int prefixDecrement = --number;
        System.out.println("Prefix Decrement: " + prefixDecrement); // Output: 10
        System.out.println("Current value of number: " + number); // Output: 10

        // Reset number for postfix demonstration
        number = 10;

        // Increment operator (postfix)
        int postfixIncrement = number++;
        System.out.println("Postfix Increment: " + postfixIncrement); // Output: 10
        System.out.println("Current value of number: " + number); // Output: 11

        // Decrement operator (postfix)
        int postfixDecrement = number--;
        System.out.println("Postfix Decrement: " + postfixDecrement); // Output: 11
        System.out.println("Current value of number: " + number); // Output: 10
    } 
}
