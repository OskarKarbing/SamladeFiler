package InterfaceLabb;

public class Socks extends Clothes {
    int amount;
    public Socks(String brand,Double price,  String season,int amount) {

        super.brand = brand;
        super.price = price;
        super.season = season;
        this.amount = amount;
    }
}
