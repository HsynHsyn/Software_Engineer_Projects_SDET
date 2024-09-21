package Muhtar_SDET.Day43_CollectionsAndMaps.functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionalInterfaceFunction {
    // takes one argument(any object) and return a value (any object)
    //public interface Function<T, R>
    //apply(T t); method

    public static void main(String[] args) {

        /*
        Burada a:
        arrayToList fonksiyonunun parametresidir.
        a ile fonksiyon içine bir int[] dizisi geldiğinde, bu dizi üzerinde işlem yapar.
        for (int each : a) döngüsü, a dizisindeki her bir elemanı each değişkenine atar ve bu elemanları result listesine ekler.
        Daha açık bir ifadeyle:

        a, fonksiyonun çalıştırıldığı anda geçirilen int[] dizisini temsil eder. Örneğin, nums dizisini arrayToList.apply(nums)
         şeklinde fonksiyona uyguladığınızda, a bu nums dizisini ifade eder.
        a içindeki her bir eleman, result adlı listeye eklenir ve sonrasında bu liste döndürülür.
        Yani, a, fonksiyonun çalışması sırasında diziyi ifade eder ve bu dizi üzerinde işlemler yapılır.
         */

        Function<int[], List<Integer>> arrayToList =  a -> {
            List<Integer> result = new ArrayList<>();
            for (int each : a) {
                result.add(each);
            }
            return result;
        };

        int[] nums = {1,2,3,4,6,8};

        /*
        arrayToList.apply(nums) ifadesi, nums dizisini alır ve arrayToList
        fonksiyonunu kullanarak bu diziyi bir List<Integer> türündeki listeye dönüştürür.
         */

        List<Integer> list = arrayToList.apply(nums);

        System.out.println(list);



    }
}
