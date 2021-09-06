package cn.shaoxiongdu.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年09月02日 | 19:39
 * @description:
 */
public class HashMapTestMain {

    public static void main(String[] args) {

        Map map = new HashMap<>();

        map.put("name","张三");
        map.put("age",18);

        System.out.println(map);

        Map newMap = new HashMap();

        newMap.putAll(map);
        System.out.println(newMap);

    }

}
