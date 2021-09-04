package question5;

import java.util.Random;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月27日 | 15:55
 * @description:
 */
public class StudentTest {

    public static void main(String[] args) {

        Random random = new Random();

        Student[] students = new Student[10];

        //随机生成学生
        for (int i = 0; i < students.length; i++) {

            Student student = new Student();
            student.setAge(random.nextInt(20));
            student.setScore(random.nextInt(100));
            student.setId((i + 1) + "");
            student.setName((i + 1) + "号学生");
            students[i] = student;
        }

        System.out.println("---------------------------排序之前:--------------------- ");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        //按照分数排序 冒泡算法
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j + 1].compareTo(students[j]) > 0) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        System.out.println("---------------------------排序之后:--------------------- ");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }



    }

}
