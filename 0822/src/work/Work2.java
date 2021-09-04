package work;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/22
 * @description:
 */
public class Work2 {

    public static void main(String[] args) {

        User user = new User();
        user.score = 2000;
        user.type = "普卡";

        user.printGiveBackScore();
    }

    static class User{
        public int  score;
        public String type;

        /**
         * 计算回馈积分并打印
         */
        public void printGiveBackScore(){
            //边界判断
            if(score <= 0 || type == null || "".equals(type.trim())){
                System.out.println("信息错误");
                return;
            }
            //计算回馈积分
            if( (type.equals("金卡") && score >= 1000) || (type.equals("普卡") && score >= 5000)) {
                System.out.println("回馈积分500");
            }else {
                System.out.println("回馈积分0");
            }
        }
    }

}
