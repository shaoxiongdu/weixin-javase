package morning;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年08月31日 | 9:13
 * @description:
 */
public class Question2 {

    public static void main(String[] args) {

        String str = "this is a text";

        //单独获取单词
        String[] strings = str.split(" ");
        System.out.println(str + "每个单词为: ");
        for(String s : strings){
            System.out.println(s);
        }




        System.out.println("---------------------------------------------------");




        //text替换为practice
        String replace = str.replace("text", "practice");
        System.out.println(str + "中practice替换text之后结果为: " + replace);



        System.out.println("---------------------------------------------------");



        //text前插入easy
        int index = str.indexOf("text");
        String insertResult = str.substring(0,index) + "easy " + str.substring(index);
        System.out.println(str + "中text前插入easy之后结果为: " + insertResult);



        System.out.println("---------------------------------------------------");



        //首字母大写
        String result = ""; //存储结果

        String[] words = str.split(" ");
        //循环每个单词
        for(String word : words){

            //获取首字母
            char c = word.charAt(0);
            //如果首字母是小写
            if( c >= 'a' && c <= 'z'){
                //转大写拼接到结果
                result += (char)(c - 32);
                //拼接剩余字母
                result += word.substring(1);
                //拼接空格
                result += " ";


            }else { //不是小写则直接添加到结果
                result += word + " ";
            }

        }
        System.out.println(str + "转为首字母大写之后: " + result);

    }

}
