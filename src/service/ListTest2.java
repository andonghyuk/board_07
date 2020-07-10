package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class LoLChamp	{
	private String name;
	private int power;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	@Override
	public String toString() {
		return "LoLChamp [name=" + name + ", power=" + power + "]";
	}
}

public class ListTest2 {
	
	public static void main(String[] args)	{
		String[] names = {"티모","나미","람머스","나무","징크스","애쉬"};
		List<LoLChamp> lolList = new ArrayList<>();
		Random r = new Random();
		

		
		for(int i=0;i<names.length;i++)	{
			LoLChamp lc = new LoLChamp();
			lc = new LoLChamp();
			lc.setName(names[i]);
			lc.setPower(r.nextInt(51)+50);
			lolList.add(lc);
		}
		
		System.out.println(lolList);
		
		int max =0;
		int idx = 0;
		for(int i=0; i<names.length;i++)	{
			LoLChamp lc = new LoLChamp();
			lc = lolList.get(i);
			if(max<lc.getPower()) {
			max = lc.getPower();
			idx = i;
				}
			
		}
		System.out.println("최고센 : "+lolList.get(idx));
			
	
//		System.out.println(lolList);	
	}
	
	
}
