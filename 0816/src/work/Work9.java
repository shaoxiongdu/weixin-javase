package work;

import java.util.Scanner;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/16
 * @description:
 */
public class Work9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //外层控制班级
        for (int i = 1; i <=3 ; i++) {

            //最高分
            double max=0.0, min=0.0, sum=0;

            //循环10次 十个学生
            for (int j = 1; j <= 10; j++) {
                System.out.print("请输入第" + i + "个班中第" + j + "个同学的成绩: ");
                //读取分数
                double score = scanner.nextDouble();
                //如果当前判断的值比之前的最大值还大  就将之前的最大值设置为当前值
                if(score > max) {
                    max = score;
                }
                //如果当前判断的值比之前的最小值还小  就将之前的最小值设置为当前值
                if(score < min) {
                    min = score;
                }
                //当前循环的学生成绩累加到班级的分数总和
                sum += score;
            }
            System.out.println("第" + i + "个班级中\n\t最高分:" + max + "\t最低分:" + min + "\t平均分:" + sum/10);

        }

    }

}
