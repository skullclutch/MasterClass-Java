public class FlourPackProblem {

    /*Write a method named canPack with three parameters of type int named bigCount,
    smallCount, and goal. The parameter bigCount represents the count of big flour
    bags(5 kilos each). The parameter smallCount represents the count of small flour
    bags(1 kilo each). The parameter goal represents the goal amount of kilos of flour
    needed to assemble a package. Therefore, the sum of the kilos of bigCount and smallCount
    must be at least equal to the value of goal. The method should return true if it is
    possible to make a package with goal kilos of flour. If the sum is greater than goal,
    ensure that only full bags are used towards the goal amount. It is okay if there are
    additional bags left over. For example, if goal = 9, bigCount = 2, and smallCount = 0,
    the method should return false since each big bag is 5 kilos and cannot be divided. If
    any of the parameters are negative return false.
     */

    public static void main(String[] args) {
        System.out.println(canPack(0,5,6));
    }

    public static boolean canPack(int bigCount,int smallCount,int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }
        if(bigCount * 5 <= goal){
            return (goal - (bigCount * 5) <= smallCount);
        } else
            return (goal % 5 <= smallCount);
    }
}
