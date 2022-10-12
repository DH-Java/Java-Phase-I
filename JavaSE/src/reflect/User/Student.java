package reflect.User;

public class Student {
    public int no;
    private String name;
    protected boolean bex;
    int age;

    public Student() {
        System.out.println("无参构造");
    }

    public Student(int no) {
        this.no = no;
    }

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public Student(int no, String name, boolean bex, int age) {
        this.no = no;
        this.name = name;
        this.bex = bex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", bex=" + bex +
                ", age=" + age +
                '}';
    }
}
