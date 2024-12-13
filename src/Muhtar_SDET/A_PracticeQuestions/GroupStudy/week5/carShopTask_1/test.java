package Muhtar_SDET.A_PracticeQuestions.GroupStudy.week5.carShopTask_1;

public class test {
    public static void main(String[] args) {


        try {
            te();
        } catch(Exception e) {

            System.out.println("---------------");
        }finally {
            System.out.println("finaly");
        }

    }
    public static void te(){
        throw new Error();
    }
}