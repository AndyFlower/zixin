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

###   常规

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

### 排版类问题

1. 输出字符菱形  1473

2. 旋转矩阵

   ```
   http://noobdream.com/DreamJudge/Issue/page/1216/
   ```

   DJXuanzhuanjuzhen.java

3. 矩阵翻转 1134

4. 旋转数字

5. 2048游戏     1472

### 

### 排序类

使用默认的排序函数

```java
1、Integer[] intArr = new Integer[]{3,6,2,1,6,7,24,7};
        Arrays.sort(intArr);
2、 String[] arr2 = new String[]{"f","2","c","e","3","d","1","a","b","back"};
        List list = Arrays.asList(arr2);
        Collections.sort(list);

```





查找top即 使用选择排序

几百万个查找第K大的元素。利用快速排序

### 查找类

1. 数字查找

2. 字符串查找

   静态查找

   动态查找  ：map  DJ1477

### 贪心问题

追求当前最优解，从而得到全局最优解。

### 链表类问题

## 第三章

### 同余模定理

许多数被一个数d去除，有相同的余数。d数学上的称谓为模、

等价说法：a和b是模d同余的

​    				存在某个整数n a=b+nd

  				   d整除a-b

比如大数取模可以使用相关公式

**基本性质**：

1.[反身](https://baike.baidu.com/item/反身)性：a≡a (mod m)；

2.[对称](https://baike.baidu.com/item/对称)性：若a≡b(mod m)，则b≡a (mod m)；

3.传递性：若a≡b(mod m)，b≡c(mod m)，则a≡c(mod m)；

4.同余式相加：若a≡b(mod m)，c≡d(mod m)，则a 

 ![img](https://gss3.bdstatic.com/-Po3dSag_xI4khGkpoWK1HF6hhy/baike/s=10/sign=5ed18457982397ddd2799c045882df14/c9fcc3cec3fdfc03a9ac5e08dd3f8794a5c226ad.jpg) 

c≡b 

 ![img](https://gss3.bdstatic.com/-Po3dSag_xI4khGkpoWK1HF6hhy/baike/s=10/sign=5ed18457982397ddd2799c045882df14/c9fcc3cec3fdfc03a9ac5e08dd3f8794a5c226ad.jpg) 

d(mod m)；

5.同余式相乘：若a≡b(mod m)，c≡d(mod m)，则ac≡bd(mod m)。

**运算法则**：

  (a + b) % p = (a % p + b % p) % p     
    (a - b) % p = (a % p - b % p) % p      
    (a * b) % p = (a % p * b % p) % p     
   ab % p = ((a % p)b) % p   

（同余运算法则没有除法）       

结合率： ((a+b) % p + c) % p = (a + (b+c) % p) % p 

((a*b) % p * c)% p = (a * (b*c) % p) % p 

交换率： (a + b) % p = (b+a) % p       

(a * b) % p = (b * a) % p       

分配率： ((a +b)% p * c) % p = ((a * c) % p + (b * c) % p) % p 

### 最大公约数

```java
int gcd(int a,int b){
    if(b==0){
        return a;
    }else {
        return (b,a%b)
    }
}


```

证明：两个数的最大公约数 等于 两个数的余数和小的整数的 最大公约数
假设a、b的最大公约数为d（a > b）,其中a % b = r（r > 0）,求证b、r的最大公约数也是d
证明过程
因为a、b的最大公约数为d，故a = xd、b = yd；
因为a % b = r，故a = zb + r，故a = yzd + r = xd，故r = (x - yz)d，即r整除d；
故d时b、r的约数。下面证明约数的范围。

假设b、r有约数g，则 b = ng、r = mg，则a = zng + mg = (zn + m)g，则g也是a、b的约数；
由于a、b的最大公约数为d，故g <= d，所以b、r最大公约数为d

### 最小公倍数

最小公倍数等于两个数的乘积除以两个数的最大公约数

乘积=最小公倍数*最大公约数

### 斐波那契数列

从第3项开始  每一个都是前两个的和

### 素数判断

除了1和本身不能被其他的整除

### 分解质因数

### 二分快速幂

对于a^b，普通的求法是用一个循环一直乘b个a，这样的方法对于某些题目来说可能显得比较慢。

二分快速幂是一种利用b的二进制特征来快速求a^b的算法。

例如：

a = 2, b = 35

则b的二进制表示形式为100011

则 a^b = (2^32) * (2^2) * (2^1)

有了这样的思路之后，就不用循环b次了。

假设b的二进制表示有n位，从后往前依次为第1-n位，初始结果为1。则现在只需要从最后一位开始，若该位为0，则略过，若该位为1，则结果乘上a^(2^当前位序号)。最后得到的结果就是a^b了。这样循环执行的次数仅为b的二进制表示的位数，远小于b。

### 公式

错排公式：

```
当n个编号元素放在n个编号位置，元素编号与位置编号各不对应的方法数用D(n)表示，那么D(n-1)就表示n-1个编号元素放在n-1个编号位置，各不对应的方法数，其它类推.
第一步，把第n个元素放在一个位置，比如位置k，一共有n-1种方法；
第二步，放编号为k的元素，这时有两种情况：⑴把它放到位置n，那么，对于剩下的n-1个元素，由于第k个元素放到了位置n，剩下n-2个元素就有D(n-2)种方法；⑵第k个元素不把它放到位置n，这时，对于这n-1个元素，有D(n-1)种方法；
综上得到
D(n) = (n-1) [D(n-2) + D(n-1)]
```

海伦公式：

s=sqrt(p(p-a)(p-b)(p-c))  p为半周长

组合数公式：

```
从n个不同元素中，任取m(m≤n)个元素并成一组，叫做从n个不同元素中取出m个元素的一个组合；从n个不同元素中取出m(m≤n)个元素的所有组合的个数，叫做从n个不同元素中取出m个元素的组合数。
```

扇形面积：

1/2*半径*弧长

卡特兰数：

h(n)=C(2n,n)/(n+1)          1 1 2 5 14  42  132 

所有的奇卡特兰数Cn都满足n=2^k-1  所有其他的卡特兰数都是偶数

应用：12个高矮不同的人排队，前一排递增 后一排比前一排高

​          括号化：矩阵相乘 不改变顺序 化括号

​           多边形划分为三角形

​            出栈次序

​             n*n个格点中不过对角线的单调路径方案

​             n+1个叶子的二叉树的个数

### OEIS

http://oeis.org/

## 第四章 

BigInteger   BigDecimal 

```java
valueOf(parameter)  转换为指定类型
add
substract()
multiply()
divided()
remainder()//取余
pow() 
gcd() 最大公约数
abs()
negate()  反数
mod()  余
max()
min()
    
```



## 第五章 数据结构

### 栈

后进先出  一端进行插入和删除操作：Stack  :pop    push   peek

eg：括号的匹配  DJ1067 

> 使用栈，和栈顶元素匹配就说明配对成功，将栈顶元素出栈，否则配对不成功，就将当前元素入栈。最后查看栈是否为空，

### 队列

add  poll  peek

### 优先队列



