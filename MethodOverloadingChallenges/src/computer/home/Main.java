package computer.home;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static void main(String[] args) {
        System.out.println(getDurationString(60,45));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(long minutes, long seconds) {
        if ((minutes<0) || (seconds<0) || (seconds>59)) {
            return INVALID_VALUE_MESSAGE;
        }
        long hours = minutes/60;
        long remMinutes = minutes%60;
        String hoursString = hours + "h";
        if(hours<10) {
            hoursString = "0" + hoursString;
        }
        String minutesString = remMinutes + "m";
        if(remMinutes<10) {
            minutesString = "0" + minutesString;
        }
        String secondsString = seconds + "s";
        if(seconds<10) {
            secondsString = "0" + secondsString;
        }
        return hoursString + " " + minutesString + " " + secondsString + " ";
    }

    public static String getDurationString(long seconds) {
        if(seconds<0) {
            return INVALID_VALUE_MESSAGE;
        }
        long min = seconds/60;
        long restSecs = seconds % 60;
        return getDurationString(min,restSecs);
    }
}
