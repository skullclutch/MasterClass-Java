public class ReverseString {

    public static void main(String[] args) {
        String myName = "Rowan";
        String reversedString = "";

        for(int i = myName.length() -1; i >= 0; i--) {
            reversedString += myName.charAt(i);
        }

        System.out.println(" The reversed string of " + myName + " is :" + reversedString);
    }

    public static String reversedString(String str) {
        String reverse = "";
        for (int i = str.length() -1; i>= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }
}
