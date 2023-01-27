
package electronic_divices_shop;

import java.util.*;

public class Camera extends Product {
    private double sale;
    public Camera(String name, double price, String color, int stockNum) {
        super(name, price, color, stockNum);
    }
    @Override
    public void showFeatures() {
        System.out.println("Name of product: "+getName()+"\n"+
                "Price: " + getPrice()+"\n"+
                "Color: "+getColor()+"\n"+
                "The Stock Number: "+getStockNum());
    }
    public void set(double x){
    this.sale=x;
    }
    @Override
    public void OurProuduct(){
    HashSet <String> CA = new  HashSet();
    CA.add("APPLE");
    CA.add("CANON");
    CA.add("NIKON");
    CA.add("SAMSUNG");
    System.out.println(CA);}
    
    }
    

