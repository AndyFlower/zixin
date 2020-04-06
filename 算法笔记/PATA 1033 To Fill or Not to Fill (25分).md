****

With highways available, driving a car from Hangzhou to any other city is easy. But since the tank capacity of a car is limited, we have to find gas stations on the way from time to time. Different gas station may give different price. You are asked to carefully design the cheapest route to go.

### Input Specification:

Each input file contains one test case. For each case, the first line contains 4 positive numbers: *C**m**a**x* (≤ 100), the maximum capacity of the tank; *D* (≤30000), the distance between Hangzhou and the destination city; *D**a**v**g* (≤20), the average distance per unit gas that the car can run; and *N* (≤ 500), the total number of gas stations. Then *N* lines follow, each contains a pair of non-negative numbers: *P**i*, the unit gas price, and *D**i* (≤*D*), the distance between this station and Hangzhou, for *i*=1,⋯,*N*. All the numbers in a line are separated by a space.

### Output Specification:

For each test case, print the cheapest price in a line, accurate up to 2 decimal places. It is assumed that the tank is empty at the beginning. If it is impossible to reach the destination, print `The maximum travel distance = X` where `X` is the maximum possible distance the car can run, accurate up to 2 decimal places.

### Sample Input 1:

```in
50 1300 12 8
6.00 1250
7.00 600
7.00 150
7.10 0
7.20 200
7.50 400
7.30 1000
6.85 300

      
    
```

### Sample Output 1:

```out
749.17

      
    
```

### Sample Input 2:

```
50 1300 12 2
7.10 0
7.00 600

      
    
```

### Sample Output 2:

```
The maximum travel distance = 1200.00

      
    
```

作者: ZHANG, Guochuan

单位: 浙江大学

时间限制: 200 ms

内存限制: 64 MB

### 题意

已知起点和重点的距离为D，邮箱最大容量为Cmax，单位汽油能够只能的最大距离为Davg,给定N个加油站的单位油价和距离起点的距离，，汽车起始时刻在起点位置，邮箱为空，可以在任意站点买任意量的汽油 ，但是不能超过容量，求从起点到终点的最小化费。，如果无法到达终点则输出最远走的距离。

### 代码

```java
package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/**
 * 
 * @ClassName: PATA1033
 * @Description: 注意点1、排序号第一个必须是0  否则无法出发，因为起始点没有油
 *                     2、油价 距离都是浮点数 不能设置成int型   这里有一个问题  如果中途所需要的是除不尽的应该如何处理
 *               解题思路：贪心算法
 *                     把终点设为单位油价为0  距离起点为总长的加油站，然后将所有的加油站按照距离从小到大排序，排序完毕后，如果离起点最近的加油站的距离不是0则不能出发
 *                     如果是0说明可以出发
 *                     假设当前所在的加油站的编号为now,那么将需要找出满油的情况下所能到达的所有加油站中要到达的下一个加油站 
 *                     如果在到达的加油站中有价格比当前小的，就加正好到达这一个加油站的油然后到了之后再加 因为新的加油站的价格要低一些
 *                     如果没有比当前低的就找能到的加油站中价格最低的，然后在当前的加油站加满，到了新的加油站再继续加油，
 *                     总的来说就是要到达油价尽可能低的加油站  这样才能总花费最小      
 * @author Administrator
 * @date 2020-04-05 13:27:14
 */
public class PATA1033 {

	public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String[] atr = br.readLine().split(" ");
       double Cmax = Double.parseDouble(atr[0]);
       double D=Double.parseDouble(atr[1]);
       double Davg = Double.parseDouble(atr[2]);
       int n = Integer.parseInt(atr[3]);
       
       Station arr[] =new Station[n+1];
       for(int i=0;i<n;i++) {
    	   Station s = new Station();
    	   String[] temp = br.readLine().split(" ");
    	   s.price=Double.parseDouble(temp[0]);
    	   s.diatance=Double.parseDouble(temp[1]);
    	   arr[i]=s;
       }
       Station s =new Station();
       s.price=0;
       s.diatance=D;
       arr[n]=s;
       Arrays.sort(arr,new Comparator<Station>() {

		@Override
		public int compare(Station o1, Station o2) {
			if(o1.diatance<o2.diatance) {
				return -1;
			}else if(o1.diatance>o2.diatance) {
				return 1;
			}else {
				return 0;
			}
		}
	});
       
       if(arr[0].diatance!=0) {
    	   System.out.println("The maximun travel distance=0.00");
       }else {
    	   int now = 0;//当前所在加油站
    	   double ans =0;//总花费
    	   double nowTank=0;//当前油量
    	   double MAX = Cmax*Davg;//满油可以行使的距离
    	   while(now<n){//每次循环需要找到下一个将要到达的加油站
    		   //选出从当前加油站满油能到达的范围内的第一个油价低于当前油价的加油站
    		   //如果没有低于当前的就选最低的
    		   int k=-1;//最低油价的加油站的编号
    		   double priceMin=Double.MAX_VALUE;//最低油价
    		   for(int i=now+1;i<=n&&arr[i].diatance-arr[now].diatance<=MAX;i++) {
    			   if(arr[i].price<priceMin) {
    				   priceMin=arr[i].price;
    				   k=i;
    				   if(priceMin<arr[now].price) {
    					   break;//找到第一个小于当前的就break
    				   }
    			   }
    			   
    		   }
    		   if(k==-1) {
    			   break;//满油无法到达加油站 
    		   }
    		   double  need = (arr[k].diatance-arr[now].diatance)/Davg;//需要的油量
    		   if(priceMin<arr[now].price) {//如果加油站K的油价小于当前的，则只加能到达加油站的油
    			   if(nowTank<need) {
    				   ans+=(need-nowTank)*arr[now].price;//补足need
    				   nowTank=0;//到达K之后油量变为0，
    			   }else {//如果当前超过need则直接到达加油站k
    				   nowTank-=need;//
    			   }
    			   
    		   }else {
    			   ans+=(Cmax-nowTank)*arr[now].price;//在当前加油站加满
    			   nowTank=Cmax-nowTank;//到达后的剩余量
    		   }
    		   now=k;
    	   }
    	   if(now==n) {
    		   System.out.printf("%.2f",ans);//能到达终点
    	   }else {
    		   System.out.printf("The maximum travel distance = %.2f\n",arr[now].diatance+MAX);
    	   }
    	   
       }
       
    		   
	}

}

class Station{
	double price;
	double diatance;
}
```

