public class market {
    public static void main(String[] args) {
        // noOfItem, priceOfItem, currency, totalprice
        // Cheeseballs
        int noOfcheeseballs = 50;
        float priceOfItem = 9.99f;
        char currency = '$';
        float totalPrice = noOfcheeseballs * priceOfItem;
        System.out.println("cheese price"+currency+ totalPrice);

        // Fruitballs
        int noOffruitballs = 12;
        float pricePerItem = 10.99f;
        char currencyy = '$';
        float totalprice = noOffruitballs * pricePerItem;
        System.out.println("fruit price"+ currencyy+ totalprice);

        
        // Balls
        int balls = 10;
        float priceofItem = 5.98f;
        float total = balls * priceofItem;
        System.out.println("ball price"+ currencyy+ total);

        float totalSum = totalPrice + totalprice + total;

        System.out.println("TOTAL PRICE :" + " " + totalSum);
    }
    
}
