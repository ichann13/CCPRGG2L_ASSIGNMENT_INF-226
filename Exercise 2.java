import java.util.Scanner;

public class Lesson {


    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        Driving("Practice driving!");
        scan.close();

    }

    static void Driving(String drive) {

        System.out.println("Driving Lesson Starting....");
        learn(drive);

        String feedback = getFeedBack(drive);

           // Define the base case / stopping condition

           if (feedback.equals("no")) {
             // Do something to reach the goal

             fixRequirement(drive);
             // Recursive call

            Driving(drive);

         } else if (feedback.equals("yes")) {

             youpass(drive);

         }

    }

    static void learn(String drive) {

        System.out.println("Practicing skills");
    }

    static String getFeedBack(String drive) {

        System.out.println("Did i " + drive + " passed? (Enter \"yes\" or \"no\")");

        String feedback = scan.next();
        return feedback;

    }
    static void fixRequirement(String drive) {

        System.out.print("Enter needed requirements to pass:");

        scan.nextLine();
        String requirement = scan.nextLine();
        System.out.println("Fixing requirements. Added " + requirement);

    }

    static void youpass(String drive) {

        System.out.println("Exam Passed " + drive);

    }



}