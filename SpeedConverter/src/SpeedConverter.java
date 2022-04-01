public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        double XX = kilometersPerHour;

        if(kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
          long YY = toMilesPerHour(XX);
            System.out.println(XX + " km/h = " + YY + " mi/h");
        }
    }
}
