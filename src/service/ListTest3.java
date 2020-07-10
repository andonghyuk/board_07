package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Bob	{
	private String foodName;
	private int foodPrice;
	
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public int getFoodPrice() {
		return foodPrice;
	}
	public void setFoodPrice(int foodPrice) {
		this.foodPrice = foodPrice;
	}
	
	@Override
	public String toString() {
		return "bob [foodName=" + foodName + ", foodPrice=" + foodPrice + "]";
	}
	
	
}

public class ListTest3 {
	public static void main (String[] args)	{
		List<Bob> bobList = new ArrayList<>();
		Random r = new Random();
		Bob bob = new Bob();
		
		for(int i=0 ;i<40;i++)	{
			bobList.add(bob);
			bob.setFoodName("김치"+1);
			bob.setFoodPrice(r.nextInt(10000)+1);
			
		}
		System.out.println(bob);
	}

}
