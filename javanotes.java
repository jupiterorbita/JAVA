// === JAVA ===
// Data Types
// Primitive Types

// int: integers, like 4 or -51. It is limited to numbers between -2147483648 and 2147483647, or around 2 billion.
// long: larger integers up to 2^63, or around 2 quintillion.
// boolean: one of two values: true or false.
// double:  floating point numbers like 3.14159265 they are far more precise.
// char: store a single character, like '$' or 'A'.

// Object Types

// Integer: The Integer class wraps a value of the primitive type int into an object.
// Long: The Long class wraps a value of the primitive type long in an object.
// Boolean: The Boolean class wraps a value of the primitive type boolean in an object.
// Double: The Double class wraps a value of the primitive type double in an object.
// Character: The Character class wraps a value of the primitive type char in an object.
// String: Represents a sequence of characters, like a Python string.
// BigInteger: Represents an integer that can be any size at all.

// ****Notice that primitive types are lowercase, while object types are capitalized.****

//======================== STRINGS =============================
//!!!!! Since each string is immutable, this results in a brand new string.!!!!
public class StringDemo{
    public static void main(String[] args){
        //String length
        String ninja = "I wanna be a ninja";
        int length = ninja.length();
        System.out.println("String lenght is: "+length);

        String str1 = "My name is ";
        String str2 = "John";
        String str22 = " and i like pizza!";
        //string concatination 
        String str3 = str1.concat(str2).concat(str22);
        System.out.println(str3);

        System.out.println("Welcome "+"Home!");

        // float bb = 23.50;
        //format
        ninja = String.format("string= %s, a float= %.2f", "hello",23.4456);
        System.out.println(ninja);
        // Will print out Hi Jack, you owe me $25.00 !
        // Where %s is expecting a string
        // And %.2f is expecting a float data type. The value 2 will just place two values to right of the decimal point.

        //indexOf
        // IndexOf: The indexOf method searches left-to-right inside the given string for a "target" string. The indexOf() method returns the index number where the target string is first found or -1 if the target is not found.
        String ninja = "Welcome to Coding Dojo!";
        int a = ninja.indexOf("Coding"); // a is 11
        int b = ninja.indexOf("co"); // b is 3
        int c = ninja.indexOf("pizza"); // c is -1, "pizza" is not found
        System.out.println(a+", "+b+", "+c);

        // Trim: The trim() me thod removes any trailing or leading white spaces from the string.
        String sentence = "   spaces everwhere!   ";
        System.out.println(sentence.trim());

        // Uppercase and Lowercase: The String class provides methods to lowercase and uppercase strings.
        String Astr = "HELLO";
        String Bstr = "world";
        System.out.println(Astr.toLowerCase()); // hello
        System.out.println(Bstr.toUpperCase()); // WORLD

        // Equality: We can compare the equality of a string in two ways. Do they refer to the exact same object, or do they have the same exact sequence of characters.
        String a = new String("word");
        String b = new String("word");
        System.out.println(a == b); // false. not the same exact object.
        System.out.println(a.equals(b)); // true. same exact characters.
    }
}
// ============== contditional ===========================
// A condition always returns true or false
// As long as something has a value (Which almost everything in Java does) it can be used in a condition
