// Daniel Castillo 2-3 Orderc CSIS 1400
import java.util.Scanner;

public class Orderc
{

    private int salads;
    private int desserts;
    private int numOfEntrees;
    private String entrees;
    private int OrdercID;
    private static int numOfOrdercs = 0;

    public Orderc(){
        salads = 0;
        desserts = 0;
        numOfEntrees = 0;
        entrees = " ";
        numOfOrdercs++;
        OrdercID = numOfOrdercs;
    }

    public int getSalads(){
        return salads; 
    }
    public int getDesserts(){
        return desserts; 
    }
    public void setSalads(int numSalads){
        salads = numSalads;
    }
    public void setDesserts(int numDesserts){
        desserts = numDesserts;
    }
    public int getEntrees(){
        return numOfEntrees;
    }
    public void addEntrees(String entrees){
        this.entrees = entrees;
        numOfEntrees++;
    }
    public int getOrdercID(){
        return OrdercID;
    }
    private double calculateCost(){
        
        return  numOfEntrees * 2.50 + desserts * 1.50 + salads * 1.00;
    }
    public double getCost(){
        return calculateCost();
    }
    public static void main(String[]args){
        Boolean Ordercsdone = false;
        while(!Ordercsdone){
            
            

        Orderc table1 = new Orderc(); 
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Bacciato's Cousine. How many salads would you like?");
        int numSalads = scan.nextInt();
        table1.setSalads(numSalads);
        
        System.out.println("How many desserts would you like?");
        int numDesserts = scan.nextInt();
        table1.setDesserts(numDesserts);
        
        scan.nextLine();
        Boolean done = false;
        while(!done){
            
            System.out.println("What entree would you like first? (Pasta Alfredo, Lasagna, Pasta Carbonara)");
            String choice = scan.nextLine();
            table1.addEntrees(choice);
            
            System.out.println("Would you like to add another entree? Y/N");
            String more = scan.nextLine();
            
            if(more.equals("N")){
                done = true;
            }else if(more.equals("Y")){
                done = false;
            }else{
                System.out.println("make sure to say Y for yes or N for no");
            }
        }

        System.out.println("Thanks for Ordering. Your Order consists of " + table1.getDesserts() + " desserts, " + table1.getSalads() + " salads, and " + table1.getEntrees() + " entrees");
        System.out.println("These are your entrees: " + table1.getEntrees() + ".");
        
        System.out.println("Order ID: " + table1.getOrdercID() + " .Your total is: " + table1.getCost());
        
        System.out.println("Do you want another Order? Y/N");
        String choice = scan.nextLine();
        if(choice.equals("Y")){
            Ordercsdone = false;
        }else if(choice.equals("N")){
            Ordercsdone = true;
        }else{
            System.out.println("Make sure you input Y for yes or N for no");
            
        }

    }
}
}

