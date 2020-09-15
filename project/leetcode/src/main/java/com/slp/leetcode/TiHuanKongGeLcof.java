package com.slp.leetcode;

/**
 * @ClassName TiHuanKongGeLcof
 * @Description 替换空格
 * @Author sanglp
 * @Date 2020/9/15 16:41
 * @Version 1.0
 **/
public class TiHuanKongGeLcof {
    public static void main(String[] args) {
        System.out.println(replaceSpace("We are happy."));
    }

    /**
     * 使用内置函数
     * @param s
     * @return
     */
    public static String replaceSpace(String s) {
        return s.replace(" ","20%");
    }

    /**
     * 转换为数组 遍历数组 因为String不可以原地修改，所以我们使用StringBuilder
     * @param s
     * @return
     */
    public String replaseSpaceVersion1(String s){
        StringBuilder sb = new StringBuilder();
        for(char c:s.toCharArray()){
            if(c==' '){
                sb.append("%20");
            }else{
                sb.append(c);
            }

        }
        return sb.toString();
    }


}
