public class SumAllDigits {

    public static void main(String[] args) {
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
}
