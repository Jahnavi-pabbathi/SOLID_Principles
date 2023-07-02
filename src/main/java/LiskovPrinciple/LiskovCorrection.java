package LiskovPrinciple;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

import java.sql.SQLOutput;

public class LiskovCorrection {
    public static class MenuItem{
        public int price;
        public String name;
        public String description;

        public MenuItem(int price, String name, String description) {
            this.price = price;
            this.name = name;
            this.description = description;
        }

        public double getPrice() {
            return this.price-this.getDiscount();
        }
        // This is included bcaz if in future a discount is included in menuitem we need not change the code at that time
        // and any subclass can simply override this fn.
        private double getDiscount(){
            return 0;
        }
    };
    public static class BeverageItem extends MenuItem{
        public BeverageItem(int price, String name, String description) {
            super(price, name, description);
        }

        public double getPrice() {
            return this.price-this.getDiscount();
        }

        private double getDiscount(){
            int discountPercent=10;
            return discountPercent*.01*this.price;
        }
//        public double getPriceWithDiscount(int discountPercent){
//            return this.price-(discountPercent*.01*this.price);
//        }
    }
    public static void printItemPrice(MenuItem item){
        System.out.println("item price");
        System.out.println(item.getPrice());
    }

    public static void main(String[] args) {
        MenuItem menuItem = new MenuItem(100,"Bread","wheat flour bread");
        BeverageItem beverageItem = new BeverageItem(60,"coke","cold beverage");

        printItemPrice(menuItem);
        printItemPrice(beverageItem);
    }
}
