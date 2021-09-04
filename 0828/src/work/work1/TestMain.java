package work.work1;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月27日 | 17:23
 * @description:
 */
public class TestMain {

    public static void main(String[] args) {

        G502c g = new G502c("G502c","索尼爱立信");
        System.out.println(g);

        g.play();
        g.seedMessage();
        g.call();

        System.out.println("----------------------------------");

        I9100 i = new I9100("I9100","HTC");
        System.out.println(i);
        i.online();
        i.playVideo();
        i.camera();
        i.seedMessage();



    }

}
