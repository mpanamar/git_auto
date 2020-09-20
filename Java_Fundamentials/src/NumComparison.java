import java.util.Scanner;
// Java Fundamentals - Optional Task 1.2
public class NumComparison {
    public static void main(String[] args) {
        System.out.println("Enter values to be compared:");
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String longNum = "", shortNum = line;


        for (String s : line.split(" ")) {

            if (s.length() > longNum.length()) longNum = s;
            if (s.length() < shortNum.length()) shortNum = s;

        }
            System.out.println("The longest num: '" + longNum + "'");
            System.out.println("Length: " + longNum.length());
            System.out.println("The shortest num: '" + shortNum + "'");
            System.out.println("Length: " + shortNum.length());

        }

    }




