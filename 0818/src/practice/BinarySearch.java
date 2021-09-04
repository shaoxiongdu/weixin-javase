package practice;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/18
 * @description:
 *
 *  二分查找
 *
 */
public class BinarySearch {

    public static void main(String[] args) {

        int [] numbers = {1,2,3,4,5,6,7,8,9,10};

        int low = 0,high = numbers.length;

        int target = 6;

        while (low <= high){

            int mid = (low + high) / 2;

            if(numbers[mid] == target){
                System.out.println(target + "所在位置: " + mid);
                return;
            }else if(numbers[mid] < target){
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        System.out.println("没有找到!");


    }

}
