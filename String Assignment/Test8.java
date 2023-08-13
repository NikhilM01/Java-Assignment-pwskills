public class Test8 {

    public static void main(String args[]) {

        StringBuffer s1 = new StringBuffer("Virat");
        StringBuilder s2 = new StringBuilder("Nikhil");

        s1.append("kohli");
        s2.append("MUneshwar");

        System.out.println(s1);
        System.out.println(s2);


        // Final vs Immutability
        final int a=10;
       // a=20;   error
        System.out.println(a);
        final StringBuffer sb=new StringBuffer("Virat");
        sb.append("kohli");
        // System.out.println(sb);
       // sb=new StringBuffer("Sachin");  error
        System.out.println(sb);

    }

}
