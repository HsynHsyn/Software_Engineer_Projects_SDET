package Java_Labs.TheWeek11;

public class Task1_XyBalance1 {

    public static void main(String[] args) {

        System.out.println(xyBalance("aaxbbyx"));

    }
    public static boolean xyBalance(String str){

        if( str.contains("x") && str.contains("y")) {

            if (str.lastIndexOf("x") > str.lastIndexOf("y")) {
                return false;
            }else {
                return true;
            }

        }
        return false;
    }

}


/*
We'll say that a String is xy-balanced if for all the 'x' chars in the string,
there exists a 'y' char somewhere later in the string. So "xxy" is balanced,
but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.


xyBalance("aaxbby") → true
xyBalance("aaxbb") → false
xyBalance("yaaxbb") → false
 */

/*
java public boolean xyBalance(String str) {

  if(!str.contains("x") && !str.contains("y")) {
    return true;
  }

  if(str.lastIndexOf("y")>str.lastIndexOf("x")) {

    return true;
  }return false;
}
 */