package computer.home;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
//	    int value=3;
//        if(value==1){
//            System.out.println("Value was 1");
//        }else if(value==2){
//            System.out.println("Value was 2");
//        }else{
//            System.out.println("Was not 1 or 2");
//        }

        int switchValue=3;
        switch(switchValue){
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        int Value=3;
        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + Value);
            }
            default -> System.out.println("Was not 1 or 2");
        }

        char charValue ='D';
        switch (charValue){
            case 'A' -> System.out.println("Value was A");
            case 'B' -> System.out.println("Value was B");
            case 'C' -> System.out.println("Value was C");
            case 'D' -> System.out.println("Value was D");
            case 'E' -> System.out.println("Value was E");
            default -> System.out.println("Value not found");
        }

        String month = "januArY";
        switch (month.toUpperCase()) {
            case "JANUARY" -> System.out.println("jan");
            case "JUNE" -> System.out.println("June");
            default -> System.out.println("Cannot find month");
        }
    }
}
