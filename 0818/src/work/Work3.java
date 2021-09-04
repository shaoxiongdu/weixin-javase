package work;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/18
 * @description:
 */
public class Work3 {

    public static void main(String[] args) {

        int [] random = new int[6];
        //大于4统计
        int moreFouRCount = 0,min = Integer.MAX_VALUE,max = Integer.MIN_VALUE;
        for (int i = 0; i < random.length; i++) {
            random[i] =(int) (10 * Math.random());
            if(random[i] >=4){
                moreFouRCount++;
            }
            if(random[i] > max) max = random[i];
            if(random[i] < max) min = random[i];
        }

        for (int i : random) {
            System.out.print(i + "\t");
        }

        System.out.println("\n大于等于4的数共有" + moreFouRCount);

        System.out.println("max = " + max);
        System.out.println("min = " + min);



    }

}
