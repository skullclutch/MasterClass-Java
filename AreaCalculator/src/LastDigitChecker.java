public class LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(9, 99, 19));
        System.out.println(isValid(1051));
    }

    public static boolean hasSameLastDigit(int num, int digit, int inty) {
        if ((isValid(num)) && (isValid(digit)) && (isValid(inty))) {
            return ((num % 10 == digit % 10) || (num % 10 == inty % 10) || (digit % 10 == inty % 10));
        } else {
            return false;
        }
    }

    public static boolean isValid(int numDigit) {
        return((numDigit>=10) && (numDigit<=1000));
    }
}
