package computer.home;

public class Main {

    public static void main(String[] args) {
//	    int count = 1;
//        while(count!=6) {
//            System.out.println("Count value is " +count);
//            count++;
//        }
//
//        for(count = 1; count<6; count++) {
//            System.out.println("Count value is " +count);
//        }
//
//        count = 1;
//        while(true) {
//            if(count==5){
//                break;
//            }
//            System.out.println("Count value is " +count);
//            count++;
//        }
//        count=1;
//        do {
//            System.out.println("Count value was " +count);
//            count++;
//        }while (count!=6);
//
//
//        int ct = 0;
//        int n = 2;
//        int finishNumber = 200;
//
//        while(n<=finishNumber) {
//            n++;
//            if(!isEvenNumber(n)){
//                continue;
//            }
//            if(ct==15){
//                break;
//            }
//            System.out.println("Even number " + n);
//            ct++;
//        }
//        System.out.println("Total number of even numbers found was : " +ct);

//        int keepTrack = 0;
//        while(keepTrack<=5) {
//            System.out.println("keepTrack = " + keepTrack);
//            keepTrack++;
//        }
//
//        for(int i = 0; i <= 5; i++) {
//            System.out.println("i = " + i);
//        }
//
//        int nums = 0;
//        while(nums<15) {
//            nums++;
//
//            if(nums<=5) {
//                System.out.println("skipping number "+ nums);
//                continue;
//            }
//
//            System.out.println("number = " + nums);
//
//            if(nums>=10) {
//                System.out.println("Breaking at " + nums);
//                break;
//            }
//        }

        System.out.println("The sum of the digits in number 125 is " +sumDigits(125));
        System.out.println("The sum of the digits in number -125 is " +sumDigits(-125));
        System.out.println("The sum of the digits in number 4 is " +sumDigits(4));
        System.out.println("The sum of the digits in number 32123 is " +sumDigits(32123));
    }

    public static int sumDigits(int number) {
        // method to sum each digit of inputted number while inputted number is greater than 10
        // if number inputted is less than 10, we will get a return value of -1
        // ex. inputted number = 125
        // program will take each digit and all them together
        // 1 + 2 + 5 = 8
        if (number < 10) { // if inputted number is less than 10 return -1
            return-1;
        }
        int sum=0; // variable for sum of all digits of inputted number
        // 125 -> 125/10=12 -> 12*10=120 -> 125-120=5
        while(number>0){
            // extract least significant digit
            int digit = number%10;
            // add digit to our sum variable
            sum+=digit;
            // drop least significant digit
            number/=10; // same as number = number /10;
        }
        return sum; // returning sum of all digits from inputted number
    }

    public static boolean isEvenNumber(int n){
        return n % 2 == 0;
    }


    }


