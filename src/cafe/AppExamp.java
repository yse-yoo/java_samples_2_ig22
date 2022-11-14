package cafe;

import java.util.HashMap;
import java.util.Map;

public class AppExamp {
    static int sum = 0;

    public static void main(String[] args) {
        Map<String, Drink> drinkMap = new HashMap<>();
        drinkMap.put("D0001L", new Drink("Coffee", 500, Size.LARGE));
        drinkMap.put("D0001M", new Drink("Coffee", 450, Size.MEDIUM));
        drinkMap.put("D0001S", new Drink("Coffee", 350, Size.SMALL));

        for (Drink drink : drinkMap.values()) {
            System.out.println(drink.size.getValue());
        }

        drinkMap.values().forEach((drink) -> {
            sum += drink.price;
            System.out.println(drink.price);
        });
        System.out.println(sum);

    }

}
