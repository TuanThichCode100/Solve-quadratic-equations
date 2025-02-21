import java.util.Scanner;

public class Solve {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) throws InterruptedException {

        try (Scanner input = new Scanner(System.in)) {

            OUTER:
            while (true) {

                System.out.print("Enter a quadratic equation: ");
                String equation = input.nextLine();
                String RealEquation = SpaceRemove.Remove(equation);
                Equation.Equation_Enter(RealEquation);

                System.out.println("Equation solve completely!!");

                System.out.println("Do you want to solve more equations?? (Y or N)");
                String ans = input.nextLine().trim().toUpperCase();

                switch (ans) {
                    case "N" -> {

                        System.out.println("Thanks for using me!!");
                        System.out.print("Shutting down");
                        
                        for(int dot = 0; dot < 3; dot++){

                            Thread.sleep(800);
                            System.out.print(".");

                            
                        }

                        break OUTER;

                    }

                    case "Y" -> {
                        break;
                    }

                    default -> {
                        System.out.println("You chose what? Choose again!");
                    }
                }
            }
        }
    }
}
