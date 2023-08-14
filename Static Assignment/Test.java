class Student {
    int age = 20; // instance variable, non - static variable
    static String name; // non - instance variable, static variable

    static {
        name = "Nikhil";
    }

    public void show() {
        System.out.println("in show " + age + " " + name); // static variable can be accessed in non-static method
    }

    public static void study() {
        System.out.println("studying "); // non-static variable cannot be accessed here
    }
}

public class Test {

    static {
        System.out.println("in static block");
    }

    public static void main(String[] args) {

        System.out.println("in main method");

        Student obj = new Student();

        Student.study();
        obj.age = 19;
        obj.name = "PWSkills";

        Student obj1 = new Student();
        System.out.println(obj1.name);

        obj.show(); // in show 19 PWSkills
        obj1.show(); // in show 0 ?

    }
}

// in static block
// in main method
// studying 
// PWSkills
// in show 19 PWSkills
// in show 20 PWSkills