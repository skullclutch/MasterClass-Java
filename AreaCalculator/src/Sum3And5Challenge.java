import java.util.ArrayList;

public class Sum3And5Challenge {

    public static void main(String[] args) {

        int count = 0;
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if (isDivisibleByThreeOrFive(i)) {
                count++;
                sum += i;
                System.out.println("Found number = " + i);
                if (count == 5) {
                    System.out.println("The sum of the numbers divisible by 3 and 5 are = " + sum);
                    break;
                }
            }
        }
    }


    public static boolean isDivisibleByThreeOrFive(int n) {
        if (n == 1) {
            return false;
        } else if ((n % 3 ==0) && (n % 5 ==0)) {
            return true;
        } else {
            return false;
        }
    }
}
