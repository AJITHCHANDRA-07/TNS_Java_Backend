package DEMO_CLASS;

// Class that holds variables and operator logic
public class Demo_Operators {

    // Variables declaration
    int a, b, sum, diff, product, quotient, remainder;

    // Method to perform operations
    void performOperations() {
        // Assigning values
        a = 20;
        b = 6;

        // Arithmetic operations
        sum = a + b;
        diff = a - b;
        product = a * b;
        quotient = a / b;
        remainder = a % b;

        // Displaying results
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
        System.out.println("Addition (a + b): " + sum);
        System.out.println("Subtraction (a - b): " + diff);
        System.out.println("Multiplication (a * b): " + product);
        System.out.println("Division (a / b): " + quotient);
        System.out.println("Remainder (a % b): " + remainder);

        // Relational operator
        System.out.println("Is a equal to b? " + (a == b));
        System.out.println("Is a greater than b? " + (a > b));
        System.out.println("Is a less than b? " + (a < b));

        // Logical operators
        System.out.println("Logical AND (a>10 && b<10): " + (a > 10 && b < 10));
        System.out.println("Logical OR (a<10 || b>5): " + (a < 10 || b > 5));
        System.out.println("Logical NOT (!(a==b)): " + (!(a == b)));
    }
}
