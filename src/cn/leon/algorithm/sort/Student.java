package cn.leon.algorithm.sort;

//1.定义一个学生类Student,具有年龄age和姓名username两个属性,并通过Comparable接口提供比较规则;
public class Student implements Comparable<Student>{
    public String name;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
