package work;

import java.util.Scanner;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/19
 * @description:
 */
public class Work17 {

    public static void main(String[] args) {

        int more85Count = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            System.out.println("请输入第" + (i+1) + "个班级的成绩:");
            int sum = 0;
            for (int j = 0; j < 4; j++) {

                System.out.print("第" + (j+1) + "个学员的成绩: ");

                int score = scanner.nextInt();

                sum += score;

                if(score <= 85){
                    continue;
                }
                more85Count++;

            }
            System.out.println("第" + (i+1) + "个班级平均分为: " + sum / 4.0);

        }

        System.out.println("成绩85分以上的学员有 : " + more85Count);



    }



}
