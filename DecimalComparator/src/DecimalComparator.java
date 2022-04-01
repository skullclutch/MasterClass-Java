public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double decimal1, double decimal2) {

        decimal1 = (int) (decimal1 * 1000);
        decimal2 = (int) (decimal2 * 1000);
        if(decimal1 == decimal2) {
            return true;
        }
        return false;
    }
}
