import java.util.Scanner;

public final class MainClass {
    private MainClass() {

    }

    /**
     * @param args
     */

    public static void main(final String[] args) {
        System.out.println("This is basic calculator");
        ImplementationOfMain cal = new ImplementationOfMain();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any two numbers");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        cal.addition(num1, num2);
        cal.subtraction(num1, num2);
        cal.multiplication(num1, num2);
        cal.division(num1, num2);


    }
}