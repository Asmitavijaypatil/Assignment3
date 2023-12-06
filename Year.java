import java.util.Scanner;
public class Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	System.out.print("Input: ");
   	int input = sc.nextInt();

	int year = input / 365;
        int remaindays = input % 365 ;

        int month = remaindays / 30;
        remaindays = remaindays % 30 ;

        int week = remaindays / 7;
        int Days = remaindays % 7;

	System.out.println("Output: "+ year + "Years: " + month + "Months: " + week + "Weeks: " + Days + "Days" );
   }
}