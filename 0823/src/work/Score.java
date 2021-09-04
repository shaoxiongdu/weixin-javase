package work;

import java.util.Scanner;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/23
 * @description:
 */
public class Score {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] scores = new int[3];

        System.out.print("请输入Java成绩: ");
        scores[0] = scanner.nextInt();


        System.out.print("请输入C#成绩: ");
        scores[1] = scanner.nextInt();

        System.out.print("请输入db成绩: ");
        scores[2] = scanner.nextInt();

        Score score = new Score();

        System.out.println("总和为: " + score.sum(scores));
        System.out.println("平均分为: " + score.avg(scores));


    }











    public int sum(int [] scores){

        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return sum;
    }

    public double avg(int [] scores){

        int sum = 0;

        for (int i = 0; i < scores.length; i++) {

            sum += scores[i];

        }

        return (double) sum / scores.length;

    }
}


