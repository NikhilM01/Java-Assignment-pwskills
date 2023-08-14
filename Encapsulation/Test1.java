class Student {
    private int age;
    private String name;

    public void setAge(int age) {
        this.age = age;

    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    // public void show() {
    //     System.out.println(age + " " + name);
    // }
}

public class Test1 {
    public static void main(String[] args) {
        Student obj = new Student();
        Student obj1 = new Student();
        obj.setAge(19);
        obj1.setAge(23);
        obj.setName("Nikhil");
        obj1.setName("Pragati");
        int stud1Age = obj.getAge();
        String stud1Name = obj.getName();
         int stud2Age = obj1.getAge();
        String stud2Name = obj1.getName();
        System.out.println(stud1Age);
        System.out.println(stud1Name);
        System.out.println(stud2Age);
        System.out.println(stud2Name);
    }
}

// OUTPUT
// 19
// Nikhil
// 23
// Pragati