import java.util.Scanner;

/**
 * SLCC COMP SCI 1400 Final Project- Bacciato's Cuisine
 * Class name~ Table
 * Ty Greenburg, Elijah Nelson, & Daniel Castillo
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Table{

    private boolean occupied;
    private int table_num = 0;
    private int clients_on_Table; //this list counts how many clients there are per table
    private ArrayList<Order> orders; //this list contains all the orders for each table
    public void setPeople(int i){
        clients_on_Table=i;
    }

    public Table(int a){
        occupied = false;
        table_num=a;
        clients_on_Table = 0;
        orders = new ArrayList<Order>();
    }

    public String toString(){
        return "table number: " +table_num;
    }

    public void unoccupy(){
        clients_on_Table = 0;
        occupied = false;
    }

    public void set_status(boolean b){
        occupied = b;
    }

    public boolean getStatus(){
        return occupied;
    }

    public void takeOrders(){
        Scanner scan = new Scanner(System.in);
        int customer = 1;
        if(occupied == false){
            for(int i=0;i< clients_on_Table;i++){
                orders.add(new Order()); //error is right here idk how to fix it but it is here
                System.out.println("What would customer " + customer + " like for their appetizer? \n 1. Bruschetta |\t $5.99 \n 2. Baked Goat Cheese Dip |\t $8.99 ");
                int a = scan.nextInt();
                int n = 1;
                System.out.println("What would customer " + customer + " like for their entree? \n 1. Chicken Scarpariello |\t $15.99 \n 2. Italian Risotto |\t $21.99 \n 3. Braciole |\t $34.99");
                int e = scan.nextInt();
                int w = 1;
                System.out.println("What would customer " + customer + " like for their dessert? \n 1. Zabaglione |\t $16.99 \n 2. Bombolini |\t $17.99 \n 3. Peach and Almond Crostata |\t $11.99");
                int d = scan.nextInt();
                int h = 1;
                //say what they want 1-3 and how many
                orders.get(i).set_appetizers(a,n);
                orders.get(i).set_entree(e,w);
                orders.get(i).set_desert(d,h);
                orders.get(i).total();
                customer++;

            }
        }
        else
            System.out.println("An error has occurred. Your table might be full");
    }

}
