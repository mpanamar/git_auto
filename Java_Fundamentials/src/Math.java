import java.util.Scanner;

// Java Fundamentals - Main Task 4
class Math {
    public static void main(String[] args ) {
        System.out.println("Enter integer values through Enter");
        int s = 0;
        int m = 1;
        while(true){
            Scanner scanner = new Scanner(System.in);
            String f = scanner.nextLine();
// Get result of calculations if value is not specified
            if(f.isEmpty()){
                break;
            }
            else{
                s = s + Integer.valueOf(f);
                m = m * Integer.valueOf(f);
            }
        }
        System.out.println("Sum is " + s);
        System.out.println("Multiplication is " + m);


    }
}

