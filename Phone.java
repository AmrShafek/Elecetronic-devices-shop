
package electronic_divices_shop;

import java.util.*;

public class Phone extends Product{
    public Phone(String name, double price, String color, int stockNum) {
        super(name, price, color, stockNum);

     }
     
    @Override
    public void  OurProuduct(){
    HashSet<String> PH = new  HashSet<>();
    PH.add("Apple");
    PH.add("Oppo");
    PH.add("Huawei");
    PH.add("Samsung");
    PH.add("Techno");
    PH.add("Poco");
    PH.add("Nokia");
    System.out.println(PH);}
    @Override
    public void showFeatures() {
        System.out.println("Name of product: "+getName()+"\n"+
                "Price: " + getPrice()+"\n"+
                "Color: "+getColor()+"\n"+
                "The Stock Number: "+getStockNum());
    }


    
}
