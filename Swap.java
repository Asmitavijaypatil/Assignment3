import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	System.out.print("Input: ");
   	int input = sc.nextInt();

	int digit1st = input / 100;
 	int digit2nd = input % 100;
	
	int output = (digit2nd*100) + digit1st;
	System.out.println("Output: "+output);
    }
}

	