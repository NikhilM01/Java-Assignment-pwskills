public class Test8 {

    public static void main(String args[]) {

        StringBuffer s1 = new StringBuffer("Virat");
        StringBuilder s2 = new StringBuilder("Nikhil");

        s1.append("kohli");
        s2.append("MUneshwar");

        System.out.println(s1);
        System.out.println(s2);

        // Final vs Immutability
        final int a = 10;
        // a=20; error
        System.out.println(a);
        final StringBuffer sb = new StringBuffer("Virat");
        sb.append("kohli");
        // System.out.println(sb);
        // sb=new StringBuffer("Sachin"); error
        System.out.println(sb);

        //
        StringBuilder s3 = new StringBuilder();
        System.out.println(s3.capacity());
        s3.append("abcdefghijklmnop");
        System.out.println(s3.capacity());
        s3.append("s");
        System.out.println(s3.capacity());  // how many character you can add 16+1 (17*2= 34 size)
        System.out.println(s3.length());  // how mancy character r present

        StringBuffer s32 = new StringBuffer("Sachin");
        System.out.println(s32);
        System.out.println(s32.capacity());
        System.out.println(s32.charAt(1));
        s32.setCharAt(1, 'A'); // SAchin
        System.out.println(s32);

        StringBuilder s4 = new StringBuilder(150);
        System.out.println(s4.capacity());
        s4.append("java");
        System.out.println(s4); // 150
        s4.trimToSize();
        System.out.println(s4.capacity()); // 4

        StringBuilder s5 = new StringBuilder("nikhil");
        System.out.println(s5);
        System.out.println(s5.reverse()); // lihkin

    }

}
