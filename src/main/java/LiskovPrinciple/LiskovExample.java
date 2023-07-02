package LiskovPrinciple;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.sql.SQLOutput;

public class LiskovExample {
    public static class MenuItem{
        public int price;
        public String name;
        public String description;

        public MenuItem(int price, String name, String description) {
            this.price = price;
            this.name = name;
            this.description = description;
        }

        public int getPrice() {
            return this.price;
        }
    };
    public static class BeverageItem extends MenuItem{
        public BeverageItem(int price, String name, String description) {
            super(price, name, description);
        }
        public double getPriceWithDiscount(int discountPercent){
            return this.price-(discountPercent*.01*this.price);
        }
    }
    public static void printItemPrice(MenuItem item){
        //we have to call the classes differently as MenuItem does not contain the method contained in it's subclass
        //This violates Liskov principle
        //This is the client code and shd not be changed in it's fn. call
        if(item instanceof BeverageItem){
            System.out.println("Beverage Item Price");
            System.out.println((((BeverageItem) item).getPriceWithDiscount(10)));
        }
        else{
            System.out.println("MenuItem price");
            System.out.println(item.getPrice());
        }
    }

    public static void main(String[] args) {
        MenuItem menuItem = new MenuItem(100,"Bread","wheat flour bread");
        BeverageItem beverageItem = new BeverageItem(60,"coke","cold beverage");

        printItemPrice(menuItem);
        printItemPrice(beverageItem);
    }
}
