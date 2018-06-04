public class FizzBuzz{
    public String fizzyBuzzy(int number){
        String Fizz = "Fizz";
        String Buzz = "Buzz";
        String FizzABuzz = "FizzBuzz";
        if (number % 3 == 0){
            return Fizz;
        }
        else if (number % 5 == 0){
            return Buzz;
        }
        else if (number % 3 == 0 && number % 5 ==0){
            return FizzABuzz;
        }
        else{
            return number;
        }
    }
}