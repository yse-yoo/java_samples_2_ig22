package cafe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class AppIterator {

	public static void main(String[] args) {
		System.out.println("--- ArrayList Iterator ---");
		ArrayList<Drink> drinkList = new ArrayList<>();
		drinkList.add(new Drink("コーヒー", 350));
		drinkList.add(new Drink("紅茶", 400));
		drinkList.add(new Drink("ほうじ茶", 300));

		//イテレーター
		Iterator<Drink> iterator = drinkList.iterator();
		while (iterator.hasNext()) {
			Drink drink = iterator.next();
			System.out.println(drink.name);
		}

		//Mapデータ
		System.out.println("--- Map Iterator ---");
		Map<Integer, Drink> drinkMap = new HashMap<>();
		drinkMap.put(1, new Drink("コーヒー", 350));
		drinkMap.put(2, new Drink("紅茶", 400));
		drinkMap.put(3, new Drink("ほうじ茶", 300));
		
		Iterator<Integer> mapIterator = drinkMap.keySet().iterator();
		while (mapIterator.hasNext()) {
			Integer key = mapIterator.next();
			System.out.println(key);
		}


	}

}
