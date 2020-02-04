package exercise.SwordRefersToOffer;

public class BinaryOperation {

    public int NumberOf1(int n) {
        return Integer.toBinaryString(n).replaceAll("0","").length();
    }

}
