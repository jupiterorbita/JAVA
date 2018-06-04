import java.lang.Math;
public class Pythagorean{
    public double calcucateHypotenuse(int legA, int legB){
        double result = Math.sqrt(Math.pow(legA, 2) + Math.pow(legB, 2) );
        result = Math.round(result * 100.0) / 100.0;
        return result;
    }
}