
package electronic_divices_shop;
import java.util.*;
public class Inventory {
static ArrayList<Double>Receipt=new ArrayList<>();
static ArrayList<Laptop> lap= new ArrayList<>();
static ArrayList<Phone> pho= new ArrayList<>();
static ArrayList<Camera> cam= new ArrayList<>();
static ArrayList<TV> tv= new ArrayList<>();

    public Inventory() {
    lap.add(new Laptop("APPLE",40000 , "White", 10));
    lap.add(new Laptop("SAMSUNG",15000 , "Black", 11));
    lap.add(new Laptop("TOSHIBA",15000 , "Grey", 12));
    lap.add(new Laptop("ALINWARE",17000 , "White", 13));
    lap.add(new Laptop("DELL",19000 , "Grey", 14));
    lap.add(new Laptop("HP",15000 , "White", 15));
    lap.add(new Laptop("ACER",15000 , "Red", 16));
    lap.add(new Laptop("ASUS",23000 , "Black", 17));

    //*************************************************
     pho.add(new Phone("Apple",32000 , "Gold", 125));
     pho.add(new Phone("Oppo",7000 , "Red", 320));
     pho.add(new Phone("Huawei",6000 , "Black", 140));
     pho.add(new Phone("Samsung",12000 , "Silver", 160));
     pho.add(new Phone("Poco",4000 , "Blue", 510));
     pho.add(new Phone("Nokia",4200 , "White", 510));
     pho.add(new Phone("Techno",3000 , "pink", 510));
    //**************************************************
     cam.add(new Camera("Apple", 9000, "Black", 122));
     cam.add(new Camera("Canon", 7000, "Silver", 123));
     cam.add(new Camera("NIKON", 4000, "Black", 124));
     cam.add(new Camera("Samsung", 5000, "Black", 125));
    //**************************************************
    tv.add(new TV("LG", 8000, "Black", 70, 42));
    tv.add(new TV("Sharp", 7200, "Black", 71, 42));
    tv.add(new TV("SAMSUNG", 9000, "Black", 72, 42));
    tv.add(new TV("SONY", 8500, "Black", 73, 42));
    

    } 
    public void getReceipt(int n){

                Receipt.add(Inventory.lap.get(n).getPrice());
                System.out.println("The Receipt is "+Receipt);
                    System.out.println("*************************");
                    System.out.println("Thank You For Your Visit");
                    System.out.println("*************************");
    }
        public void getReceipt2(int n){

                Receipt.add(Inventory.pho.get(n).getPrice());
                System.out.println("The Receipt is "+Receipt);
                    System.out.println("*************************");
                    System.out.println("Thank You For Your Visit");
                    System.out.println("*************************");
    }
                public void getReceipt3(int n){

                Receipt.add(Inventory.tv.get(n).getPrice());
                System.out.println("The Receipt is "+Receipt);
                    System.out.println("*************************");
                    System.out.println("Thank You For Your Visit");
                    System.out.println("*************************");
    }
                 public void getReceipt4(int n){
                Receipt.add(Inventory.cam.get(n).getPrice());
                System.out.println("The Receipt is "+Receipt);
                    System.out.println("*************************");
                    System.out.println("Thank You For Your Visit");
                    System.out.println("*************************");
    }
    
}
