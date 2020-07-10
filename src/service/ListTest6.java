package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest6 {
	public static void main(String[] args) {
		String[] strs = {"한식","중식","양식","일식"};
		List<String> strList = new ArrayList<>();
		Random r = new Random();
		for(int i=1; i<=20; i++)	{
			int idx = r.nextInt(strs.length);
			strList.add(strs[idx]);
		}
		System.out.println(strList);
		
		int strResutl[] = new int[4];
		
		for(int i=0; i<20; i++) {
			for(int j=0; j<strs.length; j++)	{
				if(strList.get(i).equals(strs[j]))	{
					strResutl[j]++;
				}
			}
				
		}
		for(int j=0;j<strs.length; j++)	{
			System.out.println(strs[j]+" 갯수" + strResutl[j]);
		}
			
	}
}
