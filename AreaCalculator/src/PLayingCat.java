public class PLayingCat {


    public static boolean isCatPlaying(boolean summer, int temperature) {
        if(temperature>=25 && temperature<=35) {
            return true;
        } else if(!summer && temperature>35) {
            return false;
        } else if(summer && temperature>35 && temperature<=45) {
            return true;
        } else
            return false;
    }
}
