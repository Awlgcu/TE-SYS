package com.jiuaoedu.share;

import java.util.List;

/**
 * @description:
 * @author: Rick
 * @date: 2024/12/5 9:46
 * @version: 1.0
 */

public class ListToString {
    public static String transfer(List<?> list){
        if (list == null || list.size() == 0) return "[ ]";
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < list.size()-1; i++) {
            sb.append(list.get(i).toString());
            sb.append(",");
        }
        sb.append(list.get(list.size()-1).toString());
        sb.append("]");
        return sb.toString();
    }
}
