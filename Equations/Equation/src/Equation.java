import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Equation {
    public static void Equation_Enter(String equation){

            Pattern pattern = Pattern.compile("([+-]?\\d*x\\^2)\\s*([+-]?\\d*x)\\s*([+-]?\\d+)\\s*=\\s*0");
            Matcher matcher = pattern.matcher(equation);

            if(matcher.find()){

                String ax1 = matcher.group(1);
                Double a1 = Derivative.Second(ax1);

                String bx = matcher.group(2);
                Double b1 = Derivative.First(bx);

                String c = matcher.group(3);
                Double c1 = Double.valueOf(c);

                if(a1 == 0 && b1 == 0 && c1 == 0){
                    System.out.println("Infinite solutions!!");
                }
                else if((a1 == 0 && b1 == 0 && c1 != 0) || ((b1 * b1 - 4 * a1 * c1) < 0)){
                    System.out.println("No solution!!");
                }

                else{
                    Double root1 = NewtonRaphson.newtonRaphson(a1, b1, c1, 0.0, 1e-6, 100);
                    Double root2 = NewtonRaphson.newtonRaphson(a1, b1, c1, 5.0, 1e-6, 100);

                    root1 = (Math.round(root1 * 10000.0)) / 10000.0;
                    root2 = (Math.round(root2 * 10000.0)) / 10000.0;

                    if(Objects.equals(root1, root2)){
                        if(Round.isInteger(root2) == true){
                            
                            System.out.println("Double solution x = " + root2.intValue());
                        
                        }
                        else{
                            System.out.println("Double solution x = " + root2);
                        }
                    }
                    else{   
                        if(Round.isInteger(root1) == true && Round.isInteger(root2) == false){
                            System.out.println("x1 = " + root1.intValue());
                            System.out.println("x2 = " + root2);
                        }
                        else if(Round.isInteger(root2) == true && Round.isInteger(root1) == false){
                            System.out.println("x1 = " + root1);
                            System.out.println("x2 = " + root2.intValue());
                        }
                        else if(Round.isInteger(root1) == true && Round.isInteger(root2) == true){
                            System.out.println("x1 = " + root1.intValue());
                            System.out.println("x2 = " + root2.intValue());
                        }
                        else{
                            System.out.println("x1 = " + root1);
                            System.out.println("x2 = " + root2);
                        }
                    }
                }
            }   
            else{

                System.out.println("Not a quadratic equation!!");

            }

        }
    
}
