import java.util.Scanner;

public class MinimumAndMaximum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
//        boolean first = true;

        while (true){
            System.out.println("Enter a number:");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){

                int number = scanner.nextInt();

//                if(first){
//                    first = false;
//                    min = number;
//                    max = number;
//                }

                if(number > max){
                    max = number;
                }

                if (number < min){
                    min = number;
                }

            } else{
                break;
            }
            scanner.nextLine(); //handle input
        }
        System.out.println("Min = " + min + ", Max = " + max);
        scanner.close();
    }
}
