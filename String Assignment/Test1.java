public class Test1 {
    public static void main(String[] args) {

        String s1 = "nikhil";
        String s2 = "nikhil";
        String s3 = new String("nikhil");
        String s4 = new String("nikhil");
        String s5 = "NiKHil";

        System.out.println(s1 == s2);
        System.out.println(s1 == s3); // here we comaparing the reference
        System.out.println(s1.equals(s3)); // here we comaparing the value
        System.out.println(s1 == s5); // case-sensitive
        System.out.println(s1.equalsIgnoreCase(s5)); // here it ignore the case
    }

}
