package work.work3;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月27日 | 17:54
 * @description:
 */
public class TestMain {

    public static void main(String[] args) {

        CPU inter = new CPU("酷睿", 2.8);

        HardDisk hardDisk = new HardDisk(1024);

        Memory memory = new Memory(8);

        Computer computer = new Computer(inter,hardDisk,memory);

        System.out.println(computer);


    }

}
