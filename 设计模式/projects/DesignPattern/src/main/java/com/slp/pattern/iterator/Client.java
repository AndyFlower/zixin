package com.slp.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Client
 * @Description TODO
 * @Author sanglp
 * @Date 2020/9/3 8:59
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        //创建学院
        List<College> collegeArrayList = new ArrayList<College>();
        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();
        collegeArrayList.add(computerCollege);
        collegeArrayList.add(infoCollege);
        OutputImpl output = new OutputImpl(collegeArrayList);
        output.printCollege();
    }
}
