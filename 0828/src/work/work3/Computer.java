package work.work3;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月27日 | 17:49
 * @description:
 */
public class Computer {

    private CPU cpu;

    private HardDisk hardDisk;

    private Memory memory;

    @Override
    public String toString() {
        return "计算机{" +
                "cpu=" + cpu +
                ", 硬盘=" + hardDisk +
                ", 内存=" + memory +
                '}';
    }

    public Computer(CPU cpu, HardDisk hardDisk, Memory memory) {
        this.cpu = cpu;
        this.hardDisk = hardDisk;
        this.memory = memory;


    }
}
