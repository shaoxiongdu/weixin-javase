package practice;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/17
 * @description:
 */
public class Print3Divide {

    public static void main(String[] args) {

        print3Divide(100,200);

    }

    public static void print3Divide(int begin, int end){

        System.out.println(begin + "~" + end + "之间能被3整除的数有: ");
        for (int i = begin; i <=end ; i++) {

            if(i %3 == 0){
                System.out.print(i + "\t");
            }

        }

    }

}
