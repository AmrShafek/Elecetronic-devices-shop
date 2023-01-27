package electronic_divices_shop;
import java.util.*;
public class TV extends Product{
    private double sizeOfScreen ;
    public TV(String name, double price, String color, int stockNum,double size) {
        super(name, price, color, stockNum);
        this.sizeOfScreen=size;
    }
    @Override
        public void OurProuduct(){
    HashSet<String> TV = new  HashSet<>();
    TV.add("LG");
    TV.add("Sharp");
    TV.add("TOSHIBA");
    TV.add("SAMSUNG");
    TV.add("SONY");

    System.out.println(TV);}
    @Override
    public void showFeatures() {
        System.out.println("Name of product: "+getName()+"\n"+
                "Price: " + getPrice()+"\n"+
                "Color: "+getColor()+"\n"+
                "The Stock Number: "+getStockNum()+
                "The Size Of Screen: "+getSizeOfScreen());
    }

    public double getSizeOfScreen() {
        return sizeOfScreen;
    }
       
}
