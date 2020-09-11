package com.slp.syncinfo;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class T02_Unsafe {
    int i = 0 ;
    private  static T02_Unsafe t = new T02_Unsafe();

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Field unsafeField = Unsafe.class.getDeclaredField(null);
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe)unsafeField.get(null);
        Field f = T02_Unsafe.class.getDeclaredField("i");
        long offset = unsafe.objectFieldOffset(f);
        System.out.println(offset);
        boolean success = unsafe.compareAndSwapInt(t,offset,0,1);
        System.out.println(success);
        System.out.println(t.i);
    }
}
