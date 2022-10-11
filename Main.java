public class Main {
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

        // Printing multiple strings
        System.out.println("First " + "Second");

        //Printing numbers
        System.out.println(1+5/2*3); // Performs the operations automatically

        // Data Types

        // NON PRIMITIVE DATATYPES
        String str = "String";
        System.out.println(str);
        // Array
        // Classes

        // PRIMITIVE DATATYPES

        // Byte
        // 1 byte
        // Range: -128 to 127
        byte by = 127;
        System.out.println(by);

        // Integer : Whole Number
        // 4 Bytes
        // Range: -2,147,483,648 to 2,147,483,647
        int i = 2147483647;
        System.out.println(i);

        // Floating Point Numbers
        // 4 Bytes
        // Range: 7 decimal places
        float f = 1.1234567890f;
        System.out.println(f);

        // Double
        // 8 bytes
        // Range: 15 decimal places
        double db = 1.123456789012345;
        System.out.println(db);

        // Long
        long l = 123456789;
        System.out.println(l);
        // Short
        short s = 32767;
        System.out.println(s);
        // Character
        // 2 Bytes
        // Single character/letter or ASCII value
        char ch = 'a';
        System.out.println(ch);

        // Boolean
        // 1 byte
        // Range: true or false
        boolean bool = true;
        System.out.println(bool);

        // Identifiers
        // Rules to naming variables, functions, etc.
        // 1. Begin with small letter
        // 2. No whitespace
        // 3. Can start with $ and _ but not preferred
        // 4. Case sensitive
        // 5. No use of reserved words like int, boolean, etc.
        // 6. Can contain numbers, letters, underscores, dollar sign.

        // Declating one value to multiple variables
        int x, y, z;
        x = y = z = 50;
        System.out.println(x + y + z);

        // Adding strings
        String firstName = "Faisal";
        String lastName = "Saifi";
        String name = firstName + " " + lastName;
        System.out.println(name);

    }
  }