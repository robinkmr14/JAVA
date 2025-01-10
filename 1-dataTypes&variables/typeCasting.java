public class typeCasting {

    public static void main(String[] args) {
        
        //  Implicit Casting (Widening Conversion)**
        int num = 10;
        double realNumber = num;

        System.out.println(num);
        System.out.println(realNumber);


        // Explicit Casting (Narrowing Conversion)**
        double largeDecimal = 9.8;
        int wholeNumber = (int)largeDecimal;

        System.out.println(largeDecimal);
        System.out.println(wholeNumber);

    }
}