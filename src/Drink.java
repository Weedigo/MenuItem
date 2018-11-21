public class Drink implements MenuItem {
    private double price;
    private String name;

    public Drink(double price, String name){
        this.price = price;
        this.name = name;
    }
    @Override
    public double getPrice(){
        return this.price;
    }
    @Override
    public String getName(){
        return this.name;
    }
}
