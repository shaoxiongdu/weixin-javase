package practice;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/23
 * @description:
 */
public class StudentList {

    static class Student{
        String name;
        int age;
        int score;
        int id;

        public Student(String name, int age, int score, int id) {
            this.name = name;
            this.age = age;
            this.score = score;
            this.id = id;
        }

        @Override
        public String toString() {
            return "学生{" +
                    "姓名='" + name + '\'' +
                    ", 年龄=" + age +
                    ", 分数=" + score +
                    ", 编号=" + id +
                    '}';
        }
    }

    public static void main(String[] args) {

        StudentList studentList = new StudentList();

        studentList.addStudent(new Student("张三",18,80,1001));
        studentList.addStudent(new Student("李四",22,90,1002));
        studentList.addStudent(new Student("王五",33,980,1003));

        studentList.show();

    }

    private List<Student> studentList = new ArrayList<>();

    public void addStudent(Student student){
        studentList.add(student);
    }

    public void show(){

        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i));
        }

    }



}


