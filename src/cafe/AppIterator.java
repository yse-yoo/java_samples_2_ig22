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
			sum += score;
		}
		System.out.println(sum);
		
		float average = sum / scores.size();
		System.out.println(average);

		sum = 0;
		for (Integer score : scores) {
			sum += score;
		}
		System.out.println(sum);

		// Q2
		Map<String, String> cityMap = new HashMap<>();
		cityMap.put("tokyo", "東京");
		cityMap.put("osaka", "大阪");
		cityMap.put("yokohama", "横浜");
		
		Iterator<String> cityValueIterator = cityMap.values().iterator();
		while (cityValueIterator.hasNext()) {
			String cityName = cityValueIterator.next();
			System.out.println(cityName);
		}
		
		for (String cityName : cityMap.values()) {
			System.out.println(cityName);
		}
		
		
		//q3
		Map<Integer, Score> scoreMap = new HashMap<>();
		scoreMap.put(1, new Score("A", 67));
		scoreMap.put(2, new Score("B", 91));
		scoreMap.put(3, new Score("C", 55));
		scoreMap.put(4, new Score("D", 83));
		scoreMap.put(5, new Score("E", 74));
		
		for (Score score : scoreMap.values()) {
			System.out.println(score.name);
			System.out.println(score.value);
		}
		
	}

}
