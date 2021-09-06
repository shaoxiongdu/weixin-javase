package work.work3.service;

import work.work3.bean.AIPlayer;
import work.work3.bean.HumanPlayer;
import work.work3.bean.Player;
import work.work3.bean.Select;

import java.util.Scanner;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月31日 | 17:03
 * @description:
 */
public class Game {

    /**
     * 电脑玩家
     */
    private AIPlayer player1;

    /**
     * 人类玩家
     */
    private HumanPlayer player2;

    private void init(){

        player1 = new AIPlayer("布里茨");

        System.out.println("********* 欢 迎 来 到 猜 拳 游 戏 ! *************");

        System.out.print("请输入您的姓名: ");
        String userName = new Scanner(System.in).next();

        this.player1 = new AIPlayer("布里茨");
        this.player2 = new HumanPlayer(userName);

    }

    /**
     * 启动游戏
     * @throws InterruptedException
     */
    public void start() throws InterruptedException {

        //初始化数据
        init();

        while (true){
            System.out.println("-------------------------------------------");
            System.out.println("1.开始游戏\n2.玩法说明 \n3.积分榜\n4.退出游戏");
            System.out.println("-------------------------------------------");
            System.out.print("请选择: ");
            switch (new Scanner(System.in).nextInt()){

                case 1: {
                    System.out.println("********* 游 戏 开 始 ***********");
                    while (true){
                        play();
                        System.out.print("是否继续?(y/n):");
                        if(new Scanner(System.in).next().equals("n")){
                            break;
                        }
                    }
                    System.out.println("********* 游 戏 结 束 ***********");
                    break;
                }
                case 2:
                    gameInfo();
                    break;
                case 3:
                    System.out.println("********* 排 行 榜 ***********");
                    top();
                    break;
                case 4:
                    System.out.println("********* 退 出 游 戏 ***********");
                    return;

            }


        }


    }

    private void gameInfo() {
        System.out.println("\t 选择开始游戏，然后输入对应的序号进行游戏。\n\t石头>剪刀  剪刀>布 布>石头 \n\t当双方选择相同时，平局。\n\t每赢一回合+10积分");
    }

    /**
     * 排行榜
     */
    private void top() {
        System.out.println("玩家姓名\t\t玩家积分\t\t赢局数\t\t总局数\t\t胜率");
        if(player1.getScore() >= player2.getScore()){
            System.out.println(player1);
            System.out.println(player2);
        }else {
            System.out.println(player2);
            System.out.println(player1);
        }
    }

    /**
     * 开始游戏
     * @throws InterruptedException
     */
    private void play() throws InterruptedException {


        //电脑随机选择
        player1.doSelect();

        //人类从控制台选择
        player2.doSelect();

        System.out.print("\n\t人类玩家【" + player2.getName() + "】的选择是【" + player2.getSelect() + "】");
        System.out.println("\n\t电脑【" + player1.getName() + "】的选择是【" + player1.getSelect() + "】");

        int result = judgment(player1,player2);

        //记录总局数
        player1.incrementTotalCount();
        player2.incrementTotalCount();

        System.out.println("\n\t-------------- 正 在 判 断 游 戏 结 果 -----------------");

        Thread.sleep(1000);

        if(result == 0){
            System.out.println("\n\t平局!");
        }else if(result == 1){
            //电脑赢
            System.out.println("\n\t很遗憾,【"+player2.getName() +"】,您输了, 电脑【"+player1.getName() +"】 积分+10");
            player1.setScore(player1.getScore() + 10);
            player1.incrementWinCount();
        }else {
            //玩家赢
            System.out.println("\n\t恭喜您【"+player2.getName() +"】, 您赢了, 您积分 +10");
            player2.setScore(player2.getScore() + 10);
            player2.incrementWinCount();
        }

        System.out.println("\n\t您当前积分:" + player2.getScore() + ",您共赢了:" + player2.getWinCount() + "局");

    }

    /**
     * 判断输赢
     * @param player1 玩家1
     * @param player2 玩家2
     * @return
     * 返回1 玩家1赢
     * 返回2 玩家2赢
     * 返回0 平局
     */
    private static int judgment(Player player1,Player player2){

        if(player1.getSelect() == player2.getSelect()) return 0;

        //用户输入
        switch (player1.getSelect()){
            case CLOTH://布
                if(player2.getSelect() == Select.STONE) {
                    return 1;
                }
            case SCISSORS://剪刀
                if(player2.getSelect() == Select.CLOTH) {
                    return 1;
                }
            case STONE://石头
                if(player2.getSelect() == Select.SCISSORS) {
                    return 1;
                }
                //走到此处说明用户用户2赢
            default: return 2;
        }
    }

}
