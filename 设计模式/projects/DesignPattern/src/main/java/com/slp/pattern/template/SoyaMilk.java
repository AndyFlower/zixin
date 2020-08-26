package com.slp.pattern.template;

/**
 * @ClassName SoyaMilk
 * @Description 抽象类，表示豆浆
 * @Author sanglp
 * @Date 2020/8/26 8:17
 * @Version 1.0
 **/
public abstract class SoyaMilk {
    //模板方法 make 模板方法可以做成final 不让子类去覆盖
    final void make(){
        select();
        if(customWantCondiments()){
            addCondiments();
        }

        soak();
        beat();
    }

    void select(){
        System.out.println("选择合适的材料");
    }
    //添加不同配料 抽象方法 子类具体实现
    abstract void addCondiments();
    //浸泡
    void soak(){
        System.out.println("开始浸泡 需要3小时");
    }

    void beat(){
        System.out.println("打豆浆");
    }

    //钩子方法 决定是否需要添加配料
    boolean customWantCondiments(){
        return true;
    }
}
