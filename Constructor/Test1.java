class Student {
    private int age;
    private String name;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // public void setAge(int age) {
    // this.age = age;

    // }

    // public void setName(String name) {
    // this.name = name;

    // }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    // public void show() {
    // System.out.println(age + " " + name);
    // }
}

public class Test1 {
    public static void main(String[] args) {
        Student st1 = new Student("Nikhil", 20);
        Student st2 = new Student("Pragati", 23);

        String stud1Name = st1.getName();
        int stud1Age = st1.getAge();
        String stud2Name = st2.getName();
        int stud2Age = st2.getAge();

        System.out.println("Student 1 : " + stud1Name + " " + stud1Age);
        System.out.println("Student 2 : " + stud2Name + " " + stud2Age);

    }
}

// OUTPUT
// Student 1 : Nikhil 20
// Student 2 : Pragati 23