package cafe;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
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

		Iterator<Drink> valueIterator = drinkMap.values().iterator();
		while (valueIterator.hasNext()) {
			Drink drink = valueIterator.next();
			System.out.println(drink.name);
			System.out.println(drink.price);
		}

		//ListIterator
		System.out.println("--- List Iterator ---");
		ListIterator<Drink> listIterator = drinkList.listIterator();
		listIterator.add(new Drink("カフェモカ", 350));
		listIterator.previous();
		while (listIterator.hasNext()) {
			Drink drink = listIterator.next();
			System.out.println(drink.name);
		}
		
		System.out.println("--- Calendar ---");
		int sundayIndex = Calendar.SUNDAY;
		System.out.println(sundayIndex);
		
		//曜日のMap
		System.out.println("--- Calendar Iterator ---");
		Map<Integer, String> weekdays = new HashMap<>();
		weekdays.put(Calendar.SUNDAY, "日");
		weekdays.put(Calendar.MONDAY, "月");
		weekdays.put(Calendar.TUESDAY, "火");
		weekdays.put(Calendar.WEDNESDAY, "水");
		weekdays.put(Calendar.THURSDAY, "木");
		weekdays.put(Calendar.FRIDAY, "金");
		weekdays.put(Calendar.SATURDAY, "土");
		
		Iterator<Integer> weekKeyIterator = weekdays.keySet().iterator();
		while (weekKeyIterator.hasNext()) {
			Integer key = weekKeyIterator.next();
			System.out.println(key);
		}

		Iterator<String> weekValueIterator = weekdays.values().iterator();
		while (weekValueIterator.hasNext()) {
			String weekday = weekValueIterator.next();
			System.out.println(weekday);
		}
		
		//Question 1
		ArrayList<Integer> scores = new ArrayList<>();
		scores.add(76);
		scores.add(81);
		scores.add(92);
		scores.add(56);
		scores.add(73);
		
		int sum = 0;
		Iterator<Integer> scoreIterator = scores.iterator();
		while (scoreIterator.hasNext()) {
			Integer score = scoreIterator.next();
			System.out.println(score);
			//TODO: 合計値の計算
			
		}
		System.out.println(sum);
	}

}
