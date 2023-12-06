import java.util.Scanner;
public class PeopleTravel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	System.out.println("Enter the total number of passengers: ");
   	int  p = sc.nextInt();

	int x = 50 * (p / 50);
        System.out.println("People Travelling: "+x);
   }
}