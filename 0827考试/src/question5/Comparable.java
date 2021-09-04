package question5;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月27日 | 15:49
 * @description: 比较接口
 */
public interface Comparable {

    /**
     * 比较调用者和other的大小
     * @param other
     * @return 返回值>0，表示大于，返回值=0，表示等于，返回值<0，表示小于。
     */
    int compareTo(Object other);

}
