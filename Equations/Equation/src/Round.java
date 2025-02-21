public class Round {
    public static boolean isInteger(double root){
        return Math.round(root * 1000.0) / 1000.0 == (int) root;
    }
}
