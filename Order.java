/**
 * Finds total for customer
 * CSIS 1400
 * Ty, Elijah, Daniel
 * 5/22/24
 */

public class Order
{
    private int appetizer;
    private int entree;
    private int desert;
    private float sum_A;
    private float A_sum;
    private float sum_E;
    private float E_sum;
    private float sum_D;
    private float D_sum;
    private float F_sum;
    private int num_orders_A; //num of orders for appetizer
    private int num_orders_E; //num of order for entree
    private int num_orders_D; //num of orders for deserts
    private float [] price_A = {5.99f,8.99f}; //price for appetizer
    private float [] price_E = {15.99f,21.99f,34.99f}; //price for entree
    private float [] price_D = {16.99f,17.99f,11.99f}; // price for desert
    public Order(){
        sum_A=0;
        A_sum=0;
        sum_E=0;
        E_sum=0;
        sum_D=0;
        D_sum=0;
    }

    public void set_appetizers(int appetizer,int num_orders_A){
        sum_A = price_A [appetizer-1];
        A_sum = sum_A*num_orders_A;
    }

    public float get_appetizers(){
        return A_sum;
    }

    public void set_entree(int entree,int num_orders_E){
        E_sum = sum_E*num_orders_E;
    }

    public float get_entree(){
        return E_sum;
    }

    public void set_desert(int desert,int num_orders_D){
        sum_D = price_D [desert-1];
        D_sum = sum_D*num_orders_D;
    }

    public float get_desert(){
        return D_sum;
    }

    public void total(){
        F_sum = get_entree()+get_appetizers()+get_desert();
        System.out.println("Got it!\n Okay.Your Total is "+ "$" + F_sum);
    }
}
