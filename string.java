public class string {
    public static void main (String[] args){
        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1 + " " + s2;  //concatenation
        System.out.println(s3);
        String s4 = s1.toUpperCase();  //to uppercase
        System.out.println(s4);
        String s5 = s2.toLowerCase();  //to lowercase
        System.out.println(s5);
        int length = s3.length();       //length of string
        System.out.println("Length of s3: " + length);
        char ch = s3.charAt(0);         //character at index
        System.out.println("Character at index 0: " + ch);
        boolean contains = s3.contains("Hello");  //check if string contains substring
        System.out.println("s3 contains 'Hello': " + contains);
        System.out.println();
        System.out.println();

        StringBuffer sb = new StringBuffer ("Java");
        sb.capacity();
        sb.append(" language "); 
        sb.insert (4, " is fun");
        System.out.println(sb);
    }
}
