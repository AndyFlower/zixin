package com.zixin.algorithm;

import java.util.Scanner;

public class PATA1035 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		Studentp [] arr=new Studentp[num];
		for(int i=0;i<num;i++) {
			arr[i]=new Studentp(sc.next(),sc.next(),false);
		}
		sc.close();
		int changeNum=0;
		for(int i=0;i<num;i++) {
			String password = arr[i].getPassword();
			if(password.contains("1")||password.contains("0")||password.contains("l")||password.contains("O")) {
				arr[i].isChange=true;
				arr[i].setPassword(password.replaceAll("1", "@").replaceAll("0", "%").replaceAll("l", "L").replaceAll("O", "o"));
				changeNum++;
			}
		}
		if(changeNum==0&&num==1) {
			System.out.println("There is "+num+" account and no account is modified");
		}else if(changeNum==0&&num>1) {
			System.out.println("There are "+num+" accounts and no account is modified");
		}else {
			System.out.println(changeNum);
			for(int i=0;i<num;i++) {
				if(arr[i].isChange) {
					System.out.println(arr[i].getName()+" "+arr[i].getPassword());
				}
			}
		}
	}

}


class Studentp{
	private String name;
	private String password;
	boolean isChange;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isChange() {
		return isChange;
	}
	public void setChange(boolean isChange) {
		this.isChange = isChange;
	}
	public Studentp(String name, String password, boolean isChange) {
		super();
		this.name = name;
		this.password = password;
		this.isChange = isChange;
	}
	
}