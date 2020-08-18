package com.slp.pattern.protptype.v4;

import java.io.*;

/**
 * @ClassName DeepProtptype
 * @Description TODO
 * @Author sanglp
 * @Date 2020/8/18 8:36
 * @Version 1.0
 **/
public class DeepProtptype implements Serializable,Cloneable {
    public String name;//String属性
    public DeepCloneableTarget deepCloneableTarget;//引用类型属性

    public DeepProtptype() {
    }

    //深拷贝 --方式一 使用clone方法

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        //这里完成对基本数据类型（属性）和String的克隆
        deep = super.clone();
        //对引用类型的属性，进行单独的处理
        DeepProtptype deepProtptype= (DeepProtptype)deep;
        deepProtptype.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();

        return deepProtptype;
    }

    //深拷贝 方式二：通过序列化来完成拷贝的处理
    public Object deepClone(){
        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);//当前对象以对象流的方式输出
            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepProtptype copyObj = (DeepProtptype) ois.readObject();
            return copyObj;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                oos.close();
            }catch (Exception e){
                e.printStackTrace();
                return null;
            }
        }
    }
}
