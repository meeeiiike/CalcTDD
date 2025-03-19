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
        if(sum < Integer.MIN_VALUE){
            throw new IllegalArgumentException("Value is too Small");
        }
        return (int)sum;
    }

    public int multiply(int firstNum, int secondNum) {
        long sum = (long)firstNum * secondNum;
        if(sum> Integer.MAX_VALUE){
            throw new IllegalArgumentException("Value is too Large");
        }
        return (int)sum;
    }
}
