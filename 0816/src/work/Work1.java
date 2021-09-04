package work;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/16
 * @description:
 */
public class Work1 {

    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 10; i++) {

            if(i % 2 == 0){
                continue;
            }
            sum += i;


        }

        System.out.println("1~10之间的所有偶数和为 ： " + sum);

        for (int i = 0; i < 6; i++) {
            int k = ++i;
            while (k < 5) {
                System.out.print(i);
                break;
            }
        }

        sum=0;
        for(int i=1;i<10;i++){
            do{
                i++;
                if(i%2!=0)
                    sum+=i;
            }while(i<6);
        }
        System.out.println(sum);


    }

}
