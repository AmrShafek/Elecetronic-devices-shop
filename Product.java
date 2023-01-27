
package electronic_divices_shop;

abstract public class Product implements Assortment {
    protected String name;
    protected double price;
    protected String color;
    private int stockNum;
    public Product(String name, double price, String color, int stockNum) {
        this.name = name;
        this.price = price;
        this.color = color;
        this.stockNum = stockNum;
        // System.out.println("PRODUCT!!!");
    }
    @Override
    public String getName() { return name; }
    @Override
    public double getPrice() { return price; }
    @Override
    public String getColor() { return color; }
    @Override
    public int getStockNum() { return stockNum; }
    @Override
    public void setStockNum(int stockNum) { this.stockNum = stockNum; }
    @Override
    public void showFeatures() {
        System.out.println("Name of product: "+name+"\n"+
                            "Price: "+price+"\n"+
                            "Color: "+color+"\n"+
                            "Stock Number: "+stockNum);
    }

   abstract public void OurProuduct();


}
