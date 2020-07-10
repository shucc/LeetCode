package org.cchao.leetcode.bytedance;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cchen6
 * @Date on 2020/7/10
 * @Description 复原IP地址
 */
public class Str07 {

    public static void main(String[] args) {
        String temp = "25525511135";
        System.out.println(new Str07().restoreIpAddresses("010010"));
    }

    private List<List<String>> res = new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {
        process(4, s, new ArrayList<>());
        List<String> result = new ArrayList<>();
        for (int i = 0; i < res.size(); i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < res.get(i).size(); j++) {
                if (j > 0) {
                    stringBuilder.append(".");
                }
                stringBuilder.append(res.get(i).get(j));
            }
            result.add(stringBuilder.toString());
        }
        return result;
    }

    private void process(int size, String s, List<String> temp) {
        //剩余需要添加的位数最大值都大于剩下未分配长度，则回退
        if (s.length() > size * 3) {
            return;
        }
        //刚好是最后一位
        if (size == 1) {
            int now = Integer.valueOf(s);
            if (now > 255) {
                return;
            }
            if (s.length() > 1 && s.startsWith("0")) {
                return;
            }
            temp.add(s);
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 1; i < 4; i++) {
            if (s.length() <= i) {
                return;
            }
            List<String> newList = new ArrayList<>(temp);
            newList.add(s.substring(0, i));
            if (Integer.valueOf(newList.get(newList.size() - 1)) > 255 || (newList.get(newList.size() - 1).length() > 1 && newList.get(newList.size() - 1).startsWith("0"))) {
                continue;
            }
            process(size - 1, s.substring(i), newList);
        }
    }
}
