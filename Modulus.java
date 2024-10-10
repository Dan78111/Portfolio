// Daniel Castillo SLCC Comp Sci 1400 7-Modulus
import java.util.Scanner;

public class Modulus
{
   public static void main(String[]args){
       
       Scanner scan =  new Scanner(System.in);
       
       System.out.println("Welcome to the calculator to know what day of the year it will be on a specific date. Please enter the month January-December:  ");
       
       String chosen_month = scan.nextLine();
       int month=0;
       if(chosen_month.equals("January")){
           month=1;
       }else if(chosen_month.equals("February")){
           month=2;
       }else if(chosen_month.equals("March")){
           month=3;
       }else if(chosen_month.equals("April")){
           month=4;
       }else if(chosen_month.equals("May")){
           month=5;
       }else if(chosen_month.equals("June")){
           month=6;
       }else if(chosen_month.equals("July")){
           month=7;
       }else if(chosen_month.equals("August")){
           month=8;
       }else if(chosen_month.equals("September")){
           month=9;
       }else if(chosen_month.equals("October")){
           month=10;
       }else if(chosen_month.equals("November")){
           month=11;
       }else if(chosen_month.equals("December")){
           month=12;
       }
       
       System.out.println("Please enter the day 1-31: ");
       
       int day = scan.nextInt();
       
       System.out.println("Please enter the full year:");
       
       int fullYear = scan.nextInt();
       
       int century = fullYear/100;
       int year = fullYear%100;
       
       if(month == 1){
           month = 13;
           year = year - 1;
       }else if(month == 2){
           
           month = 14;
           year = year - 1;
       }
       
       int x = (day + (13*(month + 1))/5 + year + year/4 +century/4 - 2 * century) % 7;
       
       if(x==0){
           
           System.out.println("it will be a Saturday." );
       }else if(x==1){
           
           System.out.println("it will be a Sunday." );
       }else if(x==2){
           
           System.out.println("it will be a Monday." );
       }else if(x==3){
           System.out.println("it will be a Tuesday." );
       }else if(x==4){
           System.out.println( "it will be a Wednesday." );
       }else if(x==5){
           System.out.println("it will be a Thursday." );
       }else if(x==6){
           System.out.println("it will be a Friday." );
       }
   }
}
