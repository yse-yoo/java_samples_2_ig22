package thread;

public class Item {
    public String name;

    public Item(String name) {
        super();
        this.name = name;
    }
    
    public void order() {
        System.out.println(name);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("--- Ordered ---");
    }

}
