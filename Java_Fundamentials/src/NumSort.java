import java.util.Scanner;
import java.util.*;
import static java.util.Collections.*;
// Java Fundamentals - Optional Task 1.2
// Вывести числа в порядке возрастания (убывания) значений их длины.
class NumSort {
    public static void main(String[] args) {

        System.out.print("How many numerals are you going to input?");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        Integer[] sourceNumbers = new Integer[size];
        System.out.print("Enter integer values"
                + "and press <Enter>: ");
        for (int i = 0; i < size; i++) {
            sourceNumbers[i] = in.nextInt();
        }
        List<Integer> numbers = Arrays.asList(sourceNumbers.clone());
        sort(numbers);
        System.out.println("Sorted ascending: "
                + numbers);
        reverse(numbers);
        System.out.println("Sorted descending: "
                + numbers);


    }
}
