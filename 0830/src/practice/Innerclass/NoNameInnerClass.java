package practice.Innerclass;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月30日 | 10:01
 * @description:
 */
public class NoNameInnerClass {

    public static void main(String[] args) {

        Thread thread = new Thread(){
            @Override
            public void run() {

                while (true){
                    System.out.println(System.nanoTime());
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        thread.run();

    }

}
