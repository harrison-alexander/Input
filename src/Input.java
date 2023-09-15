import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int intOne, intTwo;
        double doubleOne ;
        float floatOne ;

        System.out.print("Enter integer one :: ");
        intOne = keyboard.nextInt();

        System.out.print("Enter integer two :: ");
        intTwo = keyboard.nextInt();

        System.out.println("integer one = " + intOne);
        System.out.println("integer two = " + intTwo);

        System.out.print("Enter double one :: ");
        doubleOne = keyboard.nextInt();
        System.out.print("Enter float one :: ");
        floatOne = keyboard.nextFloat();

        System.out.print("float one = " + floatOne);
        System.out.print("double one =" + doubleOne);

        //add more code here for the other variables and data types
        }
    }