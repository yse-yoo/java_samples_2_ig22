package thread;

public class ShopThread extends Thread {

    private Item item;

    public ShopThread(Item item) {
        super();
        this.item = item;
    }
    
    @Override
    public void run() {
        item.order();
    }

}
