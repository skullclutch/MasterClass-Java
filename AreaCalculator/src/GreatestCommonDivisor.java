public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        //GCD Logic :
        // 30 - 12 = 18
        // 18 - 12 = 6
        // 12 - 6 = 6
        // 6 == 6 -> Greatest Common Divisor

        while (first != second) {
            if (first > second) {
                first = first - second;
            } else {
                second = second - first;
            }
        }
        return first;
    }
}
