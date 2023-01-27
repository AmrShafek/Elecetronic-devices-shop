
package electronic_divices_shop;
import java.util.*;
public class Laptop extends Product{
    private double sale;
    // ArrayList<Laptop> lap= new ArrayList<>();
    public Laptop(String name, double price, String color, int stockNum) {
        super(name, price, color, stockNum);

      
    }
    
    @Override
    public void showFeatures() {
        System.out.println("Name of product: "+getName()+"\n"+
                "Price: " + getPrice()+"\n"+
                "Color: "+getColor()+"\n"+
                "The Stock Number: "+getStockNum());
    }
    @Override
    public void OurProuduct(){
    HashSet<String> Lap = new  HashSet<>();
    Lap.add("APPLE");
    Lap.add("SAMSUNG");
    Lap.add("TOSHIBA");
    Lap.add("ALINWARE");
    Lap.add("DELL");
    Lap.add("HP");
    Lap.add("ACER");
    Lap.add("ASUS");
        System.out.println(Lap);
    }

    }

    
    

