package ci.perform.kata.fizzbuzz;

public class FizzBuzz {

    /*
    Write a program that prints the numbers from 1 to 100.
    But for multiples of three(3) print “Fizz” instead of the number and for the multiples of five(5) print “Buzz”.
    For numbers which are multiples of both three(3) and five(5) print “FizzBuzz”
     */
    public String generate(int min, int max) {
        StringBuilder result = new StringBuilder();
        String divideResult = "";
        for (int number = min; number <= max; number++)
        {
            divideResult = "";
            result.append(retreivex(number, divideResult));
        }
        return result.toString();
    }


  /*  public String generateX(int min, int max) {
        String result = "";
        for (int number = min; number <= max; number++)
        {
            result += retreive(number);
        }
        return result;
    }


    private String retreive(int number) {
        String temp = "";
        if (number % 3 == 0)
            temp += "Fizz";
        if (number % 5 == 0)
            temp += "Buzz";
        if (number % 7 == 0)
            temp += "Sitou";
        return temp.isEmpty() ? String.valueOf(number) : temp;
    }*/

    private String retreivex(int number, String previousResult) {
        Divider dividers = Divider.link(new DividedBy3(), new DividedBy5(), new DividedBy7(), new NoDivide());
        return dividers.divide(number, previousResult);
    }

    abstract class Divider {

        private Divider next;

        abstract String divide(int number, String previousValue);

        static Divider link(Divider first, Divider... chains) {
            Divider head = first;
            for (Divider nextDivider : chains)
            {
                head.next = nextDivider;
                head = nextDivider;
            }
            return first;
        }

        String retrieve(int number, String previousValue) {
            return next.divide(number, previousValue);
        }
    }

    class DividedBy3 extends Divider {

        @Override
        String divide(int number, String previousValue) {
            String divideBy3 = number % 3 == 0 ? previousValue + "Fizz" : previousValue;
            return retrieve(number, divideBy3);
        }
    }

    class DividedBy5 extends Divider {

        Divider next;

        @Override
        String divide(int number, String previousValue) {
            String divideBy5 = number % 5 == 0 ? previousValue + "Buzz" : previousValue;
            return retrieve(number, divideBy5);
        }
    }

    class DividedBy7 extends Divider {

        Divider next;

        @Override
        String divide(int number, String previousValue) {
            String divideBy7 = number % 7 == 0 ? previousValue + "Sitou" : previousValue;
            return retrieve(number, divideBy7);
        }
    }

    class NoDivide extends Divider {

        @Override
        String divide(int number, String previousValue) {
            return previousValue.isEmpty() ? "" + number : previousValue;
        }
    }
}


