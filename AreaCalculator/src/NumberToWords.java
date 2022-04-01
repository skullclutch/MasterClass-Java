public class NumberToWords {

    public static void main(String[] args) {
        System.out.println(getDigitCount(123));
        System.out.println(reverse(123));
        numberToWords(123);
    }

    public static int getDigitCount(int number){
        int count = 0;
        if(number<0){
            return -1;
        }
        if(number == 0){
            return 1;
        }
        for(int i = 0; number > 0; i++){
            number/=10;
            count++;
        }
        return count;
    }

    public static int reverse(int num){
        int rev = 0;
        while (num!=0){
            rev = rev * 10 + num % 10;
            num = num / 10;
        }
        return rev;
    }

    public static void numberToWords(int number){
        if(number < 0){
            System.out.println("Invalid Value");
        }

        int count = getDigitCount(number);
        number = reverse(number);

        for(int i = 0; i < count; i++){
            int digit = number % 10;

            switch(digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    break;
            }
            number /= 10;
        }
    }
}
