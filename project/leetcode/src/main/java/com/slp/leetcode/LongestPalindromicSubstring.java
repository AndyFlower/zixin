package com.slp.leetcode;

/**
 * @ClassName LongestPalindromicSubstring
 * @Description 最长回文子串
 * @Author sanglp
 * @Date 2020/9/11 9:37
 * @Version 1.0
 **/
public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("ab"));
    }

    /**
     * @Description  暴力算法，时间复杂度是立方
     * @param s
     * @return
     */
    public static String longestPalindrome(String s) {
        int len = s.length();
        //如果长度小于1说明就是空字符串或1个字符，1个字符一定是回文传返回即可。
        if(len<2){
            return s;
        }
        int start =0;//回文串的起始位置
        int end = 0;//回文串的结束位置
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                boolean flag = verifyIsPalimdromid(s,i,j);
                if(flag&&(j-i)>(end-start)){
                    start = i;
                    end = j;
                }
            }
        }
        //System.out.println(start+" "+end);
        return s.substring(start,end+1);
    }

    /**
     * @Description 判断一个字符是不是回文串
     * @param s
     * @param i
     * @param j
     * @return
     */
    private static boolean verifyIsPalimdromid(String s, int i, int j) {
        char[] chars = s.toCharArray();
        for(int k=0;k<=(j-i)/2;k++){
            if(chars[i+k]!=chars[j-k]){
                return false;
            }
        }
        return true;
        /**
         * while (left < right) {
         *             if (charArray[left] != charArray[right]) {
         *                 return false;
         *             }
         *             left++;
         *             right--;
         *         }
         */
    }


    /**
     * @Description 使用动态规划解决回文串的问题
     * @param s
     * @return
     */
    public String longestPalindromeVersion2(String s) {
        // 如果长度小于1 一定是回文串，返回本身即可
        int len = s.length();
        if (len < 2) {
            return s;
        }
        //如果大于1的话，因为1个字符是回文串，所以长度最小也是1
        int maxLen = 1;
        int begin = 0;

        // 数组dp[i][j] 表示 s[i, j] 是否是回文串
        boolean[][] dp = new boolean[len][len];
        char[] charArray = s.toCharArray();
        //对角线上表示第i个单个的字母，一定是回文串，所以将它设置成true
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }
        //这里填的是左下三角的部分
        for (int j = 1; j < len; j++) {
            for (int i = 0; i < j; i++) {
                if (charArray[i] != charArray[j]) {//如果收尾不一样 一定不是回文串
                    dp[i][j] = false;
                } else { //收尾一样的情况下
                    if (j - i < 3) {//去掉收尾之后 剩1个或者没有，这时一定是回文串
                        dp[i][j] = true;
                    } else {//如果去掉收尾之后的长度大于等于3 则问题转换为求去掉收尾之后的子串是否是回文串
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }

                // 只要 dp[i][j] == true 成立，就表示子串 s[i..j] 是回文，如果新的子串的长度大于原来的长度则更新新的起始位置和长度
                if (dp[i][j] && j - i + 1 > maxLen) {
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin, begin + maxLen);
    }

    /**
     * @Description 中心扩散法 解决回文串
     * @param s
     * @return
     */
    public String longestPalindromeVersion3(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }
        //初始化设置长度为1  回文串为第一个字符
        int maxLen = 1;
        String res = s.substring(0, 1);
        // 中心位置枚举到 len - 2 即可
        for (int i = 0; i < len - 1; i++) {
            String oddStr = centerSpread(s, i, i);
            String evenStr = centerSpread(s, i, i + 1);
            String maxLenStr = oddStr.length() > evenStr.length() ? oddStr : evenStr;
            if (maxLenStr.length() > maxLen) {
                maxLen = maxLenStr.length();
                res = maxLenStr;
            }
        }
        return res;
    }

    private String centerSpread(String s, int left, int right) {
        // left = right 的时候，此时回文中心是一个字符，回文串的长度是奇数
        // right = left + 1 的时候，此时回文中心是一个空隙，回文串的长度是偶数
        int len = s.length();
        int i = left;
        int j = right;
        while (i >= 0 && j < len) {
            if (s.charAt(i) == s.charAt(j)) {
                i--;
                j++;
            } else {
                break;
            }
        }
        // 这里要小心，跳出 while 循环时，恰好满足 s.charAt(i) != s.charAt(j)，因此不能取 i，不能取 j
        return s.substring(i + 1, j);
    }


}
