public class NewtonRaphson {
    public static double newtonRaphson(double a, double b, double c, double x0, double tol, int maxIter) {
        double x = x0; 
        int iter = 0;

        while (iter < maxIter) {
            double fx = a * x * x + b * x + c; // f(x)
            double dfx = 2 * a * x + b; // f'(x)

            if (Math.abs(dfx) < 1e-12) {
                System.out.println("Non-convergence!!");
                return Double.NaN;
            }

            double xNew = x - (fx / dfx); // Công thức Newton-Raphson

            if (Math.abs(xNew - x) < tol) {
                return xNew;
            }

            x = xNew;
            iter++;
        }

        return Double.NaN;
    }
}
