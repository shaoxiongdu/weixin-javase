package question3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年09月03日 | 14:21
 * @description:
 *
 * 3.由控制台按照固定格式输入学生信息，包括学号，姓名，年龄信息，当输入的内容为exit退出；
 * 将输入的学生信息分别封装到一个Student对象中，
 * 再将每个Student对象加入到一个集合中，要求集合中的元素按照年龄大小正序排序；
 * 最后遍历集合，将集合中学生信息输出到控制台，每个学生数据占单独一行
 *
 */
public class TestMain {

    //存放学生的集合
    private static List<Student> studentList = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //需要录入的信息
        InfoType[] values = InfoType.values();
        //录入结束标志
        boolean isEnd = false;

        //循环录入
        while (!isEnd) {

            Student student = new Student();

            System.out.println("--------------- 第 " + (studentList.size() + 1) + " 个 同 学 -----------------------");
            for (int i = 0; i < 3; i++) {

                System.out.print("请输入该同学的" + values[i] + ":");
                String input = scanner.next();
                if ("exit".equals(input)) {
                    //结束
                    isEnd = true;
                    break;
                }
                switch (i) {
                    //录入姓名
                    case 0:
                        student.setName(input);
                        break;
                    //录入年龄
                    case 1:
                        student.setAge(Integer.parseInt(input));
                        break;
                    case 2:
                        //录入学号
                        student.setId(input);
                        break;
                }
            }
            //如果没结束 添加到容器
            if (!isEnd) {
                studentList.add(student);
            }
            System.out.println("-------------------------------------");
        }

        //传入自定义lambda给函数式接口按照年龄排序并输出
        studentList.stream().sorted(Comparator.comparingInt(Student::getAge)).forEach(System.out::println);

    }

}

/**
 * 需要录入的信息枚举类
 */
enum InfoType{
    姓名,
    年龄,
    学号;
}
