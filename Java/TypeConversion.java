package Java;

public class TypeConversion {
    // We have two types of Type conversion -- Narrowing and Widening

    // byte -> short -> int -> long -> float -> double  From smaller to larger 

    public static void main(String[] args) {


        // --- Narrowing Type casting ---- Whenever we are converting a larger data type to smaller

        double d = 19.5;
        System.out.println(d);
        int i = (int) d;
        System.out.println(i);



        double d1 = 3.147;
        byte b1 = (byte)d1;

        System.out.println(b1);

        

        // Widening Type casting ---- Whenever we convert a smaller data type to larger

        int x = 23;
        double y = x;

        System.out.println(y);

    }

    //

}
