package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PATA1095 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
        int carNum = Integer.parseInt(s[0]);
        int searchNum = Integer.parseInt(s[1]);
        Car [] all = new Car[carNum];
        Car[]  valid = new Car[carNum];
        for(int i=0;i<carNum;i++) {
        	String[] temp = br.readLine().split(" ");
        	Car c = new Car();
        	c.id=temp[0];
        	c.status=temp[2];
        	c.time=timeToSecond(Integer.parseInt(temp[1].split(":")[0]),Integer.parseInt(temp[1].split(":")[1]),Integer.parseInt(temp[1].split(":")[2]));
        	all[i]=c;
        }
        Arrays.sort(all,new ComCar());//排序
        Map<String,Integer> parkTime = new HashMap<String,Integer>();
        int maxTime=-1;//最长停留时间
        int num=0;
        for(int i=0;i<carNum-1;i++) {
        	if(all[i].id.compareTo(all[i+1].id)==0&&all[i].status.equals("in")&&all[i+1].status.equals("out")) {
        		valid[num++]=all[i];
        		valid[num++]=all[i+1];
        		int inTime = all[i+1].time-all[i].time;
        		if(!parkTime.containsKey(all[i].id)) {
        			parkTime.put(all[i].id, 0);
        		}
        		parkTime.put(all[i].id, parkTime.get(all[i].id)+inTime);
        		maxTime = Math.max(maxTime, parkTime.get(all[i].id));
        	}
        	
        }
        Arrays.sort(valid,0,num,new Comparator<Car>() {

			@Override
			public int compare(Car o1, Car o2) {
				return o1.time-o2.time;
			}
		});
       
      
        for(int i=0;i<searchNum;i++) {
        	int numCar=0;
        	String[] t = br.readLine().split(":");
        	int hh=Integer.parseInt(t[0]);
        	int mm=Integer.parseInt(t[1]);
        	int ss=Integer.parseInt(t[2]);
        	int time =timeToSecond(hh,mm,ss);
        	for(int j=0;j<num ;j++) {
        		if(valid[j].time>time) {
        			continue;
        		}
        		if(valid[j].time<=time && valid[j].status.equals("in")) {
        			numCar++;
        		}else if(valid[j].time<=time && valid[j].status.equals("out")){
        			numCar--;
        		}
        	}
        	
        	System.out.println(numCar);
        }
       
        Iterator<String> it = parkTime.keySet().iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            int value = (Integer) parkTime.get(key);
            if(value==maxTime) {
            	System.out.print(key+" ");
            }
            

            
        }
        System.out.printf("%02d:%02d:%02d",maxTime/3600,maxTime%3600/60,maxTime%60);
        br.close();
 	}
	 
	static int timeToSecond(int hh,int mm,int ss) {
		return hh*3600+mm*60+ss;
	}
}
class  Car{
	String id;
	int time;
	String status;
}
class ComCar implements Comparator<Car>{

	@Override
	public int compare(Car o1, Car o2) {
		if(o1.id.compareTo(o2.id)!=0) {
		   return o1.id.compareTo(o2.id);	
		}else {
			return o1.time-o2.time;
		}
		
		
		
	}
	
}