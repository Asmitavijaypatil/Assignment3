import java.util.Scanner;
public class Amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	System.out.print("Input: ");
   	int input = sc.nextInt();

	int a = input % 10; //3
   	int b = input / 10; //15
        int c = b % 10; //5
        int d = b / 10; //1

	if ((a*a*a)+(c*c*c)+(d*d*d) == input) {
	    System.out.println("Output: "+input+ " is an Amstrong number");
	} else {
	     System.out.println("Output: "+input+ " is not an Amstrong number");
	}
    }
}
	
	
 