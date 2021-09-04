package work.work1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 杜少雄 https://github.com/shaoxiongdu
 * @date: 2021/08/23
 * @description:
 */
public class UserList {

    private List<String> userList = new ArrayList<>();

    public void addUser(String userName){
        userList.add(userName);
    }

    /**
     * 打印学生列表
     */
    public void printUserList(){

        System.out.println("*********** 客 户 列 表 *****************");
        for (int i = 0; i < userList.size(); i++) {
            System.out.print("[" +userList.get(i) + "]\t");
        }
        System.out.println("\n****************************************");
    }

    /**
     * 修改客户姓名
     * @param newName 新姓名
     * @param oldName 旧姓名
     */
    public void updateUserName(String newName, String oldName){

        boolean isSuccess = false;

        for (int i = 0; i < userList.size();i++){
            if( oldName.equals( userList.get(i))){
                userList.set(i,newName);
                isSuccess = true;
                break;
            }
        }
        System.out.println("***** 修 改 结 果 ***** ");
        if(isSuccess){
            System.out.println("找到姓名为: " + oldName + "的客户，修改为: " + newName + "\t 修改成功!");
        }else {
            System.out.println("没有找到姓名为: " + oldName + "的客户\t修改失败!");
        }

    }

}
