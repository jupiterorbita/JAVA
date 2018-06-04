public class StringDemo{
    public static void main(String[] args){
        String ninja = "I wanna be a ninja";
        int length = ninja.length();
        System.out.println("String lenght is: "+length);

        String str1 = "My name is ";
        String str2 = "John";
        String str22 = " and i like pizza!";
        String str3 = str1.concat(str2).concat(str22);
        System.out.println(str3);

        System.out.println("Welcome "+"Home!");

        // float bb = 23.50;
        ninja = String.format("string= %s, a float= %.2f", "hello",23.4456);
        System.out.println(ninja);

        String SomeStr = "Welcome to Coding Dojo!";
        int a = SomeStr.indexOf("Coding");
        int b = SomeStr.indexOf("co");
        int c = SomeStr.indexOf("pizza");
        System.out.println(a+", "+b+", "+c);

        String sentence = "   spaces everwhere!   ";
        System.out.println(sentence.trim());

        String Astr = "HELLO";
        String Bstr = "world";
        System.out.println(Astr.toLowerCase()); // hello
        System.out.println(Bstr.toUpperCase()); // WORLD

        String a_str = new String("word");
        String b_str = new String("word");
        System.out.println(a_str == b_str); // false. not the same exact object.
        System.out.println(a_str.equals(b_str)); // true. same exact characters.
    }
}
