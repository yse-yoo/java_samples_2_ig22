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
		
		Drink selectDrink = drinkMap.get(1);
		System.out.println(selectDrink.name);
		System.out.println(selectDrink.price);


	}

}
