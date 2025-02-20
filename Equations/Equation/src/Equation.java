import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Equation {
    public static void Equation_Enter(){

        try (Scanner input = new Scanner(System.in)) {
            
            System.out.print("Enter a quadratic equation: ");
            String equation = input.nextLine();
            
            Pattern pattern = Pattern.compile("([+-]?\\d*x\\^2)\\s*([+-]?\\d*x)\\s*([+-]?\\d+)\\s*=\\s*0");
            Matcher matcher = pattern.matcher(equation);

            if(matcher.find()){

                String ax1 = matcher.group(1);
                Double a1 = Derivative.Second(ax1);

                String bx = matcher.group(2);
                Double b1 = Derivative.First(bx);

                String c = matcher.group(3);
                Double c1 = Derivative.Const(c);

                Double root1 = NewtonRaphson.newtonRaphson(a1, b1, c1, 0.0, 1e-6, 100);
                
                System.out.println("x1 = " + root1);

                Double root2 = NewtonRaphson.newtonRaphson(a1, b1, c1, 5.0, 1e-6, 100);

                System.out.println("x2 = " + root2);

            }   
            else{

                System.out.println("Not a quadratic equation!!");

            }

        }
    }
}
