package practice;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/18
 * @description:
 *
 *  冒泡排序:
 *
 *     每次遍历都判断相邻两个数字，按照需要进行互换
 *     直到遍历完所有的元素
 *
 */
public class popSort {

    public static void main(String[] args) {

        int [] arrays ={5,2,8,9,1,7};

        for (int i = 0; i < arrays.length; i++) {

            for (int j = 0; j < arrays.length - 1 - i; j++) {

                if(arrays[j] > arrays[j+1]){

                    int temp = arrays[j];
                    arrays[j] = arrays[j+1];
                    arrays[j+1] = temp;

                }

                System.out.print("第" + (i+1) + "轮第"+(j+1)+"次: ");
                System.out.print(arrays[j] + "和" + arrays[j+1] + "判断后 ");
                for (int array : arrays) {
                    System.out.print(array + "\t");
                }
                System.out.println();

            }

        }

        for (int array : arrays) {
            System.out.println(array);
        }

    }

}
