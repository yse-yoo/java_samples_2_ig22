package lambda;

public class AppRun {

    public static void main(String[] args) {
        Runnable runner = ()-> System.out.println("Hello!!!");
        runner.run();
        
        hello(() -> showMessage("こんにちは"));
        hello(() -> totalPrice(350, 3));
    }

    public static void showMessage(String message) {
       System.out.println(message); 
    }
    
    public static void totalPrice(Integer price, Integer amount) {
       Integer totalPrice = price * amount;
       System.out.println(totalPrice); 
    }
    
    public static void hello(Runnable runner) {
        runner.run();
    }

}
