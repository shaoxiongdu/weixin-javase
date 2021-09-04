package work;

import java.util.Scanner;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/18
 * @description:
 */
public class Work1 {

    static int [] scores = {99,85,82,63,60,0};

    public static void main(String[] args) {

        System.out.print("请输入新增成绩: ");
        int newScore = new Scanner(System.in).nextInt();

        for (int i = scores.length-2; i >= 0; i--) {

            if(newScore > scores[i]){

                scores[i+1] = scores[i];

            }else {
                scores[i+1] = newScore;
                System.out.println("新成绩插入的下标 : " + (i+1));
                break;
            }

        }

        for (int score : scores) {
            System.out.print(score + "\t");
        }

    }

    /**
     *   将成绩数组按降序排序（插入排序）
     */
    public static void orderBySortDesc(){

        //分界点
        int i = 1;
        while (i < scores.length){

            //当前循环的数字
            int current = scores[i];
            //排好序的最右边
            int j = i -1;

            while (j >= 0){

                if(scores[j] < current){
                    //如果内循环当前位置不合适 ，当前位置的数后移
                    scores[j +1] = scores[j];
                }else {
                    //找到合适的位置 跳出
                    break;
                }
                //继续向前查找
                j--;
            }
            //将当前循环的数字放入合适的位置
            scores[j + 1] = current;

            //分界点后移
            i++;
        }

    }

}
