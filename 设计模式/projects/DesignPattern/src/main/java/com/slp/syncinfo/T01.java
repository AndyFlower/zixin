package com.slp.syncinfo;

import org.openjdk.jol.info.ClassLayout;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * 查看CAS在内存中的应用
 */
public class T01 {
    public static void main(String[] args) {
        //加锁的话效率会比较低，在jdk5之后增加了一些原子类
        AtomicInteger i = new AtomicInteger();
        i.incrementAndGet();
        //带版本号的 可以解决ABA问题
        //AtomicStampedReference
        //内存布局
        Object o  = new Object();
        /**
         * java.lang.Object object internals:
         *  OFFSET  SIZE   TYPE DESCRIPTION                               VALUE
         *       0     4        (object header)                           01 00 00 00 (00000001 00000000 00000000 00000000) (1)
         *       4     4        (object header)                           00 00 00 00 (00000000 00000000 00000000 00000000) (0)
         *       8     4        (object header)                           e5 01 00 f8 (11100101 00000001 00000000 11111000) (-134217243)
         *      12     4        (loss due to the next object alignment)
         * Instance size: 16 bytes
         * Space losses: 0 bytes internal + 4 bytes external = 4 bytes total
         */
        System.out.println(ClassLayout.parseInstance(o).toPrintable());

        /**
         * java.lang.Object object internals:
         *  OFFSET  SIZE   TYPE DESCRIPTION                               VALUE
         *       0     4        (object header)                           01 b2 e4 cf (00000001 10110010 11100100 11001111) (-807095807)
         *       4     4        (object header)                           5f 00 00 00 (01011111 00000000 00000000 00000000) (95)
         *       8     4        (object header)                           e5 01 00 f8 (11100101 00000001 00000000 11111000) (-134217243)
         *      12     4        (loss due to the next object alignment)
         * Instance size: 16 bytes
         * Space losses: 0 bytes internal + 4 bytes external = 4 bytes total
         */
        o.hashCode();
        System.out.println(ClassLayout.parseInstance(o).toPrintable());
        synchronized (o){
            /**
             * java.lang.Object object internals:
             *  OFFSET  SIZE   TYPE DESCRIPTION                               VALUE
             *       0     4        (object header)                           30 f7 91 02 (00110000 11110111 10010001 00000010) (43120432)
             *       4     4        (object header)                           00 00 00 00 (00000000 00000000 00000000 00000000) (0)
             *       8     4        (object header)                           e5 01 00 f8 (11100101 00000001 00000000 11111000) (-134217243)
             *      12     4        (loss due to the next object alignment)
             * Instance size: 16 bytes
             * Space losses: 0 bytes internal + 4 bytes external = 4 bytes total
             */
            //如果上面使用了hashCode则是
            /**
             * java.lang.Object object internals:
             *  OFFSET  SIZE   TYPE DESCRIPTION                               VALUE
             *       0     4        (object header)                           a0 f4 8c 02 (10100000 11110100 10001100 00000010) (42792096)
             *       4     4        (object header)                           00 00 00 00 (00000000 00000000 00000000 00000000) (0)
             *       8     4        (object header)                           e5 01 00 f8 (11100101 00000001 00000000 11111000) (-134217243)
             *      12     4        (loss due to the next object alignment)
             * Instance size: 16 bytes
             * Space losses: 0 bytes internal + 4 bytes external = 4 bytes total
             */
            System.out.println(ClassLayout.parseInstance(o).toPrintable());
        }
    }
}
