package Saturday_Reviews.week12_review;

public class test {

    public static void main(String[] args) {


        System.out.println(isPerfectSquare02(25));

        System.out.println(isPerfectSquare02(59));
    }

    public static boolean isPerfectSquare02(double n){

        int x=1;


        for (int i = 0; i <=n; i++) {

            if (!((n == x * x) && x!=1)){
                x++;

            }


        }

        if (x * x == n){
            return true;
        }


        return false;
    }
}

/*
public static void main(String[] args) {

        System.out.println(isPerfectSquare01(49));
        System.out.println(isPerfectSquare02(49));
        System.out.println(isPerfectSquare01(85));
        System.out.println(isPerfectSquare02(85));

    }

    // using ready Math.srt()
    public static boolean isPerfectSquare01(double n){
        int root = (int) Math.sqrt(n);
        System.out.println("root = " + root);
        return root * root == n;
    }

    /* not using Math library
    * 49  - input
    * 1 * 1 = 1
    * 2 * 2 = 4
    * ....
    * 7 * 7 = 49 - result
    * if input == result
    *
public static boolean isPerfectSquare02(int input){ // 49
    int root = 1;
    int result = 1;
    while (result < input){
        result = root * root;
        System.out.println("DEBUG: " + root + " " + result );
        root++;
    }
    return result == input;
}
 */