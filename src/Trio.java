public class Trio implements MenuItem{
    private Sandwich sandwich;
    private Salad salad;
    private Drink drink;
    public Trio(Sandwich sandwich, Salad salad, Drink drink){
        this.sandwich = sandwich;
        this.salad = salad;
        this.drink = drink;
    }
    public String getName(){
        return(this.sandwich.getName()+ "/" + this.salad.getName() + "/" + this.drink.getName() + " Trio Price: ");
    }
    public double getPrice(){
        if(sandwich.getPrice() < salad.getPrice() && sandwich.getPrice() < drink.getPrice()){
            return (salad.getPrice()+drink.getPrice());
        }
        if(salad.getPrice() < sandwich.getPrice() && salad.getPrice() < drink.getPrice()){
            return (sandwich.getPrice()+drink.getPrice());
        }
        else{
            return (salad.getPrice()+sandwich.getPrice());
        }
    }
}

