package 公共前缀;

public class Main {
    public static void main(String[] args) {
        String[] strs = {"float","flase","flsis"};
        Solution solution = new Solution();
        String s = solution.longestCommonPrefix(strs);
        System.out.println(s);
    }
}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = "";
        int min = strs[0].length();

        for(int i = 0; i < strs.length; i ++){
            min = min < strs[i].length() ? min : strs[i].length();
        }

        for(int j = 0; j < min; j ++){
            char c = strs[0].charAt(j);
            for(int k =0; k < strs.length; k ++){
                if (strs[k].charAt(j) != c){
                    return s;
                }
            }
            s += strs[0].charAt(j);
        }

        return s;
    }
}