public class Test2 {
    public static void main(String[] args) {

        String s1 = "nikhil";
        String s2 = " muneshwar";
        String s3 = new String("nikhil");
        String s4 = new String(" muneshwar");

        s1=s1.concat(" muneshwar"); 
        s3=s3.concat(s4);  
        String s5 = s1 +s2;

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5  + s1 + s4);
    

       
    }

}
