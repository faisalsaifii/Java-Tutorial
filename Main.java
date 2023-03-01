import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

import packages.Pi;

// Class
class Example {
    // Access modifiers: public, private, protected
    // public -> can be accessed through an object and through a function
    public int publicNumber;
    private int privateNumber;
    protected int protectedNumber;

    public void setNumbers(int a, int b, int c) {
        publicNumber = a;
        privateNumber = b;
        protectedNumber = c;
    }

    public void showNumbers() {
        System.out.printf("%d, %d, %d\n", publicNumber, privateNumber, protectedNumber);
    }
};

// Interface
// Achieves abstraction
interface MyInterface {

}

// Main Class
public class Main {
    // Main Function
    public static void main(String[] args) {
        // Single line comment
        /* 
            Multi Line Comment
        */
        // Printing strings
        System.out.println("First Println"); // Println
        System.out.println("Second Println"); // Adds a new line by default

        System.out.print("First print "); // Print
        System.out.print("Second print\n"); // Doesn't add a new line, use \n to add a new line

        System.out.printf("%d %d", 1, 2); // Printf -> C Function

        // Printing multiple strings
        System.out.println("First " + "Second");

        //Printing numbers
        System.out.println(1+5/2*3); // Performs the operations automatically

        // Identifiers
        // Rules to naming variables, functions, etc.
        // 1. Begin with small letter
        // 2. No whitespace
        // 3. Can start with $ and _ but not preferred
        // 4. Case sensitive
        // 5. No use of reserved words like int, boolean, etc.
        // 6. Can contain numbers, letters, underscores, dollar sign.

        // Data Types

        // NON PRIMITIVE DATATYPES
        System.out.print("String Datatype: ");
        String str = "String";
        System.out.println(str);
        // Array
        // Classes

        // PRIMITIVE DATATYPES

        // Byte
        // 1 byte
        // Range: -128 to 127
        System.out.print("Byte Datatype: ");
        byte by = 127;
        System.out.println(by);

        // Integer : Whole Number
        // 4 Bytes
        // Range: -2,147,483,648 to 2,147,483,647
        System.out.print("Integer Datatype: ");
        int i = 2147483647;
        System.out.println(i);

        // Floating Point Numbers
        // 4 Bytes
        // Range: 7 decimal places
        System.out.print("Float Datatype: ");
        float f = 1e10f;
        System.out.println(f);

        // Double
        // 8 bytes
        // Range: 15 decimal places
        System.out.print("Double Datatype: ");
        double db = 1.123456789012345d;
        System.out.println(db);

        // Long
        System.out.print("Long Datatype: ");
        long l = 123456789L;
        System.out.println(l);

        // Short
        System.out.print("Short Datatype: ");
        short s = 32767;
        System.out.println(s);

        // Character
        // 2 Bytes
        // Single character/letter or ASCII value
        System.out.print("Character Datatype: ");
        char ch = 'a';
        System.out.println(ch);

        // Boolean
        // 1 byte
        // Range: true or false
        System.out.print("Boolean Datatype: ");
        boolean isBool = true;
        System.out.println(isBool);

        // DATA STRUCTURES

        // Array
        System.out.print("Array Data Structure: ");
        int arr[] = {1,2,3};
        System.out.println(arr[0]);

        // Declartion of array
        int[] arr2 = new int[10/* Size of array */];

        // Fill function
        Arrays.fill(arr2, 1);

        // Print array
        System.out.println("Array 2: " + Arrays.toString(arr2));

        int[] arr3 = new int[10];

        // For loop
        // Assingning array elements traditionally
        for(i=0; i<arr3.length; i++) {
            arr3[i] = arr3.length - i;
        }

        // For Each loop
        // easier way to get each element of an array
        for(int ele: arr3) {
            System.out.println(ele);
        }

        // Declating one value to multiple variables
        int x, y, z;
        x = y = z = 50;
        System.out.println(x + y + z);

        // Adding strings
        String firstName = "Faisal";
        String lastName = "Saifi";
        String name = firstName + " " + lastName;
        System.out.println(name);

        // Object
        Example example = new Example();
        example.setNumbers(10, 20, 30);
        example.showNumbers();

        // Package
        Pi pi = new Pi();
        pi.printPi();

        // HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Put elements
        map.put(1, "Faisal");
        map.put(2, "Not Faisal");

        // Print
        System.out.println(map.toString());;

        // Get
        // Takes a key and returns the value
        System.out.println(map.get(1));
        
        // Checking presence of key and value in HashMap
        System.out.println("Contains key: " + map.containsKey(1));
        System.out.println("Contains Value Faisal: " + map.containsValue("Faisal"));
        
        // Take input
        Scanner sc = new Scanner(System.in);
        // For strings we take the whole line as input
        String str2 = sc.nextLine();
        System.out.println(str2);
        // For numbers we take input of int first and then line
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println(n);
        sc.close();

        // If Else if else Statement
        int n1 = 2, n2 = 3;
        if(n1>n2) {
            System.out.println("n1 > n2");
        } else if (n1<n2) {
            System.out.println("n1<n2");
        }
        else {
            System.out.println("n1 == n2");
        }
    }

    // Returning array without assignment
    public int[] returnArray() {
        return new int[] {1,2,3};
    }
}