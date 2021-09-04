package practice;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/19
 * @description:
 */
public class Practice1 {

    public static void main(String[] args) {

        int oldArr[] = {1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};

        //记录0的次数
        int zeroCount = 0;
        for (int n : oldArr){
            if(n == 0){
                zeroCount++;
            }
        }

        //新数组
        int newArr[] = new int[oldArr.length - zeroCount];

        for (int i = 0,j = 0; i < oldArr.length; i++) {

            if(oldArr[i] != 0){

                newArr[j++] = oldArr[i];

            }

        }

        for (int i : newArr) {
            System.out.println(i);
        }


    }

}
