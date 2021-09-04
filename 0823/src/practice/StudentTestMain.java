package practice;

import java.util.Scanner;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/23
 * @description:
 */
public class StudentTestMain {

    public static void main(String[] args) {

        Stu student = new Stu(4);

        Scanner scanner = new Scanner(System.in);
        while (true){

            System.out.print("请输入学生姓名(n结束): ");

            String name = scanner.next();
            if("n".equals(name)){
                break;
            }
            student.add(name);
        }

        student.show();

        while (true){
            System.out.print("\n查找姓名(n结束): ");
            String name = scanner.next();
            if("n".equals(name)) break;
            int index = student.find(1,student.size(),name);
            if( index >= 0){
                System.out.println("存在:"+name+",位置在" + (index + 1));
            }else {
                System.out.println("不存在" + name);
            }
        }

        System.out.println("程序结束");


    }

}
