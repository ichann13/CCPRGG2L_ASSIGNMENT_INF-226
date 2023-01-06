import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        // Java program to check if a student number is valid
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter student email: ");
        String studentEmail = scan.nextLine();

        // Long method
        Pattern pattern = Pattern.compile("\\w+@students.national-u.edu.ph");
        Matcher matcher = pattern.matcher(studentEmail);

        boolean match = matcher.matches();

        if (match) {
            System.out.println("valid student email");
        } else {
            System.out.println("invalid student email");
        }

        // Short method
        match = Pattern.compile("\\w+@students.national-u.edu.ph").matcher(studentEmail).matches();

        if (match) {
            System.out.println("valid student email");
        } else {
            System.out.println("invalid student email");
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        String Phonenumber = scan.nextLine();

        // Long method
        Pattern patterns = Pattern.compile("\\+63+\\d{10}");
        Matcher matched = pattern.matcher(Phonenumber);

        boolean matchers = matcher.matches();

        if (match) {
            System.out.println("valid number");
        } else {
            System.out.println("invalid number");

        }

        Scanner scans = new Scanner(System.in);
        System.out.print("Enter Birthdate: ");
        String Birthdate = scan.nextLine();

        // Long method
        Pattern patternd = Pattern.compile("\\+63+\\d{10}");
        Matcher matchedds = pattern.matcher(Phonenumber);

        boolean matcherds = matcher.matches();

        if (match) {
            System.out.println("valid Birthdate");
        } else {
            System.out.println("invalid Birthdate");
        }

              
        }
    }
