package com.zixin.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PATB1046 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
        List<CaiQuan> cs = new ArrayList<CaiQuan>();
        for(int i=0;i<num;i++) {
        	String s = br.readLine();
        	cs.add(new CaiQuan(Integer.parseInt(s.split(" ")[0]),Integer.parseInt(s.split(" ")[1]),Integer.parseInt(s.split(" ")[2]),Integer.parseInt(s.split(" ")[3])));
        }
        br.close();
        int jia=0;
        int yi=0;
        for(int j=0;j<num;j++) {
        	CaiQuan cq = cs.get(j);
        	int a =cq.whoWin();
        	if(a==2) {
        		jia+=1;
        	}else if(a==1) {
        		yi+=1;
        	}
        			
        }
        System.out.println(jia +" "+ yi);
		

	}

	static class CaiQuan {
		int jiahan;
		int jiachu;
		int yihan;
		int yichu;

		public CaiQuan(int jiahan, int jiachu, int yihan, int yichu) {
			super();
			this.jiahan = jiahan;
			this.jiachu = jiachu;
			this.yihan = yihan;
			this.yichu = yichu;
		}
        /**
                           * 返回1  甲赢   返回2乙赢   返回0平局
         * @return
         */
		int whoWin() {
			if (jiachu == (jiahan + yihan)&&jiachu!=yichu) {
				return 1;
			} else if (yichu == (jiahan + yihan)&&jiachu!=yichu) {
				return 2;
			} else {
				return 0;
			}
		}

	}
}
