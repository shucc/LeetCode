package org.cchao.leetcode.offer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cchen6
 * @Date on 2020/5/15
 * @Description 字符串的排列
 */
public class Offer38 {

    public static void main(String[] args) {
        Offer38 offer38 = new Offer38();
        String[] result = offer38.permutation("dkjphedy");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    private List<String> res = new ArrayList<>();

    public String[] permutation(String s) {
        char[] origin = s.toCharArray();
        if (origin.length == 0) {
            return new String[0];
        }
        backtrack(origin, new StringBuilder(), new ArrayList<>());
        String[] resStr = new String[res.size()];
        for (int i = 0; i < resStr.length; i++) {
            resStr[i] = res.get(i);
        }
        return resStr;
    }

    private void backtrack(char[] origin, StringBuilder track, List<Integer> trackPos) {
        if (track.length() == origin.length) {
            if (!res.contains(track.toString())) {
                res.add(track.toString());
            }
            return;
        }
        for (int i = 0; i < origin.length; i++) {
            if (trackPos.contains(i)) {
                continue;
            }
            track.append(origin[i]);
            trackPos.add(i);
            backtrack(origin, track, trackPos);
            track.deleteCharAt(track.length() - 1);
            trackPos.remove(trackPos.size() - 1);
        }
    }
}
