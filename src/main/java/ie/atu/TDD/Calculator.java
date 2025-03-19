package ie.atu.TDD;

public class Calculator {
    public int add(int firstNum, int secondNum) {
        long sum = (long)firstNum + secondNum;
        if(sum > Integer.MAX_VALUE){
            throw new IllegalArgumentException("Value is Too Large");
        }
        return (int)sum;
    }

    public int subtract(int firstNum, int secondNum) {
        long sum = (long)firstNum - secondNum;
        if(sum < 0){
            throw new IllegalStateException("Cannot be negative result");
        }
        return (int)sum;
    }

    public int multiply(int firstNum, int secondNum) {
        long sum = (long)firstNum * secondNum;
        if(sum> Integer.MAX_VALUE){
            throw new UnsupportedOperationException("Value is too Large");
        }
        return (int)sum;
    }

    public int divide(int firstNum, int secondNum) {
        long sum = (long)firstNum / secondNum;
        if(firstNum == 0){
            throw new ArithmeticException("/ by zero");
        } else if (secondNum == 0) {
            throw new ArithmeticException("/ by zero");
        }
        return (int)sum;
    }
}
