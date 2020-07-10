package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest4 {

	public static void main(String[] args) {
		String[] fNames = { "김", "이", "박", "최", "맹", "신", "조" };
		String[] lNames = { "동동", "나나", "진수", "명희", "철수", "명호", "덕구" };
		List<Student> stList = new ArrayList<>();
		Random r = new Random();
		int st1 = 0;
		int st2 = 0;
		int st3 = 0;

		for (int i = 1; i <= 20; i++) {
			String fName = fNames[r.nextInt(7)];
			String lName = lNames[r.nextInt(7)];
			Student s = new Student();
			s.setName(fName + lName);
			s.setGrade(r.nextInt(3) + 1);
			stList.add(s);
		}

		for (int i = 0; i < stList.size(); i++) {
			Student s = stList.get(i);
			if (1 == s.getGrade()) {
				st1++;

			} else if (2 == s.getGrade()) {
				st2++;

			} else if (3 == s.getGrade()) {
				st3++;

			}
		}

//		if(0 != st1) {
//			System.out.println("1학년 : "+st1 );
//			}
//		if(0 != st2)	{
//			System.out.println("2학년 : "+st2 );
//			}
//		if(0 != st3)	{
//			System.out.println("3학년 : "+st3 );
//			}

//		int[] nums = new int[3];
//		for (Student s : stList) {
//			System.out.println(s);
//			for (int i = 0; i < nums.length; i++) {
//				if (s.getGrade() == (i + 1)) {
//					nums[i]++;
//				}
//			}
//		}
//
//		for (int i = 0; i < nums.length; i++) {
//			if (nums[i] != 0) {
//				System.out.println(i + 1 + "학년: " + nums[i] + "명");
//			}
//		}

		/*
		 * 위의 리스트는 2~3학년까지 랜덤하게 들어간 리스트입니다. 각 학년당 몇명의 학생이 있는지 출력하는 프로그램을 만들어주세요
		 */
//		for(Student s:stList)	{
//			System.out.println(s);
//			
//		}

		
		
		
		
		
		
		
		List<Student> oneList = new ArrayList<>();
		List<Student> twoList = new ArrayList<>();
		List<Student> threeList = new ArrayList<>();

		for (Student s : stList) {
			if (s.getGrade() == 1) {
				oneList.add(s);
			}
			if (s.getGrade() == 2) {
				twoList.add(s);
			}
			if (s.getGrade() == 3) {
				threeList.add(s);
			}
		}

		if(oneList.size()>0)	{
		System.out.print("1학년 : "+ oneList.size() + "명 =");
		for (int i =0; i<oneList.size(); i++)	{
			System.out.print(" "+ oneList.get(i).getName());
		}
		System.out.println();
		}
		if(twoList.size()>0)	{
		System.out.print("2학년 : "+ twoList.size() + "명 =");
		for (int i =0; i<twoList.size(); i++)	{
			System.out.print(" "+ twoList.get(i).getName());
		}
		System.out.println();
		}
		if(threeList.size()>0)	{
		System.out.print("3학년 : "+ threeList.size() + "명 =");
		for (int i =0; i<threeList.size(); i++)	{
			System.out.print(" "+ threeList.get(i).getName());
		}
		}
	}
}
