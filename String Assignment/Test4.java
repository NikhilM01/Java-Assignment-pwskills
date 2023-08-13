import java.util.Scanner;

public class Test4 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the String want to reverse :");
        String s1 = scan.nextLine();
        String s2 = "";
        String s3 = "";
        String s4 = "";

        // Case -1
        for (int i = s1.length() - 1; i >= 0; i--) {
            s2 = s2 + s1.charAt(i);
        }
        System.out.println("Before case-1 : " + s1); // nikhil
        System.out.println("After  case-1 : " + s2); // lihkin

        // Case -2
        String sarr[] = s1.split(" ");

        for (int j = sarr.length - 1; j >= 0; j--) {
            s3 = s3 + sarr[j] + " ";
        }
        System.out.println("Before  case-2 : " + s1); // nikhil is boy
        System.out.println("After  case-2 : " + s3); // boy is nikhil

        // Case -3
        for (String elem : sarr) {
            for (int i = elem.length() - 1; i >= 0; i--) {
                s4 = s4 + elem.charAt(i);
            }
            s4 = s4 + " ";

        }
        System.out.println("Before  case-3 : " + s1); // nikhil is boy
        System.out.println("After  case-3 : " + s4); // lihkin si yob

    }

}