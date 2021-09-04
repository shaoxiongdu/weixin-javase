package question5;

import java.util.Random;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月27日 | 15:55
 * @description: 新闻测试类
 */
public class NewsTest {

    public static void main(String[] args) {

        Random random = new Random();

        News[] news = new News[10];

        //随机生成新闻
        for (int i = 0; i < news.length; i++) {
            News new1 = new News();
            new1.setId(random.nextInt(100));
            new1.setClickCount(random.nextInt(1000));
            new1.setContent("第" + (i + 1) + "新闻的正文......");
            new1.setTitle("第" + (i + 1) + "新闻的标题");
            news[i] = new1;
        }

        System.out.println("---------------------------排序之前:--------------------- ");
        for (int i = 0; i < news.length; i++) {
            System.out.println(news[i]);
        }

        //按照分数排序  冒泡算法
        for (int i = 0; i < news.length - 1; i++) {
            for (int j = 0; j < news.length - 1 - i; j++) {
                if (news[j].compareTo(news[j + 1]) > 0) {
                    News temp = news[j];
                    news[j] = news[j + 1];
                    news[j + 1] = temp;
                }
            }
        }

        System.out.println("---------------------------排序之后:--------------------- ");
        for (int i = 0; i < news.length; i++) {
            System.out.println(news[i]);
        }

    }

}
