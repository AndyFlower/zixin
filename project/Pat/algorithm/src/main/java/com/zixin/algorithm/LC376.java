package com.zixin.algorithm;

public class LC376 {
	  public int wiggleMaxLength(int[] nums) {
          //需要去除重复的元素
		  if(nums.length<2) {
			  return nums.length;
		  }
		  int res = 2;
		  for(int i=1;i+1<nums.length;i++) {
			  int a=nums[i-1];
			  int b=nums[i];
			  int c=nums[i+1];
			  if(a<b&&b>c) {
				  res++;
			  }else if(a>b&&b<c) {
				  res++;
			  }		  
		  }
		  return res;
	   }
	  
	  /**
	   * 贪心算法

　　举一个例子来说，2,1,4,5,6,3,3,4,8,4

　　  (1)第一个数2来说，由于后面一个数不等于2，所以当前序列为2,1

　　  (2)对于当前序列，我们需要一个比1大的数，而4>1,所以当前序列为2,1,4

　　  (3)现在我们需要一个比4小的数，但是5>4,所以这里用5替代4，这里使用的贪心规则（使用5肯定比用4容易遇到更小的数，所以用大的数代替小的数，需要一个比当前数大时和这个类似），所以序列为2,1,5

　　  (4)同(3)这里变成2,1,6

　　  (5)这里需要比6小，3比6小所以这里变为2,1,6,3

　　  (6)需要比3大的，而3=3，所以序列还是为2,1,6,3

　　  (7)需要比3大的，而4>3，所以序列2,1,6,3,4

　　　......

　　  最后得到序列为2,1,6,3,8,4，返回值为6
	   * @Title: wiggleMaxLength2
	   * @Description: TODO(这里用一句话描述这个方法的作用)
	   * @author Administrator
	   * @date 2020-03-20 23:38:59
	   * @param @param nums
	   * @param @return 参数
	   * @return int 返回类型
	   * @throws
	   */
	  public int wiggleMaxLength2(int[] nums) {
	        if(nums==null||nums.length==0) return 0;
	        if(nums.length==1) return 1;
	        int res=0;
	        int i=0;
	         
	        while(i<nums.length-1){  //删除最开始 相同的数 ，如2,2,2,3,1
	            if(nums[i]==nums[i+1]){
	                i++;
	            }else{
	                break;
	            }
	        }
	        nums[res] = nums[i];
	        if(i==nums.length-1){  //给出的数组为2,2,2，2,2这种格式
	            return 1;
	        }else{
	            res++;
	            i++;
	            nums[res]=nums[i];  //得出前两个的值,并得出初始的flag
	            int flag=nums[1]-nums[0];       //大于0，==0，或者小于0
	            while(i<nums.length-1){
	                if(flag==0){
	                    i++;
	                }else if(flag>0){        //前面是递增，所以现在需要减
	                    if(nums[i+1]-nums[res]<0){       //确实是递减，加入即可
	                        flag=nums[i+1]-nums[res];
	                        res++;
	                        i++;
	                        nums[res]=nums[i];
	                    }else{
	                        i++;
	                        nums[res] = nums[i];        //将当前序列最后一个替换为后一个比较大的数
	                    }
	                }else if(flag<0){        //前面是递减，所以现在需要增
	                    if(nums[i+1]-nums[res]>0){       //确实是递减，加入即可
	                        flag=nums[i+1]-nums[res];
	                        res++;
	                        i++;
	                        nums[res]=nums[i];
	                    }else{          //需要一个高大的数，所以当前数更小的话，更加容易找到符合要求的数
	                        i++;
	                        nums[res] = nums[i];        //将当前序列最后一个替换为后一个比较小的数
	                    }
	                }
	            }
	        }
	         
	       
	        return res+1;
	    }
}
