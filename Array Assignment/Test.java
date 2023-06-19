// Simple array & 2D arrayDeclaration

class test {

    public static void main (String[] args){

        int a[]={ 12, 13, 132, 323, 323};

        for (int i=0;i<=4;i++){
            System.out.println(  a[i]);
        }
       
        //  2D Array
         int b[][]={ 
            {21,12,32},
            {23,23,322},
            {24,86,32},
            {67,98,232}
         };


          for (int j=0;j<=3;j++){
            for (int k=0;k<=2;k++){
                  System.out.print( "  "+ b[j][k]);
            }
           System.out.println();;
         }

    }
}