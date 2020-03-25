## 第一章

#### Set集合

特点: 无序(没有下标) 集合中的元素不重复

##### HashSet

**hashset具有去重功能**

注意: 打印对象不会自动去重 需要重写equals和hashcode方法

        去重系统类的对象时不用重写

 去重: 当添加到Set的对象 HashCode码不相同时 不会调用equals方法,对象直接存到Set集合中       

         hashset相同时 才会调用equals方法 查看是否是同一个对象(是否重复)  是---则无法存入
利用set集合 

去除ArrayList集合中的重复元素(操作原ArrayList)

```java
public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("a");
    list.add("a");
    list.add("b");
    list.add("b");
    list.add("c");
    list.add("c");
    list.add("d");
    list.add("d");
    HashSet<String> set = new HashSet<>();
    set.addAll(list);
    System.out.println(set);
    list.clear();  // 清空原有元素 放入被list去重后的元素
    list.addAll(set);
    System.out.println(list);

}
```

## 第二章

### 一  常规

1133

1043

后一个数是前一个数*10 +a

1040

### 进制转换

1.反序数     123-》321

1155 

```java
package com.zixin.learn.nnuo;

public class DJ1155 {

	//求反序数 求1000到9999之间的反序数
	public static void main(String[] args) {
		for(int i=1000;i<9999;i++) {
			int x= i*9;
			int y=0;
			while(x>0) {
				y=y*10+(x%10);
				x=x/10;
			}
			if(y==i) {
				System.out.println(i);
			}
		}
		

	}

}

```



2、10进制转2进制

1380

1422

1176

1259

3.10进制转16进制

4.10进制转x进制

5、x->10

6.x转y

1422

1417

1097 

7.字符串转浮点数

8.浮点数转字符串

9.字符串转整型或整型转字符串

