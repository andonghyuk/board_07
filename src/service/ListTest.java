package service;

import java.util.*;

class Student{
	private String name;
	private int grade;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + ", "
				+ "]";
	}
	
}

public class ListTest {

	public static void main (String[] args)	{
		List<Student> stList = new ArrayList<>();
		Random r = new Random();
	
		for(int i=0;i<5;i++)	{
			Student st = new Student();
			stList.add(st);
			st.setName("이름"+i);
			st.setGrade(r.nextInt(10)+1);
		}

		
		
		
		
		
		
		
//		for(int i=0;i<stList.size();i++)	{
//			Student st = stList.get(i);
//			
//			if(i%2 != 0) {
//				System.out.println(stList.get(i));
//			}
//		}
//		
//		
//		for(int i=0;i<stList.size();i++) {
//			Student st2 =stList.get(i);
//			int grade = st2.getGrade();
//			if(st2.getGrade()%2 == 0)	{
//				System.out.println("이름 :" + st2.getName()+  "학년 :"+st2.getGrade());
//			}
//		}
		
		
//		System.out.println(stList);
	}
}
