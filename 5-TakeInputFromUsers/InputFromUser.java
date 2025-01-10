import java.util.Scanner;

public class InputFromUser {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Please Enter the Age");
        int age = scan.nextInt();

        System.out.println("The Age is: " +age);

    }
    
}
