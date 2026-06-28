package Enum;
enum Laptop{
    Victus(1200),
    Pavilion(2300),
    Omen(3000),
    Macbook(4000),
    AsusROG(3500),
    Thinkpad;
    private int price;
    Laptop(){
        price=650;
    }
    Laptop(int price){
        this.price=price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
}
public class LaptopEnum {
    public static void main(String[] args) {
        Laptop lap1= Laptop.AsusROG;
        System.out.println(lap1);
        Laptop LL[]= Laptop.values();
        for(Laptop L:LL){
            System.out.println(L);
        }
        System.out.println(Laptop.Thinkpad.ordinal());
        System.out.println(Laptop.Macbook.getPrice());
        Laptop.Macbook.setPrice(4444);
        System.out.println(Laptop.Macbook.getPrice());
    }
}
