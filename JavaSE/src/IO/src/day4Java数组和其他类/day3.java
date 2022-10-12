package IO.src.day4Java数组和其他类;

import java.util.Objects;

class equals {
    public static void main(String[] args) {
        student s = new student(20602060,"渝北中学");
        student s1 = new student(20602060,"渝北中学");
        System.out.println(s==s1);
        System.out.println(s.equals(s1));
        /*String s1 = "hello";equals方法的使用
        String s2 = "hello";
        System.out.println(s1==s2);
        String s3 = new String ("test");
        String s4 = new String("test");
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));*/
    }
}

class student{
    //学号
    int no;
    //所在学校
    String school;

    public student() {
    }

    public student(int no ,String school) {
        this.no = no;
        this.school=school;
    }
    //重写toString方法
    public String toString(){
        return "学号" + no + "所在学校名称"+ school;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        student student = (IO.src.day4Java数组和其他类.student) o;
        return no == student.no && Objects.equals(school, student.school);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, school);
    }
}
