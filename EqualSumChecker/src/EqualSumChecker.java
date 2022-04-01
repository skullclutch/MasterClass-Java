public class EqualSumChecker {

    public static boolean hasTeen(int one, int two, int three) {
        if(one<=19 && one>=13 || two<=19 && two>=13 || three<=19 && three>=13) {
            return true;
        } else
            return false;
    }

    public static boolean isTeen(int one) {
        if(one<=19 && one>=13) {
            return true;
        } else
            return false;
    }
}
