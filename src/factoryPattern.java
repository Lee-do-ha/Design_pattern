abstract class coffee{
    public abstract int getPrice();

    @Override
    public String toString(){
        return "this coffee is " + this.getPrice();
    }
}

class coffeeFactory{
    public static coffee getCoffee(String type, int price){
        if("Latte".equalsIgnoreCase(type)){
            return new Latte(price);
        }else if("Americano".equalsIgnoreCase(type)){
            return new Americano(price);
        }else{
            return new DefaultCoffee();
        }
    }
}

class DefaultCoffee extends coffee{
    private int price;

    public DefaultCoffee(){
        this.price = -1;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}

class Latte extends coffee{
    private int price;

    public Latte(int price){
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}

class Americano extends coffee{
    private int price;

    public Americano(int price){
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}

public class factoryPattern {
    public static void main(String[] args) {
        coffee Latte = coffeeFactory.getCoffee("Latte", 4000);
        coffee Americano = coffeeFactory.getCoffee("Americano", 3000);

        System.out.println(Latte);
        System.out.println(Americano);
    }
}
