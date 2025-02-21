public class Derivative {
    public static Double dx = 0.0;

    public static Double Const(String a){
        
        return dx;
    }

    public static Double First(String ax){

        String result = ax.replace("x", "");
        
        if("".equals(result)){

            result = "1";
            dx = Double.valueOf(result);

        }
        else{

            dx = Double.valueOf(result);
        }

        return dx;
    }

    public static Double Second(String ax){

        String result = ax.replace("x^2", "");
        if("".equals(result)){
            result = "1";
            dx = Double.valueOf(result);
        }
        else{
            dx = Double.valueOf(result);
        }

        return dx;
    }

}
