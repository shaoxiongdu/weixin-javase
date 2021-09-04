package work.work2;


import java.util.*;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/23
 * @description:
 */
public class UserList {

    private List<String> userList = new ArrayList<>();

    public void addUser(String  user){
        userList.add(user);
    }

    /**
     * 打印客户列表
     */
    public void printUserList(){

        for (int i = 0; i < userList.size(); i++) {
            System.out.print("[" + userList.get(i) + "]\t");
        }

    }

    /**
     * 排序
     */
    public void sort(){
        Collections.sort(userList);
    }

}
