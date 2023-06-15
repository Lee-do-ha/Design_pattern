abstract class coffee{
    public abstract int getPrice();

    public abstract String getType();

    @Override
    public String toString(){
        if(getType() == null){
            return "다시주문해주세요!!";
        }else{
            return "this " + this.getType() + " is " + this.getPrice();
        }
    }
}

class coffeeFactory{
    public static coffee getCoffee(String type, int price){
        if("Latte".equalsIgnoreCase(type)){
            return new Latte(type, price);
        }else if("Americano".equalsIgnoreCase(type)){
            return new Americano(type, price);
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

    @Override
    public String getType() {
        return null;
    }
}

class Latte extends coffee{
    private int price;

    private String type;

    public Latte(String type, int price){
        this.type = type;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getType() {
        return this.type;
    }
}

class Americano extends coffee{
    private int price;

    private String type;

    public Americano(String type, int price){
        this.type = type;
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getType() {
        return this.type;
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
