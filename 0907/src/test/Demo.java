/*
 * Copyright (c) 2021. 杜少雄 AllRightsReserved
 */

package test;

import java.util.*;

/**
 * @author: 杜少雄 <github.com/shaoxiongdu>
 * @date: 2021年09月08日 | 8:24
 * @description:
 */
public class Demo {
    public static void main(String[] args) {
        Collection<?>[] collections =
                {new HashSet<String>(), new ArrayList<String>(), new HashMap<String, String>().values()};
        Super subToSuper = new Sub();
        for (Collection<?> collection : collections) {
            System.out.println(subToSuper.getType(collection));
        }
    }

    abstract static class Super {
        public static String getType(Collection<?> collection) {
            return "Super:collection";
        }

        public static String getType(List<?> list) {
            return "Super:list";
        }

        public static String getType(Set<?> set) {
            return "Super:set";
        }

        public String getType(ArrayList<?> list) {
            return "Super:arrayList";
        }

        public String getType(HashSet<?> set) {
            return "Super:hashSet";
        }
    }

    static class Sub extends Super {
        public static String getType(Collection<?> collection) {
            return "Sub";
        }
    }
}