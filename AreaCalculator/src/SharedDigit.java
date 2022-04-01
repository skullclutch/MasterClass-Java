public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(100, 10));
    }

    public static boolean hasSharedDigit(int num, int digit) {
        if ((num < 10) || (num > 99) || (digit < 10) || (digit > 99)) {
            return false;

        } else if ((num >= 10) || (num <= 99) || (digit >= 10) || (digit <= 99)) {
            for (int i = num; i > 0; i /= 10) {
                for (int j = digit; j > 0; j /= 10) {
                    if (i % 10 == j % 10) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
