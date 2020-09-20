import java.util.Scanner;
// Java Fundamentals - Main Task 2
//Отобразить в окне консоли аргументы командной строки в обратном порядке.
public class Backwards {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word to be reversed");
        StringBuilder back = new StringBuilder(in.nextLine());
        back.reverse();
        System.out.println(back.toString());
    }
}