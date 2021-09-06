package question4;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年09月03日 | 14:22
 * @description:
 */
public class TestMain {

    public static void main(String[] args) {

        //显卡
        PCI videa = new VideaCard();
        videa.send();

        //声卡
        PCI audio = new AudioCard();
        audio.send();

        //网卡
        PCI network = new NetCard();
        network.send();




    }

}
