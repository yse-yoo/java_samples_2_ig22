package thread;

import java.util.ArrayList;

public class AppOrder {

    public static void main(String[] args) {
        ArrayList<Item> drinkList = new ArrayList<>();
        drinkList.add(new Item("コーヒー"));
        drinkList.add(new Item("紅茶"));
        drinkList.add(new Item("ほうじ茶"));
        
        for (Item item : drinkList) {
            ShopThread thread = new ShopThread(item);
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}
