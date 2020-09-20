import java.util.Scanner;
// Java Fundamentals - Main Task 1
public class Username {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter username");
        String name = in.nextLine();
        System.out.println("Hello " + name + "!");
        in.close();

    }
}


