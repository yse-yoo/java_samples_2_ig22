package lambda;

public class App2 {

    public static void main(String[] args) {

        ICalculate calculate = new ICalculate() {
            @Override
            public Integer totalPrice(Integer price) {
                Float totalPrice = price * 1.1f;
                return totalPrice.intValue();
            }
        };
            
        Integer price = calculate.totalPrice(1000);
        System.out.println(price);

        price = calculate.totalPrice(2563);
        System.out.println(price);
    }

}
