/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/22
 * @description: 5.输出1-1000之间被5整除的数并且每行输出3个
 */
public class Question5 {

    public static void main(String[] args) {

        for (int i = 1,count=0; i <= 1000; i++) {

            //整除
            if(i % 5 == 0){

                //如果累加3 输出换行 重新赋值0
                if(count == 3){
                    count = 0 ;
                    System.out.println();
                }
                //输出i
                System.out.print(i + "\t");
                //累加
                count++;
            }





        }

    }

}
