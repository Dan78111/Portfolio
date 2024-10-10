/**
 * SLCC COMP SCI 1400 Final Project- Bacciato's Cuisine
 * Class name~ Restaurant main
 * Ty Greenburg, Elijah Nelson, & Daniel Castillo
 **/
import java.util.Scanner;
import java.io.*;
import javax.swing.*;
import java.awt.*;
public class Restaurant{

    private Table[]tables;
    public Restaurant(){
        tables = new Table[10];
        for(int i=0;i<tables.length;i++){
            tables[i] = new Table(i);
        }
    }

    public int find_table(){
        for(int i=0;i < tables.length; i++){
            if(tables[i].getStatus() == false){
                return i;
            }
        }
        return -1;
    }

    public void empty_table(int e){
        tables[e].unoccupy();
    }

    public void print_tables()
    {
        for(int i=0;i < tables.length; i++){
            if(tables[i].getStatus() == false){
                System.out.println(tables[i]+" is available.");
            }else if(tables[i].getStatus() == true){
                System.out.println(tables[i] + " is full.");
            }

        }
    }

    public void getOrder(){
        Scanner scan = new Scanner(System.in);
        int a = find_table();
        System.out.println("Please enter how many people are going to be at this table "+a);
        int people = scan.nextInt();
        tables[a].setPeople(people);
        tables[a].takeOrders();
        tables[a].set_status(true);
    }

    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        Restaurant res = new Restaurant();
        boolean done = false;
        while(!done){
            System.out.println("Welcome to Bacciato Italian Cuisine!!!");
            //get menu input
            System.out.println("What would you like to do? \n 1. Come in and Order \n 2. Print Table Availability \n 3. Empty a Table \n 4. Quit program");

            int answer = scan.nextInt();
            if(answer == 1){
                System.out.println("Okay! Allow me to check if we have empty tables.");
                System.out.println("...");
                System.out.println("...");
                System.out.println("...");
                System.out.println("Please go to table number "+res.find_table());
                res.getOrder();
            }else if(answer == 2){
                res.print_tables();
            }else if(answer == 3){
                System.out.println("Which table would you like to empty? 0-9");
                int empty = scan.nextInt();
                res.empty_table(empty);
                System.out.println("Okay. Table " + empty + " is now available for clients");
            }else if(answer == 4){
                System.out.println("Thank you for coming to Bacciatio's. Program Ending");
                //Create a cool drawing :)
                
                JFrame win= new JFrame();
                win.setBounds(30,30,800,800);
                win.setDefaultCloseOperation(win.EXIT_ON_CLOSE);
                win.setLayout(null);
                
                Rectangle rec = new Rectangle(0,0,800,800);
                Triangle trig = new Triangle(30,750,400,15,800,750);
                Rectangle crust = new Rectangle(30,680,790,100);
                
                
                Color bread = new Color(183,139,67);
                Color peppe = new Color(202,0,42);
                Color greeen = new Color(107,142,35);
                crust.setBackground(bread);
                trig.setBackground(new Color(255,215,102));
                
                rec.setBackground(greeen);
                Oval pepperoni_one = new Oval(150,500,200,200);
                pepperoni_one.setBackground(peppe);
                
                Oval pepperoni_two = new Oval(300,200,200,200);
                pepperoni_two.setBackground(peppe);

                Oval pepperoni_three = new Oval(450,500,200,200);
                pepperoni_three.setBackground(peppe);
                
                
                
                win.add(rec,0);
                rec.add(trig,0);
                
                win.add(pepperoni_one,0);
                rec.add(pepperoni_two,0);
                win.add(pepperoni_three,0);
                rec.add(crust,0);
                
                win.repaint();
                win.setVisible(true);
                done = true;
            }else{
                System.out.println("Please enter a valid choice: 1-4");
            }
        }
    }
}
