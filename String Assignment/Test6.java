import java.util.Arrays;
import java.util.Scanner;

public class Test6 {
    public static void main(String arg[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string 1 : ");
        String s1 = scan.nextLine();
        System.out.println("Enter the string 2 : ");
        String s2 = scan.nextLine();

        // remover spaces
        s1 = s1.replace(" ", "");
        s2 = s2.replace(" ", "");

        // convert to lowercase/uppercase
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        //convert to an array
        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();

        //sort the array
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        //compare the arrays
        if (arr1.equals(arr2))
        {
            System.out.println("Given string is Anagram");
        }else
        {
            System.out.println("Given string is Anagram");

        }

    }

}



// Output
// Enter the string 1 : SChool Master
// Enter the string 2 : The Classroom
// Given string is Anagram