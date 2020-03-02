package com.zixin.learn.easy.day01;


import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
/**
 * 
 * @ClassName: MyComparator
 * @Description: 比较器
 * @author Administrator
 * @date 2020-03-01 23:37:59
 */
public class MyComparator {

	// 使用了内部类
	public static class Student {
		public String name;
		public int id;
		public int age;

		public Student(String name, int id, int age) {
			this.name = name;
			this.id = id;
			this.age = age;
		}
    }

	// 重载比较器
	public static class IdAscendingComparator implements Comparator<Student> {
		@Override
		public int compare(Student o1, Student o2) {
            // 返回值：负数：前面的放在前面，整数：后面的放在前面，0：两者相等；
			return o1.id - o2.id;
            /**
             * 上面的 return 等价于
             * if(o1.id < o2.id){
             *      return -1;
             * }else if(o1.id > o2.id){
             *     return 1;
             * }else{
             *     return 0;
             * }
             */
		}

	}

	// 按照 id 降序排列
	public static class IdDescendingComparator implements Comparator<Student> {
		@Override
		public int compare(Student o1, Student o2) {
			return o2.id - o1.id;
		}

	}

	public static class AgeAscendingComparator implements Comparator<Student> {
		@Override
		public int compare(Student o1, Student o2) {
			return o1.age - o2.age;
		}

	}

	public static class AgeDescendingComparator implements Comparator<Student> {
		@Override
		public int compare(Student o1, Student o2) {
			return o2.age - o1.age;
		}

	}

	public static void printStudents(Student[] students) {
		for (Student student : students) {
			System.out.println("Name : " + student.name + ", Id : " + student.id + ", Age : " + student.age);
		}
		System.out.println("===========================");
	}

	public static void main(String[] args) {
		Student student1 = new Student("A", 1, 23);
		Student student2 = new Student("B", 2, 21);
		Student student3 = new Student("C", 3, 22);

		Student[] students = new Student[] { student3, student2, student1 };
		printStudents(students);

		Arrays.sort(students, new IdAscendingComparator());
		printStudents(students);

		Arrays.sort(students, new IdDescendingComparator());
		printStudents(students);

		Arrays.sort(students, new AgeAscendingComparator());
		printStudents(students);

		Arrays.sort(students, new AgeDescendingComparator());
		printStudents(students);


        // 使用系统提供的堆：优先级队列进行排序： TreeMap 实现
		//PriorityQueue 一个基于优先级的无界优先级队列。优先级队列的元素按照其自然顺序进行排序，或者根据构造队列时提供的 Comparator 进行排序，具体取决于所使用的构造方法。该队列不允许使用 null 元素也不允许插入不可比较的对象(没有实现Comparable接口的对象)。
		//PriorityQueue 队列的头指排序规则最小那个元素。如果多个元素都是最小值则随机选一个。
		//PriorityQueue 是一个无界队列，但是初始的容量(实际是一个Object[])，随着不断向优先级队列添加元素，其容量会自动扩容，无需指定容量增加策略的细节。
        PriorityQueue<Student> heap =  new PriorityQueue<>(new IdAscendingComparator());
        // 添加自定义的类型
        heap.add(student1);
        heap.add(student2);
        heap.add(student3);

		System.out.println("==========优先级队列按照 Id 排序=================");
        while (!heap.isEmpty()){
            // 逐个弹出栈顶，内部实现就是 heapify
            Student student = heap.poll();
            System.out.println("Name : " + student.name + ", Id : " + student.id + ", Age : " + student.age);
        }
	}
}
