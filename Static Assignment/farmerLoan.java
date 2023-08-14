import java.util.Scanner;

class farmer {
    int pa;
    float td;
    static float ri;
    float si;

    static {
        ri = 8.5f;
    }

    void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the amount required : ");
        pa = scan.nextInt();
        System.out.println("Enter the time duration : ");
        td = scan.nextFloat();
    }

    void compute() {
        si = (pa * td * ri) / 100f;
    }

    void disp() {
        System.out.println("SI is  : " + si);
    }
}

public class farmerLoan {

    public static void main(String[] args) {
        farmer f1 = new farmer();
        f1.input();
        f1.compute();
        f1.disp();
        farmer f2 = new farmer();
        f2.input();
        f2.compute();
        f2.disp();
    }

}

// OUTPUT : 
// Enter the amount required : 
// 10000
// Enter the time duration :
// 1.5
// SI is  : 1275.0
// Enter the amount required :
// 20000
// Enter the time duration :
// 1.5
// SI is  : 2550.0