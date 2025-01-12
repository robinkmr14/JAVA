class Test {

    void display(int a) {
        System.out.println("int: " + a);
    }

    void display(double a) {
        System.out.println("double: " + a);
    }

    void display(long a) {
        System.out.println("long: " + a);
    }

}

public class MethodOverloading {

    public static void main(String[] args) {

        Test obj = new Test();

        obj.display(10); // int: 10 (exact match)
        obj.display(10.5); // double: 10.5 (exact match)
        obj.display(10L); // long: 10 (exact match)
        obj.display('A'); // int: 65 (char promoted to int)
        obj.display(10.0f); // double: 10.0 (float promoted to double)
    }
}
