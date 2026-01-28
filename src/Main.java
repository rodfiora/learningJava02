//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

class MathUtils {
    public static int power2(int x) {
        return x * x;
    }
}
class ArrayDemo {
    public static int sumVector(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value for x: ");
        int x =sc.nextInt();
        System.out.println("x = " + x);

        int j = 0;
        int[] numbers = new int[4];

        for (int i = x; i <= x+3; i++, j++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            //System.out.println("i = " + i);
            numbers[j] = i;
            System.out.println("vector position " + j +" has value = "+ numbers[j]);
        }
        System.out.println("sum of all positions = " + ArrayDemo.sumVector(numbers));
        System.out.println("x^2= " + MathUtils.power2(x));

    }
}
