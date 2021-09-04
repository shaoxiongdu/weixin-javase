package work;

import java.util.Scanner;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/18
 * @description:
 */
public class Work2 {

    public static void main(String[] args) {

        String [] words = {
                "Java",
                "JVM",
                "MySQL",
                "HTML",
                "css",
                "JavaScript",
                "JavaWeb",
                "JavaEE",
                "Spring",
                "SpringMVC",
                "MyBatis",
        };

        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入一个单词: ");
        String keyWord = scanner.nextLine();

        for (int i = 0; i < words.length; i++) {

            if(words[i].equals(keyWord)){
                System.out.println("Yes point: " + i);
                return;
            }
            System.out.println("No!");

        }





    }

}
