package thread;

import java.util.ArrayList;

public class AppSleep {

    public static void main(String[] args) {
        ArrayList<Item> drinkList = new ArrayList<>();
        drinkList.add(new Item("コーヒー"));
        drinkList.add(new Item("紅茶"));
        drinkList.add(new Item("ほうじ茶"));
        
        for (Item item : drinkList) {
            item.order();
        }
    }

}
