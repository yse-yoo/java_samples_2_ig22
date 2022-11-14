package cafe;

import java.util.HashMap;
import java.util.Map;

public class AppMap {

	public static void main(String[] args) {
//		ArrayList<Drink> drinkList = new ArrayList<>();

		Map<Integer, Drink> drinkMap = new HashMap<>();
		drinkMap.put(1, new Drink("コーヒー", 350));
		drinkMap.put(2, new Drink("紅茶", 400));
		drinkMap.put(3, new Drink("ほうじ茶", 300));
	
		for (Integer key : drinkMap.keySet()) {
			System.out.println(key);
		}
		
		for (Drink drink : drinkMap.values()) {
			System.out.println(drink.name);
		}
		
		Drink selectDrink = drinkMap.get(3);
		System.out.println(selectDrink.name);
		System.out.println(selectDrink.price);

		// Mapのデータ個数
		int count = drinkMap.size();
		System.out.println(count);

		System.out.println("--- remove ---");
		drinkMap.remove(1);
		for (Drink drink : drinkMap.values()) {
			System.out.println(drink.name);
		}
		
		//演習
		System.out.println("---Q1---");
		//問題1
		Map<Integer, String> foodMap = new HashMap<>();
		foodMap.put(1, "Apple");
		foodMap.put(2, "Peach");
		foodMap.put(3, "Grape");
		
		//問題2
		System.out.println("---Q2---");
		String foodName = foodMap.get(2);
		System.out.println(foodName);
		
		//問題3
		System.out.println("---Q3---");
		for (String name : foodMap.values()) {
			System.out.println(name);
		}

		//問題4
		System.out.println("---Q4---");
		Map<String, String> cityMap = new HashMap<>();
		cityMap.put("tokyo", "東京");
		cityMap.put("osaka", "大阪");
		cityMap.put("yokohama", "横浜");

		//問題5
		System.out.println("---Q5---");
		for (String cityKey : cityMap.keySet()) {
			System.out.println(cityKey);
		}

	}

}
