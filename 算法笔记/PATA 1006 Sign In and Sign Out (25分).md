At the beginning of every day, the first person who signs in the computer room will unlock the door, and the last one who signs out will lock the door. Given the records of signing in's and out's, you are supposed to find the ones who have unlocked and locked the door on that day.

### Input Specification:

Each input file contains one test case. Each case contains the records for one day. The case starts with a positive integer *M*, which is the total number of records, followed by *M* lines, each in the format:

```
ID_number Sign_in_time Sign_out_time

      
    
```

where times are given in the format `HH:MM:SS`, and `ID_number` is a string with no more than 15 characters.

### Output Specification:

For each test case, output in one line the ID numbers of the persons who have unlocked and locked the door on that day. The two ID numbers must be separated by one space.

Note: It is guaranteed that the records are consistent. That is, the sign in time must be earlier than the sign out time for each person, and there are no two persons sign in or out at the same moment.

### Sample Input:

```in
3
CS301111 15:30:28 17:00:10
SC3021234 08:00:00 11:25:25
CS301133 21:45:00 21:58:40

      
    
```

### Sample Output:

```out
SC3021234 CS301133
```

### 代码

```java
package com.zixin.algorithm;

import java.util.Scanner;

public class PATA1006 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        SStudent late = new SStudent("",0,0,0);
        SStudent early = new SStudent("",24,59,59);
        for(int i=0;i<num;i++) {
        	SStudent s = new SStudent();
        	String name = sc.next();
        	String h = sc.next();
        	s.setName(name);
        	s.setHh(Integer.parseInt(h.split(":")[0]));
        	s.setMm(Integer.parseInt(h.split(":")[1]));
        	s.setSs(Integer.parseInt(h.split(":")[2]));
        	if(great(early,s)) {
        		early=s;
        	}
        	
        	SStudent s1 = new SStudent();
        	
        	String h1 = sc.next();
        	s1.setName(name);
        	s1.setHh(Integer.parseInt(h1.split(":")[0]));
        	s1.setMm(Integer.parseInt(h1.split(":")[1]));
        	s1.setSs(Integer.parseInt(h1.split(":")[2]));
        	if(!great(late,s1)) {
        		late=s1;
        	}
        }
        sc.close();
        System.out.println(early.getName()+" "+late.getName());
	}

	static boolean great(SStudent s1,SStudent s2) {
		if(s1.getHh()!=s2.getHh()) {
			return s1.getHh()>s2.getHh();
		}
		if(s1.getMm()!=s2.getMm()) {
			return s1.getMm()>s2.getMm();
		}
		return s1.getSs()>s2.getSs();
	}
}

class SStudent{
	private String name;
	private int hh;
	private int mm;
	private int ss;
	
	public SStudent() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHh() {
		return hh;
	}
	public void setHh(int hh) {
		this.hh = hh;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getSs() {
		return ss;
	}
	public void setSs(int ss) {
		this.ss = ss;
	}
	public SStudent(String name, int hh, int mm, int ss) {
		super();
		this.name = name;
		this.hh = hh;
		this.mm = mm;
		this.ss = ss;
	}
	
}

```

