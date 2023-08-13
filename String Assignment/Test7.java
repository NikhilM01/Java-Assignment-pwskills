public class Test7 {

    public static void main(String args[]) {
        String s1 = "The quick Brown Fox jumps over Lazy dog";
        boolean flag= false;

        // remove blankspaces
        s1 = s1.replace(" ", "");

        // convert to lowercase / Uppercase
        s1 = s1.toUpperCase();

        //convert to an array
        char arr1[]=s1.toCharArray();

        // create empty array of alphabetes size 
        int arr2[] = new int[26];
 
        for(int i=0; i<arr1.length ;i++)
        {
            arr2[arr1[i]-65]++;
        }

        //check if there is 0's in arr2
        for(int i=0; i<arr2.length;i++)
        {
            if(arr2[i]==0)
            {
            System.out.println("Its not pangram");
            flag= true;
            }
            
        }
        if(flag==false)
        {
            System.out.println("Its is a pangram ");
        }

    }

}
