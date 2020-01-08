package com.zixin;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName LockT1
 * @Description TODO
 * @Author zishen
 * @Date 2019/12/30 8:34
 * @Version 1.0
 **/
public class LockT1 {

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock(true);
    }
}
