import java.util.Scanner;
// Java Fundamentals - Main Task 2
public class Backwards {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word to be reversed");
        StringBuilder back = new StringBuilder(in.nextLine());
        back.reverse();
        System.out.println(back.toString());
    }
}