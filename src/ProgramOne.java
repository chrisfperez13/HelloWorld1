import java.util.Scanner;
public class ProgramOne {
    public static void main(String[] args) {
        int day = 7;
        Scanner input = new Scanner(System.in); //System.in is a standard input stream.
        System.out.print("Enter number of weeks: ");
        int num = input.nextInt();
        System.out.println(num * 7 + " days");
        System.out.println(num * 10080+" Minutes");
        System.out.println(num * 168+" Hours");
        System.out.println(num * 604800+" seconds");
    }
}
