package work.work2;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月27日 | 17:42
 * @description:
 */
public class Printer {

    /**
     * 打印机名字
     */
    private String name;

    public void print(InkCartridge inkCartridge, Paper paper){
        System.out.println(name + "打印机使用" + inkCartridge.getColor() + "墨盒在" + paper.getSize() + "寸纸张上打印");
    }

    public Printer(String name) {
        this.name = name;
    }
}
