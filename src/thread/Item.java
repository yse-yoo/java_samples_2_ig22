package thread;

public class Item {
    public String name;

    public Item(String name) {
        super();
        this.name = name;
    }
    
    public void order() {
        System.out.println(name);
        
        System.out.println("--- Ordered ---");
    }

}
