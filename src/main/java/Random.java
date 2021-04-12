public class Random {
//example1

    public static boolean luggageWeight(int number) {
        if (number <= 0) {
            System.out.print("Invalid input");
            return false;
        }
        else if (number <= 30) {
            System.out.print("Pass");
            return true;
        }
        else {
            System.out.print("Your luggage is heavy");
            return false;
        }
    }
    //example2:

    public static boolean multiplyOfTen(int number) {
        if (number % 10 == 0) {
            System.out.print("It is a multiply of 10");
            return true;
        }
        else {
            System.out.print("It's not");
            return false;
        }

    }

    //example3:
    public static boolean faceControl(int age) {
        if (age >= 18) {
            System.out.print("Enter please");
            return true;
        }
        else if (age > 1) {
            System.out.print("Go home");
            return false;
        }
        else {
            System.out.print("Are you even born yet?");
            return false;
        }
    }
    //example4:
    public static boolean division(double a, double b) {
        if (b == 0) {
            System.out.print("Not accepted");
            return false;
        }
        else {
            System.out.print("Division successful");
            return true;
        }
    }
    //test
}
