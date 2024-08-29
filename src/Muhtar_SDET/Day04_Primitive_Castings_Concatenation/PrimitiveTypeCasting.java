package Muhtar_SDET.Day04_Primitive_Castings_Concatenation;

public class PrimitiveTypeCasting {
    public static void main(String[] args) {

        // -----------Implicit Casting---------------

        byte a = 15;

        short b = (short) a; // (short) short is not need
        System.out.println(b);

        int c = a; // implicit casting
        long d =3000L;
        float f = d; // implicit casting

        // -----------Explicit Casting--------------- have to to this manually

        int x =100;
        byte y= (byte)x; // it is right using
        short y1= (byte)x; // byte is shorter than short so we can use in here byte

        float z = 20.8F;
        short q = (short)z; // z= 20.8
        System.out.println(q); // q =20 q must be int value

        double n1 = 2.5;
        byte n2 = (byte)n1;
        short n3= (short)n1;

        int o= 100;
        double p= o;
        System.out.println(p); // 100.0




    }
}
