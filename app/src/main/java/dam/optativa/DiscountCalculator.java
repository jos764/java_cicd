package dam.optativa;

public class DiscountCalculator {

    public static double calculate(double price, boolean isStudent) {

      if (isStudent) {
        return price * 0.2;
      }else{
        return price * 0.05;
      }

        
    }
}
