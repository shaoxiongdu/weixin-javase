package work.work2;


import com.apifan.common.random.source.EducationSource;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月27日 | 17:44
 * @description:
 */
public class TestMain {

    public static void main(String[] args) {

        System.out.println(EducationSource.getInstance().randomPrimarySchoolName());

        //打印机
        Printer printer = new Printer("惠普");

        //黑色墨盒
        InkCartridge black = new InkCartridge("黑色");

        //白色墨盒
        InkCartridge white = new InkCartridge("白色");

        //4寸纸张
        Paper paper4 = new Paper(4);

        //5寸纸张
        Paper paper5 = new Paper(5);

        printer.print(black,paper4);
        printer.print(black,paper5);
        printer.print(white,paper4);
        printer.print(white,paper5);

    }

}
