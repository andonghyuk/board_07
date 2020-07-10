package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class	Food	{
	private String name;
	private int price;
	private String locale;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	@Override
	public String toString() {
		return "Food [name=" + name + ", price=" + price + ", locale=" + locale + "]";
	}
	
	
}

public class ListTest5 {
	public static void main (String[] args)	{
		List<Food> fList = new ArrayList<>();
		String[] locales = {"한식","중식","양식","일식","분식","경양식"};
		Random r = new Random();
		List<Food> f2List = new ArrayList<>	();
		List<Food> f3List = new ArrayList<>	();
		
		int maxPrice = 0;
		int minPrice = 0;
		for(int i=1; i<=30; i++) {
			Food f = new Food();
			f.setLocale(locales[r.nextInt(locales.length)]);
			f.setName("음식"+i);
			f.setPrice((r.nextInt(10)+1)*1000);
			fList.add(f);
//			System.out.println();
		}
		
		System.out.println(fList);
		for(int i=0; i<fList.size(); i++)	{
			Food f = fList.get(i);
			 if (fList.get(maxPrice).getPrice()<f.getPrice())	{
					maxPrice = i;
				}
				 if(fList.get(minPrice).getPrice()>f.getPrice())	{
					 minPrice = i;
				}
		}
		
		
		for(int i =0; i<fList.size(); i++)	{
			Food f = fList.get(i);
			Food f1 = new Food();
		
		
				if( fList.get(maxPrice).getPrice()== fList.get(i).getPrice()  ){
					f1.setLocale(fList.get(i).getLocale());
					f1.setName(fList.get(i).getName());
					f1.setPrice(fList.get(i).getPrice());
					f2List.add(f1);
					}
				
				if(fList.get(minPrice).getPrice()== fList.get(i).getPrice() ){
					f1.setLocale(fList.get(i).getLocale());
					f1.setName(fList.get(i).getName());
					f1.setPrice(fList.get(i).getPrice());
					f3List.add(f1);
				
			
		}
		}
//		System.out.println("제일비싼음식 : "+ fList.get(maxPrice));
//		System.out.println("제일저렴한 음식 : "+fList.get(minPrice));
		System.out.println(f2List);
		System.out.println(f3List);
			/* 음식 가격은 천원부터 만원까지
			 * 단, 천단위로  이루어져야함
			 * 제일 비싼 음식과 저렴한 음식을 찾아서 출력
			 */
			
		
		
		
			
		
		
		
		
		
	}
	
	
}
