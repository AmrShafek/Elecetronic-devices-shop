
package electronic_divices_shop;
import java.util.*;
import java.util.Scanner;
public class Electronic_Divices_Shop {
 private static Inventory s =new Inventory();
 public static void main(String[] args) {
 final Scanner input =new Scanner(System.in);
 Product obj;
 String con;
 String option ;
 boolean q=true;
 while (q){
 System.out.println("Enter \"Laptops\" to knew Our Products");
 System.out.println("Enter \"Phones\" to knew Our Products");
 System.out.println("Enter \"TVs\" to knew Our Products");
 System.out.println("Enter \"Cameras\" to knew Our Products");
  System.out.println("Enter \"end\" to finish");
 option =input.nextLine();
 switch(option){
    case "Laptops":
        String Laptops;
        obj = new Laptop("Apple", 1000, "White", 1);
        obj.OurProuduct();
        System.out.println("Enter Your favourit Type ");
        Laptops = input.nextLine();
        switch(Laptops){
       
        case"APPLE":
            obj = new Laptop("APPLE",40000 , "White", 10);
            obj.showFeatures();
            System.out.println("To confirm your Purchase press \"CONFIRM\" Or \"Exit\"");
            con = input.nextLine();
            if("CONFIRM".equals(con)){
            s.getReceipt(0);}      
            break;
            
        case "SAMSUNG":
            obj = new Laptop("SAMSUNG",15000 , "Black", 11);
            obj.showFeatures();
            System.out.println("To confirm your Purchase press \"CONFIRM\" Or \"Exit\"");
            con = input.nextLine();
            if("CONFIRM".equals(con)){
            s.getReceipt(1);}
            break;
        case "TOSHIBA":
            obj = new Laptop("TOSHIBA",15000 , "Grey", 12);
            obj.showFeatures();
            System.out.println("To confirm your Purchase press \"CONFIRM\" Or \"Exit\"");
            con = input.nextLine();
            if("CONFIRM".equals(con)){
            s.getReceipt(2);}


            break;
        case"ALINWARE":
            obj = new Laptop("ALINWARE",17000 , "White", 13);
            obj.showFeatures();
            System.out.println("To confirm your Purchase press \"CONFIRM\" Or \"Exit\"");
            con = input.nextLine();
            if("CONFIRM".equals(con)){
            s.getReceipt(3);}
            break;            
        case"DELL":
            obj= new Laptop("DELL",19000 , "Grey", 14);
            obj.showFeatures();
            System.out.println("To confirm your Purchase press \"CONFIRM\" Or \"Exit\"");
            con = input.nextLine();
            if("CONFIRM".equals(con)){
            s.getReceipt(4);}
            break;   
        case"HP":
            obj = new Laptop("HP",15000 , "White", 15);
            obj.showFeatures();
            System.out.println("To confirm your Purchase press \"CONFIRM\" Or \"Exit\"");
            con = input.nextLine();
            if("CONFIRM".equals(con)){
            s.getReceipt(5);}
            break;
        case"ACER":
            obj= new Laptop("APPLE",40000 , "White", 10);
            obj.showFeatures();
            System.out.println("To confirm your Purchase press \"CONFIRM\" Or \"Exit\"");
            con = input.nextLine();
            if("CONFIRM".equals(con)){
            s.getReceipt(6);}
            break;             
        case"ASUS":
            obj= new Laptop("APPLE",40000 , "White", 10);
            obj.showFeatures();
            System.out.println("To confirm your Purchase press \"CONFIRM\" Or \"Exit\"");
            con = input.nextLine();
            if("CONFIRM".equals(con)){
            s.getReceipt(7);}
            break;            
        }
        
 
        break;
    case "Phones":
        String Phones;
        obj = new Phone("Apple", 1000, "White", 1);
        obj.OurProuduct();
        System.out.println("Enter Your favourit Type ");
        Phones = input.nextLine();
        switch (Phones){
            case "Apple":
                obj=new Phone("Apple",32000 , "Gold", 125);
                obj.showFeatures();
                System.out.println("To confirm your Purchase press \"CONFIRM\" Or \"Exit\"");
                con = input.nextLine();
                if("CONFIRM".equals(con)){
                 s.getReceipt2(0);}
                  break;
            case "Oppo":
                obj=new Phone("Oppo",7000 , "Red", 320);
                obj.showFeatures();
                System.out.println("To confirm your Purchase press \"CONFIRM\" Or \"Exit\"");
                con = input.nextLine();
                 if("CONFIRM".equals(con)){
                 s.getReceipt2(1);}
                 break;
            case "Huawei":
                obj =new Phone("Huawei",6000 , "Black", 140);
                obj.showFeatures();
                System.out.println("To confirm your Purchase press \"CONFIRM\" Or \"Exit\"");
                con = input.nextLine();
                 if("CONFIRM".equals(con)){
                 s.getReceipt2(2);}
            break;
            case "Samsung":
                obj =new Phone("Samsung",12000 , "Silver", 160);
                obj.showFeatures();
                System.out.println("To confirm your Purchase press \"CONFIRM\" Or \"Exit\"");
                con = input.nextLine();
               if("CONFIRM".equals(con)){
                 s.getReceipt2(3);}
            break;
            case "Poco":
                obj=new Phone("Poco",4000 , "Blue", 510);
                obj.showFeatures();
                System.out.println("To confirm your Purchase press \"CONFIRM\" Or \"Exit\"");
                con = input.nextLine();
                if("CONFIRM".equals(con)){
                s.getReceipt2(4);}
                 break;
            case "Nokia":
                obj =new Phone("Nokia",4200 , "White", 510);
                obj.showFeatures();
                System.out.println("To confirm your Purchase press \"CONFIRM\" Or \"Exit\"");
                con = input.nextLine();
                if("CONFIRM".equals(con)){
                 s.getReceipt2(5);}
            break;
            case "Techno":
                obj =new Phone("Techno",3000 , "pink", 510);
                obj.showFeatures();
                System.out.println("To confirm your Purchase press \"CONFIRM\" Or \"Exit\"");
                con = input.nextLine();
                 if("CONFIRM".equals(con)){
                 s.getReceipt2(6);}
            break;
        }
    
    case "TVs":
        String TVs;
        obj = new TV("Apple", 1000, "White", 1,42);
        obj.OurProuduct();
        System.out.println("Enter Your favourit Type ");
        TVs = input.nextLine();
            switch(TVs){
            case "LG":
                obj=new TV("LG", 8000, "Black", 70, 42);
                obj.showFeatures();
                System.out.println("To confirm your Purchase press \"CONFIRM\" Or \"Exit\"");
                con = input.nextLine();
                 if("CONFIRM".equals(con)){
                 s.getReceipt3(0);}
            break;
                case "Sharp":
                obj=new TV("Sharp", 7200, "Black", 71, 42);
                obj.showFeatures();
                System.out.println("To confirm your Purchase press \"CONFIRM\" Or \"Exit\"");
                con = input.nextLine();
                 if("CONFIRM".equals(con)){
                 s.getReceipt3(1);}
            break;
                case "SAMSUNG":
                obj=new TV("SAMSUNG", 9000, "Black", 72, 42);
                obj.showFeatures();
                System.out.println("To confirm your Purchase press \"CONFIRM\" Or \"Exit\"");
                con = input.nextLine();
                 if("CONFIRM".equals(con)){
                 s.getReceipt3(2);}
            break;            
                case "SONY":
                obj =new TV("SONY", 8500, "Black", 73, 42);
                obj.showFeatures();
                System.out.println("To confirm your Purchase press \"CONFIRM\" Or \"Exit\"");
                con = input.nextLine();
                 if("CONFIRM".equals(con)){
                 s.getReceipt3(3);}
            break;
            }            
            case "Cameras":
            String Cameras;
            obj= new Camera("Apple", 1000, "White", 1);
            obj.OurProuduct();
            System.out.println("Enter Your favourit Type ");
            Cameras = input.nextLine();
            switch(Cameras){
                case "Apple":
                obj=new Camera("Apple", 9000, "Black", 122);
                obj.showFeatures();
                System.out.println("To confirm your Purchase press \"CONFIRM\" Or \"Exit\"");
                con = input.nextLine();
                 if("CONFIRM".equals(con)){
                 s.getReceipt3(0);}
            break;   
                case "Canon":
                obj=new Camera("Canon", 7000, "Silver", 123);
                obj.showFeatures();
                System.out.println("To confirm your Purchase press \"CONFIRM\" Or \"Exit\"");
                con = input.nextLine();
                 if("CONFIRM".equals(con)){
                 s.getReceipt3(1);}
            break;             
                case "NIKON":
                obj=new Camera("NIKON", 4000, "Black", 124);
                obj.showFeatures();
                System.out.println("To confirm your Purchase press \"CONFIRM\" Or \"Exit\"");
                con = input.nextLine();
                 if("CONFIRM".equals(con)){
                 s.getReceipt3(2);}
            break; 
                case "Samsung":
                obj=new Camera("Samsung", 5000, "Black", 125);
                obj.showFeatures();
                System.out.println("To confirm your Purchase press \"CONFIRM\" Or \"Exit\"");
                con = input.nextLine();
                 if("CONFIRM".equals(con)){
                 s.getReceipt3(3);}
            break;                      
            }
        case "end":
                   System.out.println("*************************");
                   System.out.println("Thank You For Your Visit");
                   System.out.println("*************************");
            q=false;
            break;
 } // The big Switch
   }
                 
 
            }
    
}
