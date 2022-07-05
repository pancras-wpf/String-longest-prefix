package 公共前缀;

public class Main2 {
    public static void main(String[] args) {
        String[] strs = {"float","flase","flsis"};
        Solution2 solution = new Solution2();
        String s = solution.longestCommonPrefix(strs);
        System.out.println(s);
    }

}

class Solution2 {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)return "";
        //公共前缀比所有字符串都短，随便选一个先
        String s=strs[0];
        for (String string : strs) {
            while(!string.startsWith(s)){
                if(s.length()==0)return "";
                //公共前缀不匹配就让它变短！
                s=s.substring(0,s.length()-1);
            }
        }
        return s;
    }
}
