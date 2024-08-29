package Java_Labs.TheWeek11;

public class Bat13_Task1_XyBalance {

    public static void main(String[] args) {

        System.out.println(xyBalance("aaxbbyx"));

    }
    public static boolean xyBalance(String str){

        if( !str.contains("x") && !str.contains("y")){
            return true;
        }
        if (str.length()==1 && str.contains("y")){
            return true;
        }
        if( str.contains("x") && str.contains("y")) {

            if (str.lastIndexOf('x') > str.lastIndexOf("y")) {
                return false;
            }else {
                return true;
            }

        }

        return false;
    }

}

/*
// //solution1
  // boolean match= false;

  // //step1
  // if(str.contains("x") && str.contains("y")){

  //   if(str.lastIndexOf('y') > str.lastIndexOf('x') ){
  //     match=true;
  //   }
  // }

  // //step2
  // if(!str.contains("x") && !str.contains("y")){
  //   match=true;
  // }

  // //step3
  // if(str.length()==1 && str.contains("y")){
  //   match=true;
  // }

  // return match;

  // //solution2

  // return(str.lastIndexOf('y')> str.lastIndexOf('x')  || !str.contains("x")&& !str.contains("y"));

  // //solution3

  // return(str.lastIndexOf('y')> str.lastIndexOf('x')  || !str.contains("x"));

  // //solution4

  // //return  str.lastIndexOf('y')> str.lastIndexOf('x');
  // return ! (str.lastIndexOf('y')< str.lastIndexOf('x'));


  //solution

  return  str.lastIndexOf('y')  >=  str.lastIndexOf('x');
 */ //second solution arthur


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