import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while(sc.hasNextInt()) {
            sum += sc.nextInt();
                count++;
        }
        System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum / count));
    }
}
