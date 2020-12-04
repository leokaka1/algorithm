package cn.leon.algorithm.test;


import cn.leon.algorithm.sort.Student;

//2.定义测试类Test,在测试类Test中定义测试方法Comparable getMax(Comparable c1,Comparable c2)完成测试
public class Test {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("张三");
        student1.setAge(18);

        Student student2 = new Student();
        student2.setName("李四");
        student2.setAge(29);

        Comparable comparable =  getMax(student1,student2);
        System.out.println(comparable);
    }

    public static Comparable getMax(Comparable c1, Comparable c2){
        int reslut = c1.compareTo(c2);

        // 1. 如果reslut > 0 ,则c1 比 c2 大
        // 2. 如果result < 0 ，则c1比c2 小
        // 3. 如果result == 0 则c1 和 c2 一样大
        if (reslut>=0){
            return c2;
        }else {
            return c1;
        }
    }
}
