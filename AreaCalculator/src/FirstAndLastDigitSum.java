public class FirstAndLastDigitSum {

    public static void main(String[] args) {

    }

    public static int sumFirstAndLastDigit(int number) {
        int sum = 0;
        int first = 0;
        int last = 0;
        if (number < 0) {
            return -1;
        } else
            last = number % 10;
        while (number != 0) {
            first = number % 10;
            number /= 10;
            sum = last + first;
        }
        return sum;
    }
}
