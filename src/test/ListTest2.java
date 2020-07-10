package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class LOLChamp{
	private String name;
	private int power;
	@Override
	public String toString() {
		return "LOLChamp [name=" + name + ", power=" + power + "]";
	}
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
}

public class ListTest2 {
	public static void main(String[] args) {
		String[] names = {"qq", "ww", "ee", "rr"};
		List<LOLChamp> lolList = new ArrayList<>();
		Random r = new Random();
		
		for(int i=0;i<names.length;i++) {
			LOLChamp lc = new LOLChamp();
			lc.setName(names[i]);
			lc.setPower(r.nextInt(51)+50);
			lolList.add(lc);
			System.out.println(lc);
		}
		
		int max = 0;
		int min = 0;
		int idxx = 0;
		int idxn = 0;
		for(int i=0;i<names.length;i++) {
			LOLChamp lc = lolList.get(i);

			if(min>lc.getPower()) {
				min = lc.getPower();
				idxn = i;
			}
		}
		for(int i=0;i<names.length;i++) {
			LOLChamp lc = lolList.get(i);
			if(max<lc.getPower()) {
				max = lc.getPower();
				idxx = i;
			}
		}
		System.out.println("약한" + lolList.get(idxn));
		System.out.println("강한" + lolList.get(idxx));
		
	}
}
