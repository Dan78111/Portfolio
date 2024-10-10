// Daniel Castillo SLCC Comp Sci 1400

import java.util.Scanner;

public class DoubleEquations{

    public static void main(String[]args)
    {

        
        System.out.println("Welcome to the Quadratic Equation Calculator!");
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a: ");

        double numba = scan.nextDouble();

        System.out.println("Please enter b: ");

        double numbb = scan.nextDouble();

        System.out.println("Please enter c: ");

        double numbc = scan.nextDouble();

        double insideSquare = (Math.pow(numbb,2) - (4*numba*numbc));

        if( numba == 0){
            
            System.out.println("The answer is " + (-numbc/numbb) + " .");
        }else if(insideSquare < 0){
            
            System.out.println("The answer is an imaginary number");
        }else{
            
        

            double quadraticEquationPlus = (numbb + (Math.sqrt(insideSquare)))/(2*numba);

        double quadraticEquationNegative = (numbb - (Math.sqrt(insideSquare)))/(2*numba);
        
        System.out.println("Your quadratic equation result is "+ quadraticEquationPlus + " and " + quadraticEquationNegative + "."); 

        }
    }

}
